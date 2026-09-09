package com.example.demo.controller;
import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("test")
public class TestController {

    private final TestService testService;
    public TestController(TestService testService){
        this.testService = testService;
    }

    @PostMapping("/save_test")

    public Test Testing(@RequestBody Test test){

        return testService.save(test);
    }

    @GetMapping("/test_list")

    public List<Test> testList(){
        return testService.getAllList();
    }

    @GetMapping("gettest/{id}")

    public Optional<Test> getTest(@PathVariable Long id){
        return testService.getTest(id);
    }
    @DeleteMapping("testdelete/{id}")

    public String deleteTest(@PathVariable Long id){
        return testService.deleteTest(id);
    }

    @PutMapping("/updatetest")

    public Test updateTest(@RequestBody Test test){
        return testService.updateTest(test);
    }


}
