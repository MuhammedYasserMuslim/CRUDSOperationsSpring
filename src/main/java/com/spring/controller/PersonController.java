package com.spring.controller;

import com.spring.model.Person;
import com.spring.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonServices personServices;

    //http://localhost:8080/person/get
    @GetMapping("get")
    public List<Person> getPersons(){
        return personServices.getPersons();
    }

    //http://localhost:8080/person/get/id
    @GetMapping("get/{id}")
    public Optional<Person> getById(@PathVariable("id") int id){
        return personServices.getPersonById(id);
    }

    //http://localhost:8080/person/getbyid?id = id
    @GetMapping("getbyid")
    public Optional<Person> getByIdR(@RequestParam int id){
        return personServices.getPersonById(id);
    }
    //http://localhost:8080/person/post
    @PostMapping("/post")
    public void savePerson(Person person){
        personServices.addPlayer(person);
    }

    //http://localhost:8080/person/del?id=id
    @DeleteMapping("/del")
    public void deletePerson( @RequestParam  int id){
        personServices.removePerson(id);
    }
}
