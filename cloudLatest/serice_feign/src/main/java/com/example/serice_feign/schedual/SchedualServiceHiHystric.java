package com.example.serice_feign.schedual;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceTest {
    @Override
    public String testFromClientOne(String name) {
        return "fegin Error!";
    }
}
