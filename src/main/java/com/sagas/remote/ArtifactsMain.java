package com.sagas.remote;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sagas.actors.bus.BlueSrv;
import com.sagas.actors.bus.RabbitConnector;

public class ArtifactsMain {
    public static void main(String[] args) throws InterruptedException {
        final ActorSystem system = ActorSystem.create();
        final ActorMaterializer materializer=ActorMaterializer.create(system);
        Injector injector= Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                super.configure();
                bind(ActorSystem.class).toInstance(system);
                bind(Materializer.class).toInstance(materializer);
            }
        });

        BlueSrv srv=injector.getInstance(BlueSrv.class);
        srv.start();

        Thread.sleep(1000L);
        ActorRef obj=system.actorFor("akka://default/user/root/group/object-admin");
        obj.tell("hi", srv.printerActor);
    }
}
