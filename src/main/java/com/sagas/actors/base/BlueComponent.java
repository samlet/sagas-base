package com.sagas.actors.base;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public abstract class BlueComponent {
    protected LoggingAdapter logger;
    protected BlueActor actor;

    public BlueComponent(final BlueActor actor) {
        this.actor=actor;
        this.logger= actor.getLogger();
    }

    protected void tell(Object msg){
        actor.getSender().tell(msg, actor.getSelf());
    }
}

