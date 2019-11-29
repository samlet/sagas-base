package com.sagas.actors.base;

import akka.actor.AbstractActor;
import com.sagas.actions.BlueAct;

public class CoEcho extends BlueComponent{
    public CoEcho(BlueActor actor) {
        super(actor);
    }

    @BlueAct(String.class)
    public void echo(String q){
        logger.info(q);
        tell("i'm fine");
    }
}

