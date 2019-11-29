package com.sagas.rpcs;

import com.google.common.collect.Maps;
import com.sagas.meta.model.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class CommonServices {
    private static final Logger logger = Logger.getLogger(CommonServices.class.getName());

    private Server server;

    public void start() throws IOException {
        /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new SysInfoImpl())
                .addService(new EntityServantImpl())
                .build()
                .start();
        logger.info(".. Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                CommonServices.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final CommonServices server = new CommonServices();
        server.start();
        server.blockUntilShutdown();
    }

    public static class SysInfoImpl extends SysInfoGrpc.SysInfoImplBase {
        @Override
        public void getSysInfo(InfoQuery request, StreamObserver<InfoMap> responseObserver) {
            InfoMap.Builder infoMap=InfoMap.newBuilder();
            Map<String,String> ctx= Maps.newHashMap();
            ctx.put("timestamp", String.valueOf(System.currentTimeMillis()));
            infoMap.putAllInfo(ctx);
            responseObserver.onNext(infoMap.build());
            responseObserver.onCompleted();
        }

        /*
        @Override
        public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        */
    }

    public static class EntityServantImpl extends EntityServantGrpc.EntityServantImplBase{

        @Override
        public void getEntityNames(InfoQuery request, StreamObserver<Names> responseObserver) {
            Names.Builder names=Names.newBuilder();
            names.addName("Test");
            responseObserver.onNext(names.build());
            responseObserver.onCompleted();
        }
    }
}