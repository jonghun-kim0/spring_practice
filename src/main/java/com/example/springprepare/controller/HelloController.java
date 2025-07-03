package com.example.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("api/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }
}
