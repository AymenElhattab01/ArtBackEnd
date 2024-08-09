package com.example.artbackend.Service;

import com.example.artbackend.Entities.Atelier;
import com.example.artbackend.Repository.AtelierRepository;
import com.example.artbackend.Repository.SousAtelierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtelierService {
    @Autowired
    AtelierRepository AR;

    @Autowired
    SousAtelierRepository SR;



    public List<Atelier> GetAllAtelier(){
        return  AR.findAll();
    }







}
