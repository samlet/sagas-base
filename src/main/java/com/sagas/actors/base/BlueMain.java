package com.sagas.actors.base;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import com.sagas.actors.DeviceGroup;
import com.sagas.actors.DeviceManager;
import com.sagas.actors.Printer;
import com.sagas.actors.base.CommonData.RequestTrackObject;

public class BlueMain {
    public static void main(String[] args) throws InterruptedException {
        final ActorSystem system = ActorSystem.create();
        final Materializer materializer = ActorMaterializer.create(system);

        final ActorRef printerActor =
                system.actorOf(Printer.props(), "printerActor");

        /*
        ActorRef groupActor = system.actorOf(BlueObject.props("group"));
        groupActor.tell(new RequestTrackObject("group", "obj1"), printerActor);
        */

        ActorRef managerActor=system.actorOf(BlueManager.props(), "root");
        managerActor.tell(new RequestTrackObject("group", "obj1"), printerActor);
        managerActor.tell(new RequestTrackObject("group", "obj2"), printerActor);

        ActorRef obj=system.actorFor("akka://default/user/root/org-group/object-obj1");
        obj.tell("hi", printerActor);

        System.out.println("wait to exit ..");
        Thread.sleep(3000L);
        system.terminate();
    }
}
