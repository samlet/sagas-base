package com.sagas.remote;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sagas.actions.ActionRequest;
import com.sagas.actions.ActionResponse;
import com.sagas.actors.base.BlueBaseObject;
import com.sagas.actors.base.BlueComponent;
import com.sagas.actors.bus.BlueAck;
import com.sagas.actors.bus.BluePacket;
import com.sagas.meta.model.*;

import javax.inject.Inject;
import java.util.List;

public class ArtifactActor extends BlueBaseObject {
  private final ActorRef responser;
  private LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  @Inject
  ArtifactServant servant;

  public ArtifactActor(ActorRef responser, List<Class<? extends BlueComponent>> components) {
    super(components);
    this.responser = responser;
  }

  static public Props props(ComponentProvider provider, ActorRef responser, List<Class<? extends BlueComponent>> components) {
    return Props.create(ArtifactActor.class, () -> provider.inject(new ArtifactActor(responser, components)));
  }

  @Override
  public void preStart() {
    log.info("Blue Greeter started");
  }

  public void wrapException(MetaPayload.Builder payload, Exception e) {
    log.error(e, e.getMessage());

    ErrorInfo errorInfo = ErrorInfo.newBuilder()
            .setErrorType(ErrorType.RETRIEVE_INFO_FAIL)
            .setMessage(e.getMessage())
            .build();
    payload.setType(MetaPayloadType.ERROR_INFO).setBody(errorInfo.toByteString());
  }

  public void checkResponse(MetaPayload.Builder payload, ActionResponse resp) throws InvalidProtocolBufferException {
    if(resp.getCode()==0) {
      payload.setType(MetaPayloadType.ACTION_RESULT);
      if (resp.getPayload() != null) {
        payload.setBody(resp.getPayload());
      }
    }else{
      ErrorInfo errorInfo = ErrorInfo.parseFrom(resp.getPayload());
      payload.setType(MetaPayloadType.ERROR_INFO).setBody(errorInfo.toByteString());
    }
  }


  private void proc(BluePacket packet, Functions.ActonApply<BlueMessage> f) {
    BlueAck ack = packet.getResponse();
    MetaPayload.Builder payload = MetaPayload.newBuilder();
    try {
      ActionResponse response = f.apply(packet.getRequest());
      checkResponse(payload, response);
    } catch (Exception e) {
      wrapException(payload, e);
    } finally {
      responser.tell(new BlueAck(ack, payload.build().toByteArray()), getSelf());
    }
  }

  private void onPacket(BluePacket packet) {
    String type = packet.getRequest().getType();
    log.info(".. persister receive message {}", type);
    switch (type) {
      case "talk":
        proc(packet, msg -> servant.talk(
              new ActionRequest(type, packet.getRequest().getBody())));
        break;
    }
  }

  @Override
  public Receive createReceive() {
    return initReceiver()
            .match(BluePacket.class, this::onPacket)
            .build();
  }

  @Override
  public LoggingAdapter getLogger() {
    return log;
  }
}

