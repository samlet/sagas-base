package com.sagas.remote;

import com.google.protobuf.InvalidProtocolBufferException;
import com.sagas.actions.ActionRequest;
import com.sagas.actions.ActionResponse;
import com.sagas.actions.RemoteAction;
import com.sagas.meta.model.ArtifactServiceGrpc;
import com.sagas.meta.model.BotMessage;
import com.sagas.meta.model.BotResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.inject.Singleton;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Singleton
public class ArtifactServant {
    private static final Logger logger = Logger.getLogger(ArtifactServant.class.getName());

    private ManagedChannel channel;
    private ArtifactServiceGrpc.ArtifactServiceBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public ArtifactServant() {
        String host="localhost";
        int port=20051;
        init(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }

    /** Construct client for accessing HelloWorld server using the existing channel. */
    private void init(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = ArtifactServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public ArtifactServiceGrpc.ArtifactServiceBlockingStub api(){
        return this.blockingStub;
    }

    @RemoteAction
    public ActionResponse talk(ActionRequest request) throws InvalidProtocolBufferException {
        BotMessage query=BotMessage.parseFrom(request.getPayload());
        BotResponse response=this.blockingStub.talk(query);
        return new ActionResponse(0, response.toByteString());
    }
}

