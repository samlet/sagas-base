package com.sagas.actors.bus;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.sagas.actors.Printer;
import com.sagas.actors.base.BlueActor;
import com.sagas.actors.base.BlueBaseObject;
import com.sagas.actors.base.BlueComponent;
import com.sagas.meta.model.BlueOffer;

import java.util.List;

public class BlueGreeter extends BlueBaseObject {
  private final ActorRef responser;
  private LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  public BlueGreeter(ActorRef responser, List<Class<? extends BlueComponent>> components) {
    super(components);
    this.responser = responser;
  }

  static public Props props(ActorRef responser, List<Class<? extends BlueComponent>> components) {
    return Props.create(BlueGreeter.class, () -> new BlueGreeter(responser, components));
  }

  @Override
  public void preStart() {
    log.info("Blue Greeter started");
  }

  @Override
  public Receive createReceive() {
    return initReceiver()
        .match(BluePacket.class, x -> {
          BlueOffer bo= BlueOffer.newBuilder()
                  .setUser(getSelf().path().name())
                  .setOffer(System.currentTimeMillis())
                  .build();
          responser.tell(new BlueAck(x.getResponse(), bo.toByteArray()), getSelf());
        })
        .build();
  }

  @Override
  public LoggingAdapter getLogger() {
    return log;
  }
}

