package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(value = {"/hello"})
public class helloController {
 
    @RequestMapping(value = {"/springboot"})
    public String hello(){
        return "HelloWord 呵呵";
    }
}