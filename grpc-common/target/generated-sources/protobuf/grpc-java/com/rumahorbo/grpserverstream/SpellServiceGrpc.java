package com.rumahorbo.grpserverstream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: grpcserverstream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpellServiceGrpc {

  private SpellServiceGrpc() {}

  public static final String SERVICE_NAME = "com.rumahorbo.grpserverstream.SpellService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rumahorbo.grpserverstream.WordRequest,
      com.rumahorbo.grpserverstream.WordResponse> getSpellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spell",
      requestType = com.rumahorbo.grpserverstream.WordRequest.class,
      responseType = com.rumahorbo.grpserverstream.WordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.rumahorbo.grpserverstream.WordRequest,
      com.rumahorbo.grpserverstream.WordResponse> getSpellMethod() {
    io.grpc.MethodDescriptor<com.rumahorbo.grpserverstream.WordRequest, com.rumahorbo.grpserverstream.WordResponse> getSpellMethod;
    if ((getSpellMethod = SpellServiceGrpc.getSpellMethod) == null) {
      synchronized (SpellServiceGrpc.class) {
        if ((getSpellMethod = SpellServiceGrpc.getSpellMethod) == null) {
          SpellServiceGrpc.getSpellMethod = getSpellMethod =
              io.grpc.MethodDescriptor.<com.rumahorbo.grpserverstream.WordRequest, com.rumahorbo.grpserverstream.WordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "spell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rumahorbo.grpserverstream.WordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rumahorbo.grpserverstream.WordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpellServiceMethodDescriptorSupplier("spell"))
              .build();
        }
      }
    }
    return getSpellMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpellServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpellServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpellServiceStub>() {
        @java.lang.Override
        public SpellServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpellServiceStub(channel, callOptions);
        }
      };
    return SpellServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpellServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpellServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpellServiceBlockingStub>() {
        @java.lang.Override
        public SpellServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpellServiceBlockingStub(channel, callOptions);
        }
      };
    return SpellServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpellServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpellServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpellServiceFutureStub>() {
        @java.lang.Override
        public SpellServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpellServiceFutureStub(channel, callOptions);
        }
      };
    return SpellServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SpellServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void spell(com.rumahorbo.grpserverstream.WordRequest request,
        io.grpc.stub.StreamObserver<com.rumahorbo.grpserverstream.WordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpellMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpellMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.rumahorbo.grpserverstream.WordRequest,
                com.rumahorbo.grpserverstream.WordResponse>(
                  this, METHODID_SPELL)))
          .build();
    }
  }

  /**
   */
  public static final class SpellServiceStub extends io.grpc.stub.AbstractAsyncStub<SpellServiceStub> {
    private SpellServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpellServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpellServiceStub(channel, callOptions);
    }

    /**
     */
    public void spell(com.rumahorbo.grpserverstream.WordRequest request,
        io.grpc.stub.StreamObserver<com.rumahorbo.grpserverstream.WordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSpellMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpellServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SpellServiceBlockingStub> {
    private SpellServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpellServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpellServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.rumahorbo.grpserverstream.WordResponse> spell(
        com.rumahorbo.grpserverstream.WordRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSpellMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpellServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SpellServiceFutureStub> {
    private SpellServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpellServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpellServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SPELL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpellServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpellServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SPELL:
          serviceImpl.spell((com.rumahorbo.grpserverstream.WordRequest) request,
              (io.grpc.stub.StreamObserver<com.rumahorbo.grpserverstream.WordResponse>) responseObserver);
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

  private static abstract class SpellServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpellServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rumahorbo.grpserverstream.Grpcserverstream.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpellService");
    }
  }

  private static final class SpellServiceFileDescriptorSupplier
      extends SpellServiceBaseDescriptorSupplier {
    SpellServiceFileDescriptorSupplier() {}
  }

  private static final class SpellServiceMethodDescriptorSupplier
      extends SpellServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpellServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpellServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpellServiceFileDescriptorSupplier())
              .addMethod(getSpellMethod())
              .build();
        }
      }
    }
    return result;
  }
}
