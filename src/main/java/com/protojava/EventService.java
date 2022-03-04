package com.protojava;

import com.wheelseye.proto.event.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class EventService extends EventServiceGrpc.EventServiceImplBase {

    @GrpcClient("event")
    EventServiceGrpc.EventServiceBlockingStub blockingStub;

    public String ping() {
        HealthResponse response = blockingStub.healthCheck(HealthRequest.newBuilder().setPing("hello").build());
        return response.getPong();
    }


}
