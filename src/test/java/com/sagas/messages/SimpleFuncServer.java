package com.sagas.messages;

import com.google.gson.Gson;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public class SimpleFuncServer {

  private static final String RPC_QUEUE_NAME = "rpc_queue_rs";
  private static final String TEST_TYPE="number";

  private static int fib(int n) {
    if (n ==0) return 0;
    if (n == 1) return 1;
    return fib(n-1) + fib(n-2);
  }

  public static void main(String[] argv) {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    Gson gson = new Gson();
    Connection connection = null;
    try {
      connection      = factory.newConnection();
      final Channel channel = connection.createChannel();

      channel.queueDeclare(RPC_QUEUE_NAME, false, false, false, null);
      channel.queuePurge(RPC_QUEUE_NAME);

      channel.basicQos(1);

      System.out.println(" [✔] Awaiting RPC requests");

      Consumer consumer = new DefaultConsumer(channel) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
          AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                  .Builder()
                  .correlationId(properties.getCorrelationId())
                  .build();

          String response = "";

          try {
            String message = new String(body,"UTF-8");
            if(TEST_TYPE.equals("number")){
              int n = Integer.parseInt(message);
              response += fib(n);
              System.out.println(".. response is "+response);
            }else {
              // int n = Integer.parseInt(message);
              Map values = gson.fromJson(message, Map.class);

              System.out.println(" [.] fib(" + message + ")");
              // response += fib(n);
              response += fib(((Double) values.get("n")).intValue());
            }
          }
          catch (RuntimeException e){
            System.out.println(" [.] " + e.toString());
          }
          finally {
            channel.basicPublish( "", properties.getReplyTo(), replyProps, response.getBytes("UTF-8"));
            channel.basicAck(envelope.getDeliveryTag(), false);
            // RabbitMq consumer worker thread notifies the RPC server owner thread
            /*
            synchronized(this) {
            	this.notify();
            }
            */
          }
        }
      };

      channel.basicConsume(RPC_QUEUE_NAME, false, consumer);
      // Wait and be prepared to consume the message from RPC client.
      /*
      while (true) {
      	synchronized(consumer) {
      		try {
      			consumer.wait();
      	    } catch (InterruptedException e) {
      	    	e.printStackTrace();	    	
      	    }
      	}
      }
      */

    } catch (IOException | TimeoutException e) {
      e.printStackTrace();
    }
    finally {
      /*
      if (connection != null)
        try {
          connection.close();
        } catch (IOException _ignore) {}
      */
    }
  }
}