package com.sagas.actors.bus;

import com.sagas.meta.model.BlueMessage;

public final class BluePacket {
    private BlueMessage request;
    private BlueAck response;

    public BluePacket(BlueMessage request, BlueAck response) {
        this.request = request;
        this.response = response;
    }

    public BlueMessage getRequest() {
        return request;
    }

    public BlueAck getResponse() {
        return response;
    }
}
