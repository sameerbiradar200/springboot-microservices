package com.sameer.user.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from User Service!";
    }
}

@RestController
class Dum{
    @GetMapping
    public String get() {
        return "Hello from Dum!";
    }

}
