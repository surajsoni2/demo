package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping(value = "/say-hi", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHi(){
     return "Hello world This is Suraj Soni, Testing the deployment of springboot application";
    }
}
