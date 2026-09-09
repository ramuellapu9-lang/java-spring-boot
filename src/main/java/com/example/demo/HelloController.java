package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Bootddd";
    }
    @GetMapping("/testing/{number}")
    public String getNumber(@PathVariable int number){
        return "your entedrd number" + number;
    }
    @PostMapping("/sample")
    public String saveData(){
        return "data saved successsddddfully";
    }

}