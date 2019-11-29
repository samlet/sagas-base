package com.sagas.actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.sagas.actors.base.CommonData;

//#printer-messages
public class Printer extends AbstractActor {
    //#printer-messages
    static public Props props() {
        return Props.create(Printer.class, () -> new Printer());
    }

    //#printer-messages
    static public class Greeting {
        public final String message;

        public Greeting(String message) {
            this.message = message;
        }
    }
    //#printer-messages

    private LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

    public Printer() {
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Greeting.class, greeting -> {
                    log.info(greeting.message);
                })
                .match(DeviceManager.DeviceRegistered.class, msg -> {
                    log.info("** receive a device registered message from {}.", getSender().path());
                })
                .match(CommonData.ObjectRegistered.class, msg -> {
                    log.info("** receive a object registered message from {}.", getSender().path());
                })
                .match(String.class, greeting -> {
                    log.info("** {}", greeting);
                })
                .build();
    }
//#printer-messages
}
//#printer-messages
