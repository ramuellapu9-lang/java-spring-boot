package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.entity.User;
import com.example.demo.service.PersonService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final PersonService personService;

    public UserController(UserService userService,PersonService personService) {
        this.userService = userService;
        this.personService =personService;
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping("/testing")
    public String testing(@RequestParam String name,@RequestParam int age){
        return name+" "+age;
    }

    @GetMapping("/testing/{demo}")
    public String testing2(@PathVariable String demo,@RequestParam String name,@RequestParam int age){
        return demo+name+age;
    }

    @PostMapping("/save-person-data")
    public Person savePersonData(@RequestBody Person person){
        return personService.savePerson(person);
    }
    @GetMapping("getperson/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personService.getPerson(id);
    }
}