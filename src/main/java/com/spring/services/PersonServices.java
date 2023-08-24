package com.spring.services;

import com.spring.model.Person;
import com.spring.repository.PersonRepository;
import com.spring.services.servicesinterfaces.PersonServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServices implements PersonServicesInterface {


    @Autowired
    PersonRepository personRepository;
    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getPersonById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public void addPlayer(Person person) {
        personRepository.save(person);
    }

    @Override
    public void removePerson(int id) {
        personRepository.deleteById(id);

    }
}
