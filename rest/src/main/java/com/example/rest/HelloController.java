package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String getGreeting_withoutPath(){
        return "Hello! - without path";
    }
    @GetMapping("/rest")
    public String getGreeting_withPath(){
        return "Hello! - with path";
    }
}
