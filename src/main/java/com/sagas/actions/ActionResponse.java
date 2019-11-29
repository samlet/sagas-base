package com.sagas.actions;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;

public class ActionResponse {
    /// 0 is success, else error
    private int code;
    /// if success, payload is response data, if fail, payload is [ErrorInfo]
    private ByteString payload;

    public ActionResponse(int code, ByteString payload) {
        this.code = code;
        this.payload = payload;
    }

    public ActionResponse(int code) {
        this.code = code;
    }


    public ByteString getPayload() {
        return payload;
    }

    public void setPayload(ByteString payload) {
        this.payload = payload;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
