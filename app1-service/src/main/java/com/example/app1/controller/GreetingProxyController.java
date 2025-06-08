package com.example.app1.controller;

import com.example.app1.client.App2Client;
import com.example.common.dto.GreetingDto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingProxyController {

    private final App2Client app2Client;

    public GreetingProxyController(App2Client app2Client) {
        this.app2Client = app2Client;
    }


    /**
     * http://localhost:8081/proxy-greeting
     * @return
     */
    @GetMapping("/proxy-greeting")
    public GreetingDto proxyGreeting() {
        return app2Client.getGreetingFromApp2();
    }
    
    /**
     * http://localhost:8081/proxy-greetingList
     * @return
     */
    @GetMapping("/proxy-greetingList")
    public List<GreetingDto> proxyGreetingList() {
        return (List<GreetingDto>) app2Client.getGreetingListFromApp2();
    }
}
