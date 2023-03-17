package com.spring.firstdemo.firstspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" endpoint and return Hello, World!

    @GetMapping("/")
    public String sayHello() {
        return "Hello, world!";
    }
}
