package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {
    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}