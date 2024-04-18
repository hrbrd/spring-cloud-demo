package com.hrbrd.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class UserController {

    @Value("${app.user}")
    private String appUser;

    @Value("${eureka.instance.instance-id}")
    private String value;

    @GetMapping
    public String hello() {
        return "Hello from user-service; instanceId: " + value + "; appUser: " + appUser;
    }

}