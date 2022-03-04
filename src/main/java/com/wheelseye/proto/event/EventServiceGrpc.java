package com.wheelseye.proto.event;

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
 * <pre>
 * Event service endpoints
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: greeting.proto")
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.event.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.HealthRequest,
      com.wheelseye.proto.event.HealthResponse> getHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HealthCheck",
      requestType = com.wheelseye.proto.event.HealthRequest.class,
      responseType = com.wheelseye.proto.event.HealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.HealthRequest,
      com.wheelseye.proto.event.HealthResponse> getHealthCheckMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.HealthRequest, com.wheelseye.proto.event.HealthResponse> getHealthCheckMethod;
    if ((getHealthCheckMethod = EventServiceGrpc.getHealthCheckMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getHealthCheckMethod = EventServiceGrpc.getHealthCheckMethod) == null) {
          EventServiceGrpc.getHealthCheckMethod = getHealthCheckMethod = 
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.HealthRequest, com.wheelseye.proto.event.HealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.event.EventService", "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.HealthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("HealthCheck"))
                  .build();
          }
        }
     }
     return getHealthCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.EventRequest,
      com.wheelseye.proto.event.EventResponse> getCaptureEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CaptureEvent",
      requestType = com.wheelseye.proto.event.EventRequest.class,
      responseType = com.wheelseye.proto.event.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.EventRequest,
      com.wheelseye.proto.event.EventResponse> getCaptureEventMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.EventRequest, com.wheelseye.proto.event.EventResponse> getCaptureEventMethod;
    if ((getCaptureEventMethod = EventServiceGrpc.getCaptureEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getCaptureEventMethod = EventServiceGrpc.getCaptureEventMethod) == null) {
          EventServiceGrpc.getCaptureEventMethod = getCaptureEventMethod = 
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.EventRequest, com.wheelseye.proto.event.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.event.EventService", "CaptureEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.EventResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("CaptureEvent"))
                  .build();
          }
        }
     }
     return getCaptureEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    return new EventServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void healthCheck(com.wheelseye.proto.event.HealthRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.HealthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }

    /**
     */
    public void captureEvent(com.wheelseye.proto.event.EventRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCaptureEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHealthCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wheelseye.proto.event.HealthRequest,
                com.wheelseye.proto.event.HealthResponse>(
                  this, METHODID_HEALTH_CHECK)))
          .addMethod(
            getCaptureEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.wheelseye.proto.event.EventRequest,
                com.wheelseye.proto.event.EventResponse>(
                  this, METHODID_CAPTURE_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractStub<EventServiceStub> {
    private EventServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void healthCheck(com.wheelseye.proto.event.HealthRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.HealthResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void captureEvent(com.wheelseye.proto.event.EventRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCaptureEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wheelseye.proto.event.HealthResponse healthCheck(com.wheelseye.proto.event.HealthRequest request) {
      return blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wheelseye.proto.event.EventResponse> captureEvent(
        com.wheelseye.proto.event.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCaptureEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractStub<EventServiceFutureStub> {
    private EventServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wheelseye.proto.event.HealthResponse> healthCheck(
        com.wheelseye.proto.event.HealthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;
  private static final int METHODID_CAPTURE_EVENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((com.wheelseye.proto.event.HealthRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.HealthResponse>) responseObserver);
          break;
        case METHODID_CAPTURE_EVENT:
          serviceImpl.captureEvent((com.wheelseye.proto.event.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.EventResponse>) responseObserver);
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

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wheelseye.proto.event.Greeting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getHealthCheckMethod())
              .addMethod(getCaptureEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
