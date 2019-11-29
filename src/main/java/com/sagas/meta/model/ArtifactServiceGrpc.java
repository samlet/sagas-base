package com.sagas.meta.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: blueprints.proto")
public final class ArtifactServiceGrpc {

  private ArtifactServiceGrpc() {}

  public static final String SERVICE_NAME = "model.ArtifactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sagas.meta.model.PingRequest,
      com.sagas.meta.model.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.sagas.meta.model.PingRequest.class,
      responseType = com.sagas.meta.model.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sagas.meta.model.PingRequest,
      com.sagas.meta.model.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.sagas.meta.model.PingRequest, com.sagas.meta.model.PingResponse> getPingMethod;
    if ((getPingMethod = ArtifactServiceGrpc.getPingMethod) == null) {
      synchronized (ArtifactServiceGrpc.class) {
        if ((getPingMethod = ArtifactServiceGrpc.getPingMethod) == null) {
          ArtifactServiceGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<com.sagas.meta.model.PingRequest, com.sagas.meta.model.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "model.ArtifactService", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.PingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtifactServiceMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sagas.meta.model.BotMessage,
      com.sagas.meta.model.BotResponse> getTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Talk",
      requestType = com.sagas.meta.model.BotMessage.class,
      responseType = com.sagas.meta.model.BotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sagas.meta.model.BotMessage,
      com.sagas.meta.model.BotResponse> getTalkMethod() {
    io.grpc.MethodDescriptor<com.sagas.meta.model.BotMessage, com.sagas.meta.model.BotResponse> getTalkMethod;
    if ((getTalkMethod = ArtifactServiceGrpc.getTalkMethod) == null) {
      synchronized (ArtifactServiceGrpc.class) {
        if ((getTalkMethod = ArtifactServiceGrpc.getTalkMethod) == null) {
          ArtifactServiceGrpc.getTalkMethod = getTalkMethod = 
              io.grpc.MethodDescriptor.<com.sagas.meta.model.BotMessage, com.sagas.meta.model.BotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "model.ArtifactService", "Talk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.BotMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.BotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtifactServiceMethodDescriptorSupplier("Talk"))
                  .build();
          }
        }
     }
     return getTalkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sagas.meta.model.BotSetSlot,
      com.sagas.meta.model.BotAck> getSetSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSlot",
      requestType = com.sagas.meta.model.BotSetSlot.class,
      responseType = com.sagas.meta.model.BotAck.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sagas.meta.model.BotSetSlot,
      com.sagas.meta.model.BotAck> getSetSlotMethod() {
    io.grpc.MethodDescriptor<com.sagas.meta.model.BotSetSlot, com.sagas.meta.model.BotAck> getSetSlotMethod;
    if ((getSetSlotMethod = ArtifactServiceGrpc.getSetSlotMethod) == null) {
      synchronized (ArtifactServiceGrpc.class) {
        if ((getSetSlotMethod = ArtifactServiceGrpc.getSetSlotMethod) == null) {
          ArtifactServiceGrpc.getSetSlotMethod = getSetSlotMethod = 
              io.grpc.MethodDescriptor.<com.sagas.meta.model.BotSetSlot, com.sagas.meta.model.BotAck>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "model.ArtifactService", "SetSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.BotSetSlot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.BotAck.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtifactServiceMethodDescriptorSupplier("SetSlot"))
                  .build();
          }
        }
     }
     return getSetSlotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArtifactServiceStub newStub(io.grpc.Channel channel) {
    return new ArtifactServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArtifactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArtifactServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArtifactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArtifactServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ArtifactServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.sagas.meta.model.PingRequest request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void talk(com.sagas.meta.model.BotMessage request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.BotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTalkMethod(), responseObserver);
    }

    /**
     */
    public void setSlot(com.sagas.meta.model.BotSetSlot request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.BotAck> responseObserver) {
      asyncUnimplementedUnaryCall(getSetSlotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sagas.meta.model.PingRequest,
                com.sagas.meta.model.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getTalkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sagas.meta.model.BotMessage,
                com.sagas.meta.model.BotResponse>(
                  this, METHODID_TALK)))
          .addMethod(
            getSetSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sagas.meta.model.BotSetSlot,
                com.sagas.meta.model.BotAck>(
                  this, METHODID_SET_SLOT)))
          .build();
    }
  }

  /**
   */
  public static final class ArtifactServiceStub extends io.grpc.stub.AbstractStub<ArtifactServiceStub> {
    private ArtifactServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtifactServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtifactServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.sagas.meta.model.PingRequest request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void talk(com.sagas.meta.model.BotMessage request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.BotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTalkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setSlot(com.sagas.meta.model.BotSetSlot request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.BotAck> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetSlotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArtifactServiceBlockingStub extends io.grpc.stub.AbstractStub<ArtifactServiceBlockingStub> {
    private ArtifactServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtifactServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtifactServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sagas.meta.model.PingResponse ping(com.sagas.meta.model.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sagas.meta.model.BotResponse talk(com.sagas.meta.model.BotMessage request) {
      return blockingUnaryCall(
          getChannel(), getTalkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sagas.meta.model.BotAck setSlot(com.sagas.meta.model.BotSetSlot request) {
      return blockingUnaryCall(
          getChannel(), getSetSlotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ArtifactServiceFutureStub extends io.grpc.stub.AbstractStub<ArtifactServiceFutureStub> {
    private ArtifactServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtifactServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtifactServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sagas.meta.model.PingResponse> ping(
        com.sagas.meta.model.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sagas.meta.model.BotResponse> talk(
        com.sagas.meta.model.BotMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getTalkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sagas.meta.model.BotAck> setSlot(
        com.sagas.meta.model.BotSetSlot request) {
      return futureUnaryCall(
          getChannel().newCall(getSetSlotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_TALK = 1;
  private static final int METHODID_SET_SLOT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArtifactServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArtifactServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.sagas.meta.model.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.sagas.meta.model.PingResponse>) responseObserver);
          break;
        case METHODID_TALK:
          serviceImpl.talk((com.sagas.meta.model.BotMessage) request,
              (io.grpc.stub.StreamObserver<com.sagas.meta.model.BotResponse>) responseObserver);
          break;
        case METHODID_SET_SLOT:
          serviceImpl.setSlot((com.sagas.meta.model.BotSetSlot) request,
              (io.grpc.stub.StreamObserver<com.sagas.meta.model.BotAck>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ArtifactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArtifactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sagas.meta.model.Blueprints.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArtifactService");
    }
  }

  private static final class ArtifactServiceFileDescriptorSupplier
      extends ArtifactServiceBaseDescriptorSupplier {
    ArtifactServiceFileDescriptorSupplier() {}
  }

  private static final class ArtifactServiceMethodDescriptorSupplier
      extends ArtifactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArtifactServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArtifactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArtifactServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getTalkMethod())
              .addMethod(getSetSlotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
