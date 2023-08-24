package com.spring.controller;

import com.spring.model.Client;
import com.spring.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientServices clientServices;

    //http://localhost:8080/client/get
    @GetMapping("/get")
    public List<Client> getClients(){
       return clientServices.getClients();
    }

    //http://localhost:8080/client/getbyid/id
    @GetMapping("/get/{id}")
    public Optional<Client> getClientsById(@PathVariable("id") int id){
       return clientServices.getClientById(id);
    }

    //http://localhost:8080/client/getbyid?id=2
    @GetMapping("/getbyid")
    public Optional<Client> getClientsByIdR(@RequestParam int id){
       return clientServices.getClientById(id);
    }
    //http://localhost:8080/client/del?id=id
    @DeleteMapping("/del")
    public void deleteClient( @RequestParam  int id){
        clientServices.removeClient(id);
    }



}
