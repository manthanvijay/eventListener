package com.protojava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private EventService eventService;

    @GetMapping("/test")
    public void testController() {
        eventService.ping();
    }

    @GetMapping("/getEvent")
    public String getEvent(@RequestParam String eventName) {
        return eventService.eventsToBeCaptured(eventName);
    }
}
