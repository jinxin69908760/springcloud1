package com.star.feignclient.controller;


import com.star.feignclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "feign-consumer")
    public String helloConsumer(){
        return helloService.hi();
    }
}
