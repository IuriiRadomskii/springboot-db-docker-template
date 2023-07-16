package com.example.reactdemoback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello !";
    }

    @GetMapping(path = "/bye")
    public String bye() {
        return "Bye !";
    }
}
