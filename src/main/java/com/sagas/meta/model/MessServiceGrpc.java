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
    comments = "Source: mess.proto")
public final class MessServiceGrpc {

  private MessServiceGrpc() {}

  public static final String SERVICE_NAME = "model.MessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sagas.meta.model.MessString,
      com.sagas.meta.model.TextLangInfo> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.sagas.meta.model.MessString.class,
      responseType = com.sagas.meta.model.TextLangInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sagas.meta.model.MessString,
      com.sagas.meta.model.TextLangInfo> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.sagas.meta.model.MessString, com.sagas.meta.model.TextLangInfo> getSayHelloMethod;
    if ((getSayHelloMethod = MessServiceGrpc.getSayHelloMethod) == null) {
      synchronized (MessServiceGrpc.class) {
        if ((getSayHelloMethod = MessServiceGrpc.getSayHelloMethod) == null) {
          MessServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.sagas.meta.model.MessString, com.sagas.meta.model.TextLangInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "model.MessService", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.MessString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.TextLangInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new MessServiceMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessServiceStub newStub(io.grpc.Channel channel) {
    return new MessServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MessServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.sagas.meta.model.MessString request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.TextLangInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sagas.meta.model.MessString,
                com.sagas.meta.model.TextLangInfo>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class MessServiceStub extends io.grpc.stub.AbstractStub<MessServiceStub> {
    private MessServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.sagas.meta.model.MessString request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.TextLangInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessServiceBlockingStub extends io.grpc.stub.AbstractStub<MessServiceBlockingStub> {
    private MessServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sagas.meta.model.TextLangInfo sayHello(com.sagas.meta.model.MessString request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessServiceFutureStub extends io.grpc.stub.AbstractStub<MessServiceFutureStub> {
    private MessServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sagas.meta.model.TextLangInfo> sayHello(
        com.sagas.meta.model.MessString request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.sagas.meta.model.MessString) request,
              (io.grpc.stub.StreamObserver<com.sagas.meta.model.TextLangInfo>) responseObserver);
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

  private static abstract class MessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sagas.meta.model.Mess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessService");
    }
  }

  private static final class MessServiceFileDescriptorSupplier
      extends MessServiceBaseDescriptorSupplier {
    MessServiceFileDescriptorSupplier() {}
  }

  private static final class MessServiceMethodDescriptorSupplier
      extends MessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
