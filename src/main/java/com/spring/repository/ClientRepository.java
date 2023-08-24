package com.spring.repository;

import com.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Integer> {
    /*
        Get      http://localhost:8080/clients
        Get      http://localhost:8080/clients/id
        Post     http://localhost:8080/clients      body Player
        Put      http://localhost:8080/clients      body Player
        Delete   http://localhost:8080/clients/id
     */
}
