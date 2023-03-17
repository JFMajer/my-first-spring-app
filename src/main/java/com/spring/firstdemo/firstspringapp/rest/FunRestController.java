package com.spring.firstdemo.firstspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" endpoint and return Hello, World!
    @Value("${name}")
    private String name;
    @GetMapping("/")
    public String sayHello() {
        return "Hello " + name;
    }

    // expose "info" endpoint and return some info
    @GetMapping("/info")
    public String sayInfo() {
        return "This is a Spring Boot app";
    }
}