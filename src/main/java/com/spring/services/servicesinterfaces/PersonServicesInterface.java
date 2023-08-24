package com.spring.services.servicesinterfaces;

import com.spring.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonServicesInterface {

    public List<Person> getPersons();

    public Optional<Person> getPersonById(int id);

    public void addPlayer(Person person );

    public void removePerson(int id);
}
