package com.moonshot.testapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {

    @RequestMapping("/")
    public String testApp(){
        return"Hi, First app";
    }
}
