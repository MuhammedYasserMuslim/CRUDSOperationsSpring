package com.spring.services;

import com.spring.model.Devolper;
import com.spring.repository.DevolperRepository;
import com.spring.services.servicesinterfaces.DevolperServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevolperServices implements DevolperServicesInterface {

    @Autowired
    DevolperRepository devolperRepository;
    @Override
    public List<Devolper> getAllDevolper() {
        return devolperRepository.findAll();
    }

    @Override
    public Optional<Devolper> getDevolperById(Long id) {
        return devolperRepository.findById(id);
    }

    @Override
    public void savaDevolper(Devolper devolper) {
        devolperRepository.save(devolper);
    }
    @Override
    public void removeDevolper(Long id) {
        devolperRepository.deleteById(id);

    }
}
