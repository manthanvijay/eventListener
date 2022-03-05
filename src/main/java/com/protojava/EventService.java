package com.protojava;

import com.wheelseye.proto.event.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class EventService {

    @GrpcClient("event")
    EventServiceGrpc.EventServiceBlockingStub blockingStub;

    @GrpcClient("event")
    EventServiceGrpc.EventServiceStub stub;

    @Autowired
    SancharService sancharService;


    private static final Logger LOG = LoggerFactory.getLogger(EventService.class);

    public String ping() {
        HealthResponse response = blockingStub.healthCheck(HealthRequest.newBuilder().build());
        return response.getPong();
    }

    @Async
    public String eventsToBeCaptured(String eventName) {
        stub.getEvents(GetEventRequest.newBuilder().setEventName(eventName).build(), new StreamObserver<GetEventResponse>() {
            @Override
            public void onNext(GetEventResponse value) {

                sancharService.sendWhatsappMessage();
                LOG.info("onNext-{}", value.getEventName());
            }

            @Override
            public void onError(Throwable t) {
                LOG.info("onError", t);
            }

            @Override
            public void onCompleted() {
                LOG.info("onCompleted");
            }
        });
        return "ok";
    }
}
