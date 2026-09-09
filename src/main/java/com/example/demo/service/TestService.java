package com.example.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    public final TestRepository testRepository;

    public TestService(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    public Test save(Test test){

        return  testRepository.save(test);
    }

    public List<Test> getAllList(){
        return testRepository.findAll();
    }

    public Optional<Test> getTest(Long id){
        return testRepository.findById(id);
    }

    public String deleteTest(Long id){
        testRepository.deleteById(id);
        return "Deleted Successfully";

    }

    public Test updateTest(Test test){
        return testRepository.save(test);
    }

}
