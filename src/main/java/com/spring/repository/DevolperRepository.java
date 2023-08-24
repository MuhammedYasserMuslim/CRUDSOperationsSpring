package com.spring.repository;

import com.spring.model.Devolper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DevolperRepository extends JpaRepository<Devolper,Long> {
    /*
        Get      http://localhost:8080/devolpers
        Get      http://localhost:8080/devolpers/id
        Post     http://localhost:8080/devolpers      body Player
        Put      http://localhost:8080/devolpers      body Player
        Delete   http://localhost:8080/devolpers/id
     */
}
