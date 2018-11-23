package com.example.serice_feign.schedual;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-test", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceTest {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String testFromClientOne(@RequestParam(value = "name") String name);
}
