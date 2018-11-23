package com.example.service_ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getError")
    public String testService(String name) {
        return restTemplate.getForObject("http://EUREKA-TEST/test?name="+name,String.class);
    }

    public String getError(String name) {
        return "you got an error!";
    }
}
