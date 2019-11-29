package com.sagas.actors.base;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.event.LoggingAdapter;

public interface BlueActor {
    ActorSystem getActorSystem();
    ActorRef getSender();
    ActorRef getSelf();
    LoggingAdapter getLogger();
    String getName();
}
