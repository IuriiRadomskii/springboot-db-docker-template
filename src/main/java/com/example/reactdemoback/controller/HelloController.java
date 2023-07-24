package com.example.reactdemoback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class HelloController {

    private static int i = 0;

    @PostMapping(path = "/plus")
    public String hello(@RequestBody String foo) {
        log.info("foo = {}", foo);
        return "Hello: i = " + ++i;
    }

    @PostMapping(path = "/minus")
    public String bye(@RequestBody String bar) {
        log.info("bar = {}", bar);
        return "Bye ! i = " + --i;
    }



}
