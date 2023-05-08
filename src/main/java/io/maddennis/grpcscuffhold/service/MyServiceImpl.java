package io.maddennis.grpcscuffhold.service;

import io.grpc.stub.StreamObserver;
import io.maddennis.hello.HelloReply;
import io.maddennis.hello.HelloRequest;
import io.maddennis.hello.MyServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
