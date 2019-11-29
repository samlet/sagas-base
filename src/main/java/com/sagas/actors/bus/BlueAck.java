package com.sagas.actors.bus;

import com.rabbitmq.client.AMQP;

public class BlueAck {
    private long deliveryTag;
    private AMQP.BasicProperties replyProps;
    private String replyTo;
    private byte[] data;

    public BlueAck(long deliveryTag, AMQP.BasicProperties replyProps, String replyTo, byte[] data) {
        this.deliveryTag = deliveryTag;
        this.replyProps = replyProps;
        this.replyTo = replyTo;
        this.data = data;
    }
    public BlueAck(BlueAck ack, byte[] data) {
        this.deliveryTag = ack.getDeliveryTag();
        this.replyProps = ack.getReplyProps();
        this.replyTo = ack.getReplyTo();
        this.data = data;
    }

    public long getDeliveryTag() {
        return deliveryTag;
    }

    public AMQP.BasicProperties getReplyProps() {
        return replyProps;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public byte[] getData() {
        return data;
    }
}
