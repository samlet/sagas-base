package com.sagas.actors.bus;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import com.google.common.collect.Lists;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;
import com.sagas.actors.Greeter;
import com.sagas.actors.Printer;
import com.sagas.actors.base.BlueManager;
import com.sagas.actors.base.CommonData;
import com.sagas.meta.model.BlueMessage;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Singleton
public class BlueSrv extends BlueModule{

  private static final String RPC_QUEUE_NAME = "blue_queue";
  Connection connection = null;

  ActorRef responserActor;
  RabbitConnector rabbit;

  public ActorRef printerActor;
  ActorRef managerActor;

  @Inject
  public BlueSrv(ActorSystem system, Materializer materializer, RabbitConnector rabbit) {
    super(system, materializer);
    this.rabbit=rabbit;
  }

  private void initCommonActors(){
    printerActor =system.actorOf(Printer.props(), "printerActor");
    managerActor=system.actorOf(BlueManager.props(), "root");
    managerActor.tell(new CommonData.RequestTrackObject("group", "admin"), printerActor);
    managerActor.tell(new CommonData.RequestTrackObject("group", "user"), printerActor);
  }

  private void initBlueActors(){
    final ActorRef blueGreeter =
            system.actorOf(BlueGreeter.props(responserActor, Lists.newArrayList()), "blueGreeter");
  }

  public void start() {
    initCommonActors();

    // ConnectionFactory factory = new ConnectionFactory();
    // factory.setHost("localhost");

    try {
      // connection = factory.newConnection();
      connection=rabbit.getConnection();
      final Channel channel = connection.createChannel();

      channel.queueDeclare(RPC_QUEUE_NAME, false, false, false, null);
      channel.queuePurge(RPC_QUEUE_NAME);

      channel.basicQos(1);

      responserActor = system.actorOf(MessageResponser.props(channel), "responserActor");
      initBlueActors();

      System.out.println(" [✔] Awaiting blueprint requests");

      Consumer consumer = new DefaultConsumer(channel) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
          AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                  .Builder()
                  .correlationId(properties.getCorrelationId())
                  .build();

          try {
            BlueMessage message = BlueMessage.parseFrom(body);
            BluePacket pkt=new BluePacket(message,
                    new BlueAck(envelope.getDeliveryTag(), replyProps, properties.getReplyTo(), null));
            system.actorSelection(message.getActorPath()).tell(pkt, responserActor);

          } catch (RuntimeException e) {
            System.err.println(" [.] " + e.toString());
            e.printStackTrace();
          }
        }
      };

      channel.basicConsume(RPC_QUEUE_NAME, false, consumer);

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /*
  public void stop() {
    if (connection != null) {
      try {
        connection.close();
      } catch (IOException _ignore) {

      }
    }
    system.terminate();
  }
  */
}