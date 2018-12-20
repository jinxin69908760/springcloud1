package com.star.feignclient.service;

import com.star.feignclient.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client",fallback = HelloServiceImpl.class)
public interface  HelloService {

    @RequestMapping(value = "/hello")
     public String hi();



}
