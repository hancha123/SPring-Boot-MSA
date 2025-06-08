package com.example.app1.client;

import com.example.common.dto.GreetingDto;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class App2Client {

    private final RestTemplate restTemplate;
    private final String app2BaseUrl;

    /**
     * app2.url은 application.yaml 또는 application.properties에서 찾아 온다.
     * @param restTemplate
     * @param app2BaseUrl
     */
    public App2Client(RestTemplate restTemplate, @Value("${app2.url}") String app2BaseUrl) {
        this.restTemplate = restTemplate;
        this.app2BaseUrl = app2BaseUrl;
    }

    public GreetingDto getGreetingFromApp2() {
        return restTemplate.getForObject(app2BaseUrl + "/greeting", GreetingDto.class);
    }
    
    public List<GreetingDto> getGreetingListFromApp2() {
        GreetingDto[] response = restTemplate.getForObject(app2BaseUrl + "/greetingList", GreetingDto[].class);
        return Arrays.asList(response);
    }
}
