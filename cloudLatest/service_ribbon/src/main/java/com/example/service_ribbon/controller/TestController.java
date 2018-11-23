package com.example.service_ribbon.controller;

import com.example.service_ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping(value = "/test")
    public String test(@RequestParam String name) {
        return testService.testService(name);
    }
}
