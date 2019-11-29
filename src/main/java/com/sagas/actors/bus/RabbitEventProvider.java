package com.sagas.actors.bus;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Singleton
public class RabbitEventProvider {
    public static final String EXCHANGE_NAME = "entity_events";
    Channel channel = null;

    RabbitConnector connector;
    @Inject
    RabbitEventProvider(RabbitConnector connector) throws IOException {
        this.connector=connector;

        channel = connector.getConnection().createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
    }

    public void post(String topicName, String message) throws IOException {
        channel.basicPublish(EXCHANGE_NAME, topicName, null, message.getBytes(StandardCharsets.UTF_8));
        // System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");
    }

    public void post(String topicName, byte[] data) throws IOException{
        channel.basicPublish(EXCHANGE_NAME, topicName, null, data);
    }
}
