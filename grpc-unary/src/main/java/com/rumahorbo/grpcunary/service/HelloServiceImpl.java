package com.rumahorbo.grpcunary.service;

import com.rumahorbo.grpcunary.HelloRequest;
import com.rumahorbo.grpcunary.HelloResponse;
import com.rumahorbo.grpcunary.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String name = request.getName();
        System.out.println("Received Name: " + name);

        HelloResponse response = HelloResponse.newBuilder()
                .setName("Hello from Server " + name + ". I received your message").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
