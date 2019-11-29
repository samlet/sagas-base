/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package com.sagas.actors.base;

import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.sagas.actors.base.CommonData.MeasureNotAvailable;
import com.sagas.actors.base.CommonData.MeasureReading;
import com.sagas.actors.base.CommonData.RespondAllMeasures;
import scala.concurrent.duration.FiniteDuration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// #query-full
// #query-outline
public class BlueGroupQuery extends AbstractActor {
  public static final class CollectionTimeout {}

  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  final Map<ActorRef, String> actorToDeviceId;
  final long requestId;
  final ActorRef requester;

  Cancellable queryTimeoutTimer;

  public BlueGroupQuery(
      Map<ActorRef, String> actorToDeviceId,
      long requestId,
      ActorRef requester,
      FiniteDuration timeout) {
    this.actorToDeviceId = actorToDeviceId;
    this.requestId = requestId;
    this.requester = requester;

    queryTimeoutTimer =
        getContext()
            .getSystem()
            .scheduler()
            .scheduleOnce(
                timeout,
                getSelf(),
                new CollectionTimeout(),
                getContext().getDispatcher(),
                getSelf());
  }

  public static Props props(
      Map<ActorRef, String> actorToDeviceId,
      long requestId,
      ActorRef requester,
      FiniteDuration timeout) {
    return Props.create(
        BlueGroupQuery.class,
        () -> new BlueGroupQuery(actorToDeviceId, requestId, requester, timeout));
  }

  @Override
  public void preStart() {
    for (ActorRef deviceActor : actorToDeviceId.keySet()) {
      getContext().watch(deviceActor);
      deviceActor.tell(new BlueMonitor.ReadMeasure(0L), getSelf());
    }
  }

  @Override
  public void postStop() {
    queryTimeoutTimer.cancel();
  }

  // #query-outline
  // #query-state
  @Override
  public Receive createReceive() {
    return waitingForReplies(new HashMap<>(), actorToDeviceId.keySet());
  }

  public Receive waitingForReplies(
      Map<String, MeasureReading> repliesSoFar, Set<ActorRef> stillWaiting) {
    return receiveBuilder()
        .match(
            BlueMonitor.RespondMeasure.class,
            r -> {
              ActorRef deviceActor = getSender();
              MeasureReading reading =
                  r.value
                      .map(v -> (MeasureReading) new CommonData.Measure(v))
                      .orElse(MeasureNotAvailable.INSTANCE);
              receivedResponse(deviceActor, reading, stillWaiting, repliesSoFar);
            })
        .match(
            Terminated.class,
            t -> {
              receivedResponse(
                  t.getActor(),
                  CommonData.ObjectNotAvailable.INSTANCE,
                  stillWaiting,
                  repliesSoFar);
            })
        .match(
            CollectionTimeout.class,
            t -> {
              Map<String, MeasureReading> replies = new HashMap<>(repliesSoFar);
              for (ActorRef deviceActor : stillWaiting) {
                String deviceId = actorToDeviceId.get(deviceActor);
                replies.put(deviceId, CommonData.ObjectTimedOut.INSTANCE);
              }
              requester.tell(new RespondAllMeasures(requestId, replies), getSelf());
              getContext().stop(getSelf());
            })
        .build();
  }
  // #query-state

  // #query-collect-reply
  public void receivedResponse(
      ActorRef deviceActor,
      MeasureReading reading,
      Set<ActorRef> stillWaiting,
      Map<String, MeasureReading> repliesSoFar) {
    getContext().unwatch(deviceActor);
    String deviceId = actorToDeviceId.get(deviceActor);

    Set<ActorRef> newStillWaiting = new HashSet<>(stillWaiting);
    newStillWaiting.remove(deviceActor);

    Map<String, MeasureReading> newRepliesSoFar = new HashMap<>(repliesSoFar);
    newRepliesSoFar.put(deviceId, reading);
    if (newStillWaiting.isEmpty()) {
      requester.tell(new RespondAllMeasures(requestId, newRepliesSoFar), getSelf());
      getContext().stop(getSelf());
    } else {
      getContext().become(waitingForReplies(newRepliesSoFar, newStillWaiting));
    }
  }
  // #query-collect-reply
  // #query-outline
}
// #query-outline
// #query-full
