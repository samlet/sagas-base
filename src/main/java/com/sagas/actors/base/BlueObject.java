package com.sagas.actors.base;

import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.google.common.collect.Lists;
import com.sagas.actions.BlueAct;
import com.sagas.actors.base.CommonData.RequestAllMeasures;
import com.sagas.actors.base.CommonData.RequestObjectList;
import com.sagas.actors.base.CommonData.RequestTrackObject;
import com.sagas.actors.bus.BluePacket;
import scala.concurrent.duration.FiniteDuration;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BlueObject extends BlueBaseObject {
    private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

    protected String groupId;
    protected ActorRef monitorActor;

    public BlueObject(String groupId, List<Class<? extends BlueComponent>> components) {
        super(components);
        this.groupId = groupId;
    }

    // #query-protocol

    protected final Map<String, ActorRef> objectIdToActor = new HashMap<>();
    protected final Map<ActorRef, String> actorToObjectId = new HashMap<>();

    public static Props props(String groupId, List<Class<? extends BlueComponent>> components) {
        return Props.create(BlueObject.class, () -> new BlueObject(groupId, components));
    }

    @Override
    public void preStart() {
        log.info("Object {} started", groupId);

        String objectId="monitor-"+groupId;
        log.info("Creating monitor object {}", objectId);
        this.monitorActor =
                getContext()
                        .actorOf(BlueMonitor.props(groupId, "main"), objectId);
        getContext().watch(monitorActor);
        // deviceActor.forward(trackMsg, getContext());
        // actorToObjectId.put(monitorActor, objectId);
        // objectIdToActor.put(objectId, monitorActor);
    }

    @Override
    public void postStop() {
        log.info("ObjectGroup {} stopped", groupId);
    }

    // #query-added
    protected void onTrackObject(RequestTrackObject trackMsg) {
        if (this.groupId.equals(trackMsg.groupId)) {
            ActorRef ref = objectIdToActor.get(trackMsg.objectId);
            if (ref != null) {
                ref.forward(trackMsg, getContext());
            } else {
                log.info("Creating blue object for {}", trackMsg.objectId);
                ActorRef childActor =
                        getContext()
                                .actorOf(BlueObject.props(trackMsg.objectId,
                                        Lists.newArrayList(CoEcho.class)),
                                        "object-" + trackMsg.objectId);
                getContext().watch(childActor);
                childActor.forward(trackMsg, getContext());
                actorToObjectId.put(childActor, trackMsg.objectId);
                objectIdToActor.put(trackMsg.objectId, childActor);
            }
        } else {
            log.warning(
                    "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
                    trackMsg.groupId,
                    this.groupId);
        }
    }

    protected void onObjectList(RequestObjectList r) {
        getSender().tell(new CommonData.ReplyObjectList(r.requestId, objectIdToActor.keySet()), getSelf());
    }

    protected void onTerminated(Terminated t) {
        ActorRef deviceActor = t.getActor();
        String deviceId = actorToObjectId.get(deviceActor);
        log.info("Blue actor for {} has been terminated", deviceId);
        actorToObjectId.remove(deviceActor);
        objectIdToActor.remove(deviceId);
    }
    // #query-added

    private void onAllMeasures(RequestAllMeasures r) {
        // since Java collections are mutable, we want to avoid sharing them between actors (since
        // multiple Actors (threads)
        // modifying the same mutable data-structure is not safe), and perform a defensive copy of the
        // mutable map:
        //
        // Feel free to use your favourite immutable data-structures library with Akka in Java
        // applications!
        Map<ActorRef, String> actorToDeviceIdCopy = new HashMap<>(this.actorToObjectId);

        getContext()
                .actorOf(
                        BlueGroupQuery.props(
                                actorToDeviceIdCopy,
                                r.requestId,
                                getSender(),
                                new FiniteDuration(3, TimeUnit.SECONDS)));
    }

    /**
     * Overload this method to process packet
     * @param packet
     */
    protected void onPacket(BluePacket packet){}

    @Override
    public Receive createReceive() {
        log.info(".. create receive");
        // #query-added
        // ReceiveBuilder receiver= receiveBuilder()
        ReceiveBuilder receiver= initReceiver()
                .match(RequestTrackObject.class, this::onTrackObject)
                .match(RequestObjectList.class, this::onObjectList)
                .match(Terminated.class, this::onTerminated)
                .match(BluePacket.class, this::onPacket)
                // ... other cases omitted
                .match(RequestAllMeasures.class, this::onAllMeasures);

        /*
        for (Class<? extends BlueComponent> runner : components) {// Resolve 'type'.
            // Class<?> runner=meta;
            try {
                // runner = Class.forName(meta.getClassName());
                // Object inst=injector.getInstance(runner);
                log.info(".. create component {} for object {}", runner.getSimpleName(), groupId);
                Constructor<? extends BlueComponent> constructor = runner.getConstructor(BlueActor.class);
                BlueComponent inst = constructor.newInstance(this);
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
                this.componentInstances.add(inst);
            } catch (Exception e) {
                throw new RuntimeException("Cannot create component: "+e.getMessage(), e);
            }
        }
        */

        return receiver.build();
    }

    @Override
    public ActorSystem getActorSystem() {
        return getContext().getSystem();
    }

    @Override
    public LoggingAdapter getLogger() {
        return log;
    }

    @Override
    public String getName() {
        return groupId;
    }
}
// #query-added

