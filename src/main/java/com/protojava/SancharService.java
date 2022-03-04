package com.protojava;

import org.springframework.stereotype.Service;

import com.wheelseye.proto.sanchar.SancharServiceGrpc;
import com.wheelseye.proto.sanchar.WhatsappRequest;
import com.wheelseye.proto.sanchar.WhatsappResponse;

import net.devh.boot.grpc.client.inject.GrpcClient;



@Service
public class SancharService {

    @GrpcClient(value = "sanchar")
    private SancharServiceGrpc.SancharServiceBlockingStub blockingStub;


    public void sendWhatsappMessage(String num,String serv) {
        WhatsappRequest request = WhatsappRequest.newBuilder()
                .setTemplateName("nameste_whatsapp_en_1")
                .setPhoneNumber(num)
                .setOrigin(serv)
                .putAnalyticsLabels("","")
                .addPlaceholders("")
                .build();
        WhatsappResponse response = blockingStub.sendWhatsapp(request);

    }
}
