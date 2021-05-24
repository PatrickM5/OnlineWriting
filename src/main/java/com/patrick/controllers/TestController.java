package com.patrick.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/123")
    public String test(){
        return "/pages/test/test";
    }

}
