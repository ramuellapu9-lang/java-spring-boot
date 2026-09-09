package com.example.demo.service;

import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoRepository demoRepository;
    public DemoService(DemoRepository demoRepository){
        this.demoRepository =  demoRepository;
    }

    public String getTest(){
        return "this demo get test";
    }

    public int getNumber(){
        return 1234;
    }

    public Demo storeData(Demo demo){
        return demoRepository.save(demo);
    }
}
