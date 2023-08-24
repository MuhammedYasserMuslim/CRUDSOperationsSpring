package com.spring.services;

import com.spring.model.Client;
import com.spring.repository.ClientRepository;
import com.spring.services.servicesinterfaces.ClientServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices implements ClientServicesInterface {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }
    @Override
    public Optional<Client> getClientById(int id) {
        return clientRepository.findById(id);
    }
    @Override
    public void savaClient(Client client) {
        clientRepository.save(client);

    }
    @Override
    public void removeClient(int id) {
        clientRepository.deleteById(id);

    }
}
