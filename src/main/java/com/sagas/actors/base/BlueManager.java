/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package com.sagas.actors.base;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.Terminated;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.google.common.collect.Lists;
import com.sagas.actors.base.CommonData.RequestTrackObject;

import java.util.HashMap;
import java.util.Map;

public class BlueManager extends AbstractActor {
  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  public static Props props() {
    return Props.create(BlueManager.class, BlueManager::new);
  }

  protected final Map<String, ActorRef> groupIdToActor = new HashMap<>();
  protected final Map<ActorRef, String> actorToGroupId = new HashMap<>();

  @Override
  public void preStart() {
    log.info("Blue Manager started");
  }

  @Override
  public void postStop() {
    log.info("Blue Manager stopped");
  }

  protected void onTrackObject(RequestTrackObject trackMsg) {
    String groupId = trackMsg.groupId;
    ActorRef ref = groupIdToActor.get(groupId);
    if (ref != null) {
      ref.forward(trackMsg, getContext());
    } else {
      log.info("Creating blue manager actor {}", groupId);
      ActorRef groupActor = getContext().actorOf(
              BlueObject.props(groupId, Lists.newArrayList()), groupId);
      getContext().watch(groupActor);
      groupActor.forward(trackMsg, getContext());
      groupIdToActor.put(groupId, groupActor);
      actorToGroupId.put(groupActor, groupId);
    }
  }

  protected void onTerminated(Terminated t) {
    ActorRef groupActor = t.getActor();
    String groupId = actorToGroupId.get(groupActor);
    log.info("Blue Manager actor {} has been terminated", groupId);
    actorToGroupId.remove(groupActor);
    groupIdToActor.remove(groupId);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(RequestTrackObject.class, this::onTrackObject)
        .match(Terminated.class, this::onTerminated)
        .build();
  }
}

