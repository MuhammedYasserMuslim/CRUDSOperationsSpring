package com.spring.services.servicesinterfaces;

import com.spring.model.Devolper;

import java.util.List;
import java.util.Optional;

public interface DevolperServicesInterface {

    public List<Devolper> getAllDevolper();

    public Optional<Devolper> getDevolperById(Long id);

    public void savaDevolper (Devolper devolper);

    public void removeDevolper(Long id);
}
