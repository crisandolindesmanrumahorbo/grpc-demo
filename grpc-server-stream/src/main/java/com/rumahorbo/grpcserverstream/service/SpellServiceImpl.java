package com.rumahorbo.grpcserverstream.service;

import com.rumahorbo.grpserverstream.SpellServiceGrpc;
import com.rumahorbo.grpserverstream.WordRequest;
import com.rumahorbo.grpserverstream.WordResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SpellServiceImpl extends SpellServiceGrpc.SpellServiceImplBase {

    @Override
    public void spell(WordRequest request, StreamObserver<WordResponse> responseObserver) {
        String word = request.getWord();
        System.out.println("Received Word: " + word);

        for (int i = 0; i < word.length(); i++) {
            String character = word.substring(i, i + 1);

            WordResponse response = WordResponse.newBuilder()
                    .setWord(character)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

}
