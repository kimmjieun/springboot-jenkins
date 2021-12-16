package com.example.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String hello(){
        System.out.println("** test **");
        return "Hello Spring Boot";
    }

    @GetMapping("/test")
    public String test(){
        return "Hello Jenkins Test 12:23";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi Hi Jenkins Test";
    }


    @GetMapping("/test/second")
    public String test2(){
        return "Second Test";
    }
}
