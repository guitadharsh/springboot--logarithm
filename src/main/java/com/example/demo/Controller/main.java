package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Main{

    @GetMapping(value={"/","home"})
    public String indexPage(){
        return "index";
    }
}