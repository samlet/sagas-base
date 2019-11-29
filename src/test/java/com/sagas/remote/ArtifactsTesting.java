package com.sagas.remote;

import com.sagas.meta.model.BotMessage;
import com.sagas.meta.model.BotResponse;

public class ArtifactsTesting {
    public static void main(String[] args){
        ArtifactServant as=new ArtifactServant();
        BotMessage q= BotMessage.newBuilder()
                .setSender("samlet")
                .setMessage("i am greet")
                .build();
        BotResponse r=as.api().talk(q);
        System.out.println(r);
    }
}
