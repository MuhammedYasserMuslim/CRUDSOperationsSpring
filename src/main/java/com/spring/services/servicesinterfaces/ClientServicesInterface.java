package com.spring.services.servicesinterfaces;

import com.spring.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientServicesInterface {

    public List<Client> getClients();

    public Optional<Client> getClientById(int id);

    public void savaClient(Client client);

    public void removeClient(int id);
}
