package com.sagas.actors.base;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.japi.pf.ReceiveBuilder;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import com.google.common.collect.Lists;
import com.sagas.actions.ActionInvoker;
import com.sagas.actions.BlueAct;
import com.sagas.actions.RemoteAction;
import com.sagas.actors.Printer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class TestBlueAct {
    public void testBlueAct(){
        final ActorSystem system = ActorSystem.create();
        // final Materializer materializer = ActorMaterializer.create(system);

        final ActorRef printerActor =
                system.actorOf(Printer.props(), "printerActor");


        List<Class<?>> acts= Lists.newArrayList(CoEcho.class);
        ReceiveBuilder receiveBuilder=ReceiveBuilder.create();
        acts.forEach(meta ->{
            // Resolve 'type'.
            Class<?> runner=meta;
            try {
                // runner = Class.forName(meta.getClassName());
                // Object inst=injector.getInstance(runner);
                Constructor<?> constructor=runner.getConstructor(AbstractActor.class);
                Object inst=constructor.newInstance(printerActor);
                Method[] methods = runner.getMethods();
                for (Method method : methods) {
                    BlueAct annos = method.getAnnotation(BlueAct.class);
                    if (annos != null) {
                        String actionName=runner.getSimpleName()+"."+method.getName();
                        // invokerMap.put(actionName, new ActionInvoker(inst, method));
                        receiveBuilder.match(annos.value(), par->{
                            method.invoke(inst, par);
                        });
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        });
    }
}
