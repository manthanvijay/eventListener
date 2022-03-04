package com.protojava;

import com.wheelseye.proto.event.EventResponse;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;

public class StreamListener implements StreamObserver<EventResponse> {

    @Override
    public void onNext(EventResponse eventResponse) {
        System.out.println(LocalDateTime.now() + " : " + eventResponse.getResponse());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }
}
