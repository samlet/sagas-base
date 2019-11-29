package com.sagas.actors.bus;

import akka.actor.ActorSystem;
import akka.stream.Materializer;

public class BlueModule {
    protected ActorSystem system;
    protected Materializer materializer;
    public BlueModule(ActorSystem system, Materializer materializer){
        this.system=system;
        this.materializer=materializer;
    }
}

