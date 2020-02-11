package io.grpc.clockSync;

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
    comments = "Source: clockSync.proto")
public final class TimeComputeGrpc {

  private TimeComputeGrpc() {}

  public static final String SERVICE_NAME = "TimeCompute";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.clockSync.ClockSync.reqTimeObj,
      io.grpc.clockSync.ClockSync.resTimeObj> getTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Time",
      requestType = io.grpc.clockSync.ClockSync.reqTimeObj.class,
      responseType = io.grpc.clockSync.ClockSync.resTimeObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.clockSync.ClockSync.reqTimeObj,
      io.grpc.clockSync.ClockSync.resTimeObj> getTimeMethod() {
    io.grpc.MethodDescriptor<io.grpc.clockSync.ClockSync.reqTimeObj, io.grpc.clockSync.ClockSync.resTimeObj> getTimeMethod;
    if ((getTimeMethod = TimeComputeGrpc.getTimeMethod) == null) {
      synchronized (TimeComputeGrpc.class) {
        if ((getTimeMethod = TimeComputeGrpc.getTimeMethod) == null) {
          TimeComputeGrpc.getTimeMethod = getTimeMethod = 
              io.grpc.MethodDescriptor.<io.grpc.clockSync.ClockSync.reqTimeObj, io.grpc.clockSync.ClockSync.resTimeObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TimeCompute", "Time"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.clockSync.ClockSync.reqTimeObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.clockSync.ClockSync.resTimeObj.getDefaultInstance()))
                  .setSchemaDescriptor(new TimeComputeMethodDescriptorSupplier("Time"))
                  .build();
          }
        }
     }
     return getTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimeComputeStub newStub(io.grpc.Channel channel) {
    return new TimeComputeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimeComputeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TimeComputeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimeComputeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TimeComputeFutureStub(channel);
  }

  /**
   */
  public static abstract class TimeComputeImplBase implements io.grpc.BindableService {

    /**
     */
    public void time(io.grpc.clockSync.ClockSync.reqTimeObj request,
        io.grpc.stub.StreamObserver<io.grpc.clockSync.ClockSync.resTimeObj> responseObserver) {
      asyncUnimplementedUnaryCall(getTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.clockSync.ClockSync.reqTimeObj,
                io.grpc.clockSync.ClockSync.resTimeObj>(
                  this, METHODID_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class TimeComputeStub extends io.grpc.stub.AbstractStub<TimeComputeStub> {
    private TimeComputeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimeComputeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeComputeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimeComputeStub(channel, callOptions);
    }

    /**
     */
    public void time(io.grpc.clockSync.ClockSync.reqTimeObj request,
        io.grpc.stub.StreamObserver<io.grpc.clockSync.ClockSync.resTimeObj> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TimeComputeBlockingStub extends io.grpc.stub.AbstractStub<TimeComputeBlockingStub> {
    private TimeComputeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimeComputeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeComputeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimeComputeBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.clockSync.ClockSync.resTimeObj time(io.grpc.clockSync.ClockSync.reqTimeObj request) {
      return blockingUnaryCall(
          getChannel(), getTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TimeComputeFutureStub extends io.grpc.stub.AbstractStub<TimeComputeFutureStub> {
    private TimeComputeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimeComputeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeComputeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimeComputeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.clockSync.ClockSync.resTimeObj> time(
        io.grpc.clockSync.ClockSync.reqTimeObj request) {
      return futureUnaryCall(
          getChannel().newCall(getTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimeComputeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TimeComputeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TIME:
          serviceImpl.time((io.grpc.clockSync.ClockSync.reqTimeObj) request,
              (io.grpc.stub.StreamObserver<io.grpc.clockSync.ClockSync.resTimeObj>) responseObserver);
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

  private static abstract class TimeComputeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TimeComputeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.clockSync.ClockSync.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TimeCompute");
    }
  }

  private static final class TimeComputeFileDescriptorSupplier
      extends TimeComputeBaseDescriptorSupplier {
    TimeComputeFileDescriptorSupplier() {}
  }

  private static final class TimeComputeMethodDescriptorSupplier
      extends TimeComputeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TimeComputeMethodDescriptorSupplier(String methodName) {
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
      synchronized (TimeComputeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TimeComputeFileDescriptorSupplier())
              .addMethod(getTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
