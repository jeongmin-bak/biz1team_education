package com.example.emptyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/swagger")
public class TestController {
    @GetMapping
    public String test(){
        return "hi";
    }

    @GetMapping("/test")
    public String test2(){
        return "hi2";
    }
}
