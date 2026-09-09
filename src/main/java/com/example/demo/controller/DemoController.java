package com.example.demo.controller;

import com.example.demo.service.DemoService;
import com.example.demo.entity.Demo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/test")
    public String getTest(){
        return demoService.getTest();
    }

    @GetMapping("test2")
    public int getNumber(){
        return demoService.getNumber();
    }
    @PostMapping("get-demo")

    public Demo getData(@RequestBody Demo demo){
        return demoService.storeData(demo);

    }

}
