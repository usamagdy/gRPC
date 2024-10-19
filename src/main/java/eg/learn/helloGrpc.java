package eg.learn;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: helloWorld.proto")
public final class helloGrpc {

  private helloGrpc() {}

  public static final String SERVICE_NAME = "hello";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<eg.learn.HelloWorld.APIRequest,
      eg.learn.HelloWorld.APIResponse> getMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "message",
      requestType = eg.learn.HelloWorld.APIRequest.class,
      responseType = eg.learn.HelloWorld.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<eg.learn.HelloWorld.APIRequest,
      eg.learn.HelloWorld.APIResponse> getMessageMethod() {
    io.grpc.MethodDescriptor<eg.learn.HelloWorld.APIRequest, eg.learn.HelloWorld.APIResponse> getMessageMethod;
    if ((getMessageMethod = helloGrpc.getMessageMethod) == null) {
      synchronized (helloGrpc.class) {
        if ((getMessageMethod = helloGrpc.getMessageMethod) == null) {
          helloGrpc.getMessageMethod = getMessageMethod = 
              io.grpc.MethodDescriptor.<eg.learn.HelloWorld.APIRequest, eg.learn.HelloWorld.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hello", "message"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  eg.learn.HelloWorld.APIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  eg.learn.HelloWorld.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new helloMethodDescriptorSupplier("message"))
                  .build();
          }
        }
     }
     return getMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static helloStub newStub(io.grpc.Channel channel) {
    return new helloStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static helloBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new helloBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static helloFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new helloFutureStub(channel);
  }

  /**
   */
  public static abstract class helloImplBase implements io.grpc.BindableService {

    /**
     */
    public void message(eg.learn.HelloWorld.APIRequest request,
        io.grpc.stub.StreamObserver<eg.learn.HelloWorld.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                eg.learn.HelloWorld.APIRequest,
                eg.learn.HelloWorld.APIResponse>(
                  this, METHODID_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class helloStub extends io.grpc.stub.AbstractStub<helloStub> {
    private helloStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloStub(channel, callOptions);
    }

    /**
     */
    public void message(eg.learn.HelloWorld.APIRequest request,
        io.grpc.stub.StreamObserver<eg.learn.HelloWorld.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class helloBlockingStub extends io.grpc.stub.AbstractStub<helloBlockingStub> {
    private helloBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloBlockingStub(channel, callOptions);
    }

    /**
     */
    public eg.learn.HelloWorld.APIResponse message(eg.learn.HelloWorld.APIRequest request) {
      return blockingUnaryCall(
          getChannel(), getMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class helloFutureStub extends io.grpc.stub.AbstractStub<helloFutureStub> {
    private helloFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<eg.learn.HelloWorld.APIResponse> message(
        eg.learn.HelloWorld.APIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final helloImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(helloImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MESSAGE:
          serviceImpl.message((eg.learn.HelloWorld.APIRequest) request,
              (io.grpc.stub.StreamObserver<eg.learn.HelloWorld.APIResponse>) responseObserver);
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

  private static abstract class helloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    helloBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return eg.learn.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("hello");
    }
  }

  private static final class helloFileDescriptorSupplier
      extends helloBaseDescriptorSupplier {
    helloFileDescriptorSupplier() {}
  }

  private static final class helloMethodDescriptorSupplier
      extends helloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    helloMethodDescriptorSupplier(String methodName) {
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
      synchronized (helloGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new helloFileDescriptorSupplier())
              .addMethod(getMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
