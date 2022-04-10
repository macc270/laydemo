package com.example.laydemo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello springboot!";
    }
}
