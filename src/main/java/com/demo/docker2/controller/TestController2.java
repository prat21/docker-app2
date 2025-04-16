package com.demo.docker2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/app2")
public class TestController2 {

    @GetMapping("/test")
    public String test(){
        return "testing docker app 2";
    }
}
