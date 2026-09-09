package com.example.demo.service;
import com.example.demo.repository.PersonRepository;
import com.example.demo.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person savePerson(Person person){
        return personRepository.save(person);


    }

    public Optional<Person> getPerson(Long id){
        return  personRepository.findById(id);
    }

}
