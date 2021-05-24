package com.patrick.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String test(){
        return "/pages/home";
    }

    @RequestMapping("/test")
    public String test2(){
        System.out.println("This is a fine message");
        return "/pages/test/test";
    }
}
