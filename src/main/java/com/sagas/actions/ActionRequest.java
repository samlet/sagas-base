package com.sagas.actions;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;

public class ActionRequest {
    private ByteString payload;
    private String actionName;

    public ActionRequest(String actionName, ByteString payload) {
        this.payload = payload;
        this.actionName = actionName;
    }

    public ActionRequest(String actionName) {
        this.actionName = actionName;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public ByteString getPayload() {
        return payload;
    }

    public void setPayload(ByteString payload) {
        this.payload = payload;
    }
}
