package com.sagas.actors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;

public class DevicesMain {
    public static void main(String[] args) throws InterruptedException {
        final ActorSystem system = ActorSystem.create();
        final Materializer materializer = ActorMaterializer.create(system);

        final ActorRef printerActor =
                system.actorOf(Printer.props(), "printerActor");

        ActorRef groupActor = system.actorOf(DeviceGroup.props("group"));
        groupActor.tell(new DeviceManager.RequestTrackDevice("group", "device1"), printerActor);

        ActorRef managerActor=system.actorOf(DeviceManager.props());
        managerActor.tell(new DeviceManager.RequestTrackDevice("group", "device2"), printerActor);

        System.out.println("wait to exit ..");
        Thread.sleep(3000L);
        system.terminate();
    }
}
