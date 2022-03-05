package com.protojava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wheelseye.proto.sanchar.SancharServiceGrpc;
import com.wheelseye.proto.sanchar.WhatsappRequest;
import com.wheelseye.proto.sanchar.WhatsappResponse;

import net.devh.boot.grpc.client.inject.GrpcClient;



@Service
public class SancharService {

    @GrpcClient(value = "sanchar")
    private SancharServiceGrpc.SancharServiceBlockingStub blockingStub;

    private static final Logger LOG = LoggerFactory.getLogger(SancharService.class);

    public void sendWhatsappMessage() {
        WhatsappRequest request = WhatsappRequest.newBuilder()
                .setTemplateName("otpmsgalert")
                .setPhoneNumber("8387921296")
                .setOrigin("po")
                .build();
        WhatsappResponse response = blockingStub.sendWhatsapp(request);
        LOG.info(response.getMessageId());
    }
}
