package com.sagas.actors.bus;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;

public class BlueSrvMain {
    public static void main(String[] args) throws InterruptedException {
        ActorSystem system;
        Materializer materializer;
        system = ActorSystem.create();
        materializer = ActorMaterializer.create(system);
        RabbitConnector rabbitConnector=new RabbitConnector();

        BlueSrv srv=new BlueSrv(system, materializer, rabbitConnector);
        srv.start();

        Thread.sleep(1000L);
        ActorRef obj=system.actorFor("akka://default/user/root/group/object-admin");
        obj.tell("hi", srv.printerActor);
    }
}
