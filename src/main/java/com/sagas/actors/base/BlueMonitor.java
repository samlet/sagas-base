package com.sagas.actors.base;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.sagas.actors.base.CommonData.ObjectRegistered;

import java.util.Optional;

public class BlueMonitor extends AbstractActor {
  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  final String groupId;

  final String deviceId;

  public BlueMonitor(String groupId, String deviceId) {
    this.groupId = groupId;
    this.deviceId = deviceId;
  }

  public static Props props(String groupId, String deviceId) {
    return Props.create(BlueMonitor.class, () -> new BlueMonitor(groupId, deviceId));
  }

  public static final class RecordMeasure {
    final long requestId;
    final double value;

    public RecordMeasure(long requestId, double value) {
      this.requestId = requestId;
      this.value = value;
    }
  }

  public static final class MeasureRecorded {
    final long requestId;

    public MeasureRecorded(long requestId) {
      this.requestId = requestId;
    }
  }

  public static final class ReadMeasure {
    final long requestId;

    public ReadMeasure(long requestId) {
      this.requestId = requestId;
    }
  }

  public static final class RespondMeasure {
    final long requestId;
    final Optional<Double> value;

    public RespondMeasure(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }

  Optional<Double> lastMeasureReading = Optional.empty();

  @Override
  public void preStart() {
    log.info("Device actor {}-{} started", groupId, deviceId);
  }

  @Override
  public void postStop() {
    log.info("Device actor {}-{} stopped", groupId, deviceId);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            CommonData.RequestTrackObject.class,
            r -> {
              if (this.groupId.equals(r.groupId) && this.deviceId.equals(r.objectId)) {
                getSender().tell(new ObjectRegistered(), getSelf());
              } else {
                log.warning(
                    "Ignoring TrackDevice request for {}-{}.This actor is responsible for {}-{}.",
                    r.groupId,
                    r.objectId,
                    this.groupId,
                    this.deviceId);
              }
            })
        .match(
            RecordMeasure.class,
            r -> {
              log.info("Recorded temperature reading {} with {}", r.value, r.requestId);
              lastMeasureReading = Optional.of(r.value);
              getSender().tell(new MeasureRecorded(r.requestId), getSelf());
            })
        .match(
            ReadMeasure.class,
            r -> {
              getSender()
                  .tell(new RespondMeasure(r.requestId, lastMeasureReading), getSelf());
            })
        .build();
  }
}
