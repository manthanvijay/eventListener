package com.protojava;

import com.wheelseye.proto.event.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class EventService extends EventServiceGrpc.EventServiceImplBase {

    @GrpcClient("event")
    EventServiceGrpc.EventServiceBlockingStub blockingStub;
    @GrpcClient("event")
    EventServiceGrpc.EventServiceImplBase     asyncStub;
    @Autowired
    SancharService sancharService;

    public String ping() {
        HealthResponse response = blockingStub.healthCheck(HealthRequest.newBuilder().setPing("hello").build());
        return response.getPong();
    }

    @Async
    public String eventsToBeCaptured(String eventName) {
        asyncStub.getEvents(GetEventRequest.newBuilder().setEventName(eventName).build(), new StreamObserver<GetEventResponse>() {
            @Override
            public void onNext(GetEventResponse event) {
                event.getEventName();
                event.getPhoneNumber();
                sancharService.sendWhatsappMessage(event.getPhoneNumber(),"Event");
                // System.out.printf("%s %s", event.getEventName(), event.getPhoneNumber());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });
        return "Success";
    }
}
