package com.spring.repository;

import com.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person,Integer> {
    /*
        Get      http://localhost:8080/persons
        Get      http://localhost:8080/persons/id
        Post     http://localhost:8080/persons      body Player
        Put      http://localhost:8080/persons      body Player
        Delete   http://localhost:8080/persons/id
     */
}
