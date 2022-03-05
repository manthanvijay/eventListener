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
public class EventService extends EventServiceGrpc.EventServiceImplBase {

    @GrpcClient("event")
    EventServiceGrpc.EventServiceBlockingStub blockingStub;
    @Autowired
    SancharService sancharService;


    private static final Logger LOG = LoggerFactory.getLogger(EventService.class);

    public String ping() {
        HealthResponse response = blockingStub.healthCheck(HealthRequest.newBuilder().build());
        return response.getPong();
    }

    @Async
    public String eventsToBeCaptured(String eventName) {
        getEvents(GetEventRequest.newBuilder().setEventName(eventName).build(), new StreamObserver<GetEventResponse>() {
            @Override
            public void onNext(GetEventResponse event) {
                event.getEventName();
                event.getPhoneNumber();
                sancharService.sendWhatsappMessage(event.getPhoneNumber(),"Event");
                // System.out.printf("%s %s", event.getEventName(), event.getPhoneNumber());
            }

            @Override
            public void onError(Throwable throwable) {
                LOG.error("error occured while throwing event to sanchar");
            }

            @Override
            public void onCompleted() {
                LOG.info("Process completed");
            }
        });
        return "Success";
    }
}
