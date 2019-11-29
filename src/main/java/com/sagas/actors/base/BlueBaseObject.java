package com.sagas.actors.base;

import akka.actor.AbstractActor;
import akka.actor.ActorSystem;
import akka.japi.pf.ReceiveBuilder;
import com.google.common.collect.Lists;
import com.sagas.actors.base.BlueComponent;

import java.util.List;

public abstract class BlueBaseObject extends AbstractActor implements BlueActor {
    protected List<BlueComponent> componentInstances= Lists.newArrayList();
    protected List<Class<? extends BlueComponent>> components;

    public BlueBaseObject(List<Class<? extends BlueComponent>> components) {
        this.components=components;
    }

    protected ReceiveBuilder initReceiver(){
        ReceiveBuilder receiver= receiveBuilder();
        List<BlueComponent> insts=ComponentHelper.createComponents(this, components, receiver);
        this.componentInstances.addAll(insts);
        return receiver;
    }

    @Override
    public ActorSystem getActorSystem() {
        return getContext().getSystem();
    }

    @Override
    public String getName() {
        return getSelf().path().name();
    }
}
