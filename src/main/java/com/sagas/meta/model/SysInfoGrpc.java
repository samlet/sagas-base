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
    comments = "Source: services_common.proto")
public final class SysInfoGrpc {

  private SysInfoGrpc() {}

  public static final String SERVICE_NAME = "model.SysInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sagas.meta.model.InfoQuery,
      com.sagas.meta.model.InfoMap> getGetSysInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSysInfo",
      requestType = com.sagas.meta.model.InfoQuery.class,
      responseType = com.sagas.meta.model.InfoMap.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sagas.meta.model.InfoQuery,
      com.sagas.meta.model.InfoMap> getGetSysInfoMethod() {
    io.grpc.MethodDescriptor<com.sagas.meta.model.InfoQuery, com.sagas.meta.model.InfoMap> getGetSysInfoMethod;
    if ((getGetSysInfoMethod = SysInfoGrpc.getGetSysInfoMethod) == null) {
      synchronized (SysInfoGrpc.class) {
        if ((getGetSysInfoMethod = SysInfoGrpc.getGetSysInfoMethod) == null) {
          SysInfoGrpc.getGetSysInfoMethod = getGetSysInfoMethod = 
              io.grpc.MethodDescriptor.<com.sagas.meta.model.InfoQuery, com.sagas.meta.model.InfoMap>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "model.SysInfo", "GetSysInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.InfoQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.InfoMap.getDefaultInstance()))
                  .setSchemaDescriptor(new SysInfoMethodDescriptorSupplier("GetSysInfo"))
                  .build();
          }
        }
     }
     return getGetSysInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sagas.meta.model.MetaQuery,
      com.sagas.meta.model.MetaPayload> getQueryMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryMeta",
      requestType = com.sagas.meta.model.MetaQuery.class,
      responseType = com.sagas.meta.model.MetaPayload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sagas.meta.model.MetaQuery,
      com.sagas.meta.model.MetaPayload> getQueryMetaMethod() {
    io.grpc.MethodDescriptor<com.sagas.meta.model.MetaQuery, com.sagas.meta.model.MetaPayload> getQueryMetaMethod;
    if ((getQueryMetaMethod = SysInfoGrpc.getQueryMetaMethod) == null) {
      synchronized (SysInfoGrpc.class) {
        if ((getQueryMetaMethod = SysInfoGrpc.getQueryMetaMethod) == null) {
          SysInfoGrpc.getQueryMetaMethod = getQueryMetaMethod = 
              io.grpc.MethodDescriptor.<com.sagas.meta.model.MetaQuery, com.sagas.meta.model.MetaPayload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "model.SysInfo", "QueryMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.MetaQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sagas.meta.model.MetaPayload.getDefaultInstance()))
                  .setSchemaDescriptor(new SysInfoMethodDescriptorSupplier("QueryMeta"))
                  .build();
          }
        }
     }
     return getQueryMetaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SysInfoStub newStub(io.grpc.Channel channel) {
    return new SysInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SysInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SysInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SysInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SysInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class SysInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSysInfo(com.sagas.meta.model.InfoQuery request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.InfoMap> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSysInfoMethod(), responseObserver);
    }

    /**
     */
    public void queryMeta(com.sagas.meta.model.MetaQuery request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.MetaPayload> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMetaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSysInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sagas.meta.model.InfoQuery,
                com.sagas.meta.model.InfoMap>(
                  this, METHODID_GET_SYS_INFO)))
          .addMethod(
            getQueryMetaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sagas.meta.model.MetaQuery,
                com.sagas.meta.model.MetaPayload>(
                  this, METHODID_QUERY_META)))
          .build();
    }
  }

  /**
   */
  public static final class SysInfoStub extends io.grpc.stub.AbstractStub<SysInfoStub> {
    private SysInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SysInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SysInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SysInfoStub(channel, callOptions);
    }

    /**
     */
    public void getSysInfo(com.sagas.meta.model.InfoQuery request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.InfoMap> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSysInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryMeta(com.sagas.meta.model.MetaQuery request,
        io.grpc.stub.StreamObserver<com.sagas.meta.model.MetaPayload> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMetaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SysInfoBlockingStub extends io.grpc.stub.AbstractStub<SysInfoBlockingStub> {
    private SysInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SysInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SysInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SysInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sagas.meta.model.InfoMap getSysInfo(com.sagas.meta.model.InfoQuery request) {
      return blockingUnaryCall(
          getChannel(), getGetSysInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sagas.meta.model.MetaPayload queryMeta(com.sagas.meta.model.MetaQuery request) {
      return blockingUnaryCall(
          getChannel(), getQueryMetaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SysInfoFutureStub extends io.grpc.stub.AbstractStub<SysInfoFutureStub> {
    private SysInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SysInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SysInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SysInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sagas.meta.model.InfoMap> getSysInfo(
        com.sagas.meta.model.InfoQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSysInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sagas.meta.model.MetaPayload> queryMeta(
        com.sagas.meta.model.MetaQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMetaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SYS_INFO = 0;
  private static final int METHODID_QUERY_META = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SysInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SysInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SYS_INFO:
          serviceImpl.getSysInfo((com.sagas.meta.model.InfoQuery) request,
              (io.grpc.stub.StreamObserver<com.sagas.meta.model.InfoMap>) responseObserver);
          break;
        case METHODID_QUERY_META:
          serviceImpl.queryMeta((com.sagas.meta.model.MetaQuery) request,
              (io.grpc.stub.StreamObserver<com.sagas.meta.model.MetaPayload>) responseObserver);
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

  private static abstract class SysInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SysInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sagas.meta.model.ServicesCommon.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SysInfo");
    }
  }

  private static final class SysInfoFileDescriptorSupplier
      extends SysInfoBaseDescriptorSupplier {
    SysInfoFileDescriptorSupplier() {}
  }

  private static final class SysInfoMethodDescriptorSupplier
      extends SysInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SysInfoMethodDescriptorSupplier(String methodName) {
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
      synchronized (SysInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SysInfoFileDescriptorSupplier())
              .addMethod(getGetSysInfoMethod())
              .addMethod(getQueryMetaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
