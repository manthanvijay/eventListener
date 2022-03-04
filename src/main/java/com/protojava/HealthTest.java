package com.protojava;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class HealthTest {

    @GrpcClient(value = "sanchar")
    private GreeterGrpc.GreeterBlockingStub blockingStub;

    public String sendWhatsappMessage() {
        HelloReply response = blockingStub.sayHello(HelloRequest.newBuilder()
                .setName("Manthan")
                .build());
        return response.getMessage();
    }
}


// response.getMessageId(); sanchar message id for future reference
