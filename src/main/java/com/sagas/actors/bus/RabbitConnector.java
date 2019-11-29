package com.sagas.actors.bus;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
// import org.apache.ofbiz.base.util.Debug;

import javax.inject.Singleton;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Singleton
public class RabbitConnector {
    private static final String module = RabbitConnector.class.getName();
    private Connection connection = null;

    public RabbitConnector() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        try {
            this.connection = factory.newConnection();
        } catch (IOException | TimeoutException e) {
            // Debug.logFatal(e, e.getMessage(),module);
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
