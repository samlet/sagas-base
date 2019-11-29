package com.sagas.actors.bus;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.rabbitmq.client.Channel;
import com.sagas.actors.DeviceManager;
import com.sagas.actors.base.CommonData;

public class MessageResponser extends AbstractActor {
    //#printer-messages
    static public Props props(Channel channel) {
        return Props.create(MessageResponser.class, () -> new MessageResponser(channel));
    }

    static public class Greeting {
        public final String message;

        public Greeting(String message) {
            this.message = message;
        }
    }

    private LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);
    private Channel channel;
    public MessageResponser(Channel channel) {
        this.channel=channel;
    }

    @Override
    public void preStart() {
        log.info("Responser started");
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Greeting.class, greeting -> {
                    log.info(greeting.message);
                })
                .match(String.class, greeting -> {
                    log.info("** {}", greeting);
                })
                .match(BlueAck.class, ack->{
                    channel.basicPublish("", ack.getReplyTo(), ack.getReplyProps(),
                            ack.getData());
                    channel.basicAck(ack.getDeliveryTag(), false);
                })
                .build();
    }
}