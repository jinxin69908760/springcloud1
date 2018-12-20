package com.star.feignclient.service.impl;

import com.star.feignclient.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
public class HelloServiceImpl implements HelloService {

    @RequestMapping("/hello")
    @Override
    public String hi() {
        return "come on";
    }
}
