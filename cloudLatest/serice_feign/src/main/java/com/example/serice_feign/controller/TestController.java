package com.example.serice_feign.controller;

import com.example.serice_feign.schedual.SchedualServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    SchedualServiceTest schedualServiceTest;

    @GetMapping(value = "test")
    public String testFeign(@RequestParam String name) {
        return schedualServiceTest.testFromClientOne(name);
    }
}
