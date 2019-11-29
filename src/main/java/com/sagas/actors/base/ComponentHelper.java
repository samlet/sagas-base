package com.sagas.actors.base;

import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.google.common.collect.Lists;
import com.sagas.actions.BlueAct;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class ComponentHelper {
    public static List<BlueComponent> createComponents(BlueActor actor,
                                                       List<Class<? extends BlueComponent>> components, ReceiveBuilder receiver) {
        List<BlueComponent> componentInstances = Lists.newArrayList();
        LoggingAdapter log=actor.getLogger();
        for (Class<? extends BlueComponent> runner : components) {// Resolve 'type'.
            // Class<?> runner=meta;
            try {
                // runner = Class.forName(meta.getClassName());
                // Object inst=injector.getInstance(runner);
                log.info(".. create component {} for object {}", runner.getSimpleName(), actor.getName());
                Constructor<? extends BlueComponent> constructor = runner.getConstructor(BlueActor.class);
                BlueComponent inst = constructor.newInstance(actor);
                Method[] methods = runner.getMethods();
                for (Method method : methods) {
                    BlueAct annos = method.getAnnotation(BlueAct.class);
                    if (annos != null) {
                        // String actionName = runner.getSimpleName() + "." + method.getName();
                        // invokerMap.put(actionName, new ActionInvoker(inst, method));
                        receiver.match(annos.value(), par -> {
                            method.invoke(inst, par);
                        });
                    }
                }
                componentInstances.add(inst);
            } catch (Exception e) {
                throw new RuntimeException("Cannot create component: " + e.getMessage(), e);
            }
        }
        return componentInstances;
    }
}
