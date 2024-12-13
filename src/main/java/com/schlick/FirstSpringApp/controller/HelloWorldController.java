package com.schlick.FirstSpringApp.controller;

import com.schlick.FirstSpringApp.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Mariana");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody String body) {
        return "Hello World Post";
    }
}
