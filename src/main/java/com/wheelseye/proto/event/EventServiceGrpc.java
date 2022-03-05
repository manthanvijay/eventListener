package com.wheelseye.proto.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Event service endpoints
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HealthCheck"))
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
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.EventRequest,
      com.wheelseye.proto.event.EventResponse> getCaptureEventMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.EventRequest, com.wheelseye.proto.event.EventResponse> getCaptureEventMethod;
    if ((getCaptureEventMethod = EventServiceGrpc.getCaptureEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getCaptureEventMethod = EventServiceGrpc.getCaptureEventMethod) == null) {
          EventServiceGrpc.getCaptureEventMethod = getCaptureEventMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.EventRequest, com.wheelseye.proto.event.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CaptureEvent"))
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

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.GetEventRequest,
      com.wheelseye.proto.event.GetEventResponse> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = com.wheelseye.proto.event.GetEventRequest.class,
      responseType = com.wheelseye.proto.event.GetEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.GetEventRequest,
      com.wheelseye.proto.event.GetEventResponse> getGetEventsMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.GetEventRequest, com.wheelseye.proto.event.GetEventResponse> getGetEventsMethod;
    if ((getGetEventsMethod = EventServiceGrpc.getGetEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventsMethod = EventServiceGrpc.getGetEventsMethod) == null) {
          EventServiceGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.GetEventRequest, com.wheelseye.proto.event.GetEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.GetEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.GetEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEvents"))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.RegisterAppRequest,
      com.wheelseye.proto.event.RegisterAppResponse> getRegisterAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterApp",
      requestType = com.wheelseye.proto.event.RegisterAppRequest.class,
      responseType = com.wheelseye.proto.event.RegisterAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.RegisterAppRequest,
      com.wheelseye.proto.event.RegisterAppResponse> getRegisterAppMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.RegisterAppRequest, com.wheelseye.proto.event.RegisterAppResponse> getRegisterAppMethod;
    if ((getRegisterAppMethod = EventServiceGrpc.getRegisterAppMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getRegisterAppMethod = EventServiceGrpc.getRegisterAppMethod) == null) {
          EventServiceGrpc.getRegisterAppMethod = getRegisterAppMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.RegisterAppRequest, com.wheelseye.proto.event.RegisterAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.RegisterAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.RegisterAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("RegisterApp"))
              .build();
        }
      }
    }
    return getRegisterAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.ListenMimicRequest,
      com.wheelseye.proto.event.ListenMimicResponse> getMimicListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MimicListener",
      requestType = com.wheelseye.proto.event.ListenMimicRequest.class,
      responseType = com.wheelseye.proto.event.ListenMimicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.ListenMimicRequest,
      com.wheelseye.proto.event.ListenMimicResponse> getMimicListenerMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.ListenMimicRequest, com.wheelseye.proto.event.ListenMimicResponse> getMimicListenerMethod;
    if ((getMimicListenerMethod = EventServiceGrpc.getMimicListenerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getMimicListenerMethod = EventServiceGrpc.getMimicListenerMethod) == null) {
          EventServiceGrpc.getMimicListenerMethod = getMimicListenerMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.ListenMimicRequest, com.wheelseye.proto.event.ListenMimicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MimicListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.ListenMimicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.ListenMimicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("MimicListener"))
              .build();
        }
      }
    }
    return getMimicListenerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.MimicRecieveRequest,
      com.wheelseye.proto.event.MimicRecieveResponse> getMimicRecieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MimicRecieve",
      requestType = com.wheelseye.proto.event.MimicRecieveRequest.class,
      responseType = com.wheelseye.proto.event.MimicRecieveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.MimicRecieveRequest,
      com.wheelseye.proto.event.MimicRecieveResponse> getMimicRecieveMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.MimicRecieveRequest, com.wheelseye.proto.event.MimicRecieveResponse> getMimicRecieveMethod;
    if ((getMimicRecieveMethod = EventServiceGrpc.getMimicRecieveMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getMimicRecieveMethod = EventServiceGrpc.getMimicRecieveMethod) == null) {
          EventServiceGrpc.getMimicRecieveMethod = getMimicRecieveMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.MimicRecieveRequest, com.wheelseye.proto.event.MimicRecieveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MimicRecieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.MimicRecieveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.MimicRecieveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("MimicRecieve"))
              .build();
        }
      }
    }
    return getMimicRecieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.MimicSendRequest,
      com.wheelseye.proto.event.MimicSendResponse> getMimicSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MimicSend",
      requestType = com.wheelseye.proto.event.MimicSendRequest.class,
      responseType = com.wheelseye.proto.event.MimicSendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.MimicSendRequest,
      com.wheelseye.proto.event.MimicSendResponse> getMimicSendMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.MimicSendRequest, com.wheelseye.proto.event.MimicSendResponse> getMimicSendMethod;
    if ((getMimicSendMethod = EventServiceGrpc.getMimicSendMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getMimicSendMethod = EventServiceGrpc.getMimicSendMethod) == null) {
          EventServiceGrpc.getMimicSendMethod = getMimicSendMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.MimicSendRequest, com.wheelseye.proto.event.MimicSendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MimicSend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.MimicSendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.MimicSendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("MimicSend"))
              .build();
        }
      }
    }
    return getMimicSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wheelseye.proto.event.InitiateMimicRequest,
      com.wheelseye.proto.event.InitiateMimicResponse> getInitiateMimicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitiateMimic",
      requestType = com.wheelseye.proto.event.InitiateMimicRequest.class,
      responseType = com.wheelseye.proto.event.InitiateMimicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wheelseye.proto.event.InitiateMimicRequest,
      com.wheelseye.proto.event.InitiateMimicResponse> getInitiateMimicMethod() {
    io.grpc.MethodDescriptor<com.wheelseye.proto.event.InitiateMimicRequest, com.wheelseye.proto.event.InitiateMimicResponse> getInitiateMimicMethod;
    if ((getInitiateMimicMethod = EventServiceGrpc.getInitiateMimicMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getInitiateMimicMethod = EventServiceGrpc.getInitiateMimicMethod) == null) {
          EventServiceGrpc.getInitiateMimicMethod = getInitiateMimicMethod =
              io.grpc.MethodDescriptor.<com.wheelseye.proto.event.InitiateMimicRequest, com.wheelseye.proto.event.InitiateMimicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitiateMimic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.InitiateMimicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wheelseye.proto.event.InitiateMimicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("InitiateMimic"))
              .build();
        }
      }
    }
    return getInitiateMimicMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Event analytics
     * </pre>
     */
    public void captureEvent(com.wheelseye.proto.event.EventRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.EventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCaptureEventMethod(), responseObserver);
    }

    /**
     */
    public void getEvents(com.wheelseye.proto.event.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.GetEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * App mimic
     * </pre>
     */
    public void registerApp(com.wheelseye.proto.event.RegisterAppRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.RegisterAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAppMethod(), responseObserver);
    }

    /**
     */
    public void mimicListener(com.wheelseye.proto.event.ListenMimicRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.ListenMimicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMimicListenerMethod(), responseObserver);
    }

    /**
     */
    public void mimicRecieve(com.wheelseye.proto.event.MimicRecieveRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.MimicRecieveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMimicRecieveMethod(), responseObserver);
    }

    /**
     */
    public void mimicSend(com.wheelseye.proto.event.MimicSendRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.MimicSendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMimicSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Admin Control
     * </pre>
     */
    public void initiateMimic(com.wheelseye.proto.event.InitiateMimicRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.InitiateMimicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitiateMimicMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHealthCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wheelseye.proto.event.HealthRequest,
                com.wheelseye.proto.event.HealthResponse>(
                  this, METHODID_HEALTH_CHECK)))
          .addMethod(
            getCaptureEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wheelseye.proto.event.EventRequest,
                com.wheelseye.proto.event.EventResponse>(
                  this, METHODID_CAPTURE_EVENT)))
          .addMethod(
            getGetEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.wheelseye.proto.event.GetEventRequest,
                com.wheelseye.proto.event.GetEventResponse>(
                  this, METHODID_GET_EVENTS)))
          .addMethod(
            getRegisterAppMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wheelseye.proto.event.RegisterAppRequest,
                com.wheelseye.proto.event.RegisterAppResponse>(
                  this, METHODID_REGISTER_APP)))
          .addMethod(
            getMimicListenerMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.wheelseye.proto.event.ListenMimicRequest,
                com.wheelseye.proto.event.ListenMimicResponse>(
                  this, METHODID_MIMIC_LISTENER)))
          .addMethod(
            getMimicRecieveMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.wheelseye.proto.event.MimicRecieveRequest,
                com.wheelseye.proto.event.MimicRecieveResponse>(
                  this, METHODID_MIMIC_RECIEVE)))
          .addMethod(
            getMimicSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wheelseye.proto.event.MimicSendRequest,
                com.wheelseye.proto.event.MimicSendResponse>(
                  this, METHODID_MIMIC_SEND)))
          .addMethod(
            getInitiateMimicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wheelseye.proto.event.InitiateMimicRequest,
                com.wheelseye.proto.event.InitiateMimicResponse>(
                  this, METHODID_INITIATE_MIMIC)))
          .build();
    }
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void healthCheck(com.wheelseye.proto.event.HealthRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.HealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Event analytics
     * </pre>
     */
    public void captureEvent(com.wheelseye.proto.event.EventRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.EventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCaptureEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvents(com.wheelseye.proto.event.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.GetEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * App mimic
     * </pre>
     */
    public void registerApp(com.wheelseye.proto.event.RegisterAppRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.RegisterAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mimicListener(com.wheelseye.proto.event.ListenMimicRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.ListenMimicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMimicListenerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mimicRecieve(com.wheelseye.proto.event.MimicRecieveRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.MimicRecieveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMimicRecieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mimicSend(com.wheelseye.proto.event.MimicSendRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.MimicSendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMimicSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Admin Control
     * </pre>
     */
    public void initiateMimic(com.wheelseye.proto.event.InitiateMimicRequest request,
        io.grpc.stub.StreamObserver<com.wheelseye.proto.event.InitiateMimicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitiateMimicMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wheelseye.proto.event.HealthResponse healthCheck(com.wheelseye.proto.event.HealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Event analytics
     * </pre>
     */
    public com.wheelseye.proto.event.EventResponse captureEvent(com.wheelseye.proto.event.EventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCaptureEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wheelseye.proto.event.GetEventResponse> getEvents(
        com.wheelseye.proto.event.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * App mimic
     * </pre>
     */
    public com.wheelseye.proto.event.RegisterAppResponse registerApp(com.wheelseye.proto.event.RegisterAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wheelseye.proto.event.ListenMimicResponse> mimicListener(
        com.wheelseye.proto.event.ListenMimicRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMimicListenerMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wheelseye.proto.event.MimicRecieveResponse> mimicRecieve(
        com.wheelseye.proto.event.MimicRecieveRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMimicRecieveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wheelseye.proto.event.MimicSendResponse mimicSend(com.wheelseye.proto.event.MimicSendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMimicSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Admin Control
     * </pre>
     */
    public com.wheelseye.proto.event.InitiateMimicResponse initiateMimic(com.wheelseye.proto.event.InitiateMimicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitiateMimicMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Event service endpoints
   * </pre>
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wheelseye.proto.event.HealthResponse> healthCheck(
        com.wheelseye.proto.event.HealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Event analytics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wheelseye.proto.event.EventResponse> captureEvent(
        com.wheelseye.proto.event.EventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCaptureEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * App mimic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wheelseye.proto.event.RegisterAppResponse> registerApp(
        com.wheelseye.proto.event.RegisterAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wheelseye.proto.event.MimicSendResponse> mimicSend(
        com.wheelseye.proto.event.MimicSendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMimicSendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Admin Control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wheelseye.proto.event.InitiateMimicResponse> initiateMimic(
        com.wheelseye.proto.event.InitiateMimicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitiateMimicMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;
  private static final int METHODID_CAPTURE_EVENT = 1;
  private static final int METHODID_GET_EVENTS = 2;
  private static final int METHODID_REGISTER_APP = 3;
  private static final int METHODID_MIMIC_LISTENER = 4;
  private static final int METHODID_MIMIC_RECIEVE = 5;
  private static final int METHODID_MIMIC_SEND = 6;
  private static final int METHODID_INITIATE_MIMIC = 7;

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
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((com.wheelseye.proto.event.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.GetEventResponse>) responseObserver);
          break;
        case METHODID_REGISTER_APP:
          serviceImpl.registerApp((com.wheelseye.proto.event.RegisterAppRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.RegisterAppResponse>) responseObserver);
          break;
        case METHODID_MIMIC_LISTENER:
          serviceImpl.mimicListener((com.wheelseye.proto.event.ListenMimicRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.ListenMimicResponse>) responseObserver);
          break;
        case METHODID_MIMIC_RECIEVE:
          serviceImpl.mimicRecieve((com.wheelseye.proto.event.MimicRecieveRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.MimicRecieveResponse>) responseObserver);
          break;
        case METHODID_MIMIC_SEND:
          serviceImpl.mimicSend((com.wheelseye.proto.event.MimicSendRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.MimicSendResponse>) responseObserver);
          break;
        case METHODID_INITIATE_MIMIC:
          serviceImpl.initiateMimic((com.wheelseye.proto.event.InitiateMimicRequest) request,
              (io.grpc.stub.StreamObserver<com.wheelseye.proto.event.InitiateMimicResponse>) responseObserver);
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
              .addMethod(getGetEventsMethod())
              .addMethod(getRegisterAppMethod())
              .addMethod(getMimicListenerMethod())
              .addMethod(getMimicRecieveMethod())
              .addMethod(getMimicSendMethod())
              .addMethod(getInitiateMimicMethod())
              .build();
        }
      }
    }
    return result;
  }
}
