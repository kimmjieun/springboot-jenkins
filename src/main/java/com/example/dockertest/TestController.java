package com.example.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/test")
    public String test(){
        return "Hello Jenkins Test";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi Hi Jenkins Test";
    }
}
