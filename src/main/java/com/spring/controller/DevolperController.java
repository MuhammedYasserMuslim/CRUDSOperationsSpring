package com.spring.controller;

import com.spring.model.Devolper;
import com.spring.services.DevolperServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devolper")
//http://localhost:8080/devolper
public class DevolperController {

    @Autowired
    DevolperServices devolperServices;

    @GetMapping("/get")
    //http://localhost:8080/devolper/get
    public List<Devolper> getAllDevolpers(){
        return devolperServices.getAllDevolper();
    }

    @GetMapping("/getbyid")
    //http://localhost:8080/devolper/getbyid?id = id
    public Optional<Devolper> getDevolperById(@RequestParam Long id){
        return devolperServices.getDevolperById(id);
    }

    @PostMapping("/save")
    //http://localhost:8080/devolper/save
    public void saveDevolper(Devolper devolper){
        devolperServices.savaDevolper(devolper);
    }

    @DeleteMapping("del")
    //http://localhost:8080/devolper/del?id=
    public void deleteDevolper(@RequestParam Long id){
        devolperServices.removeDevolper(id);
    }
}
