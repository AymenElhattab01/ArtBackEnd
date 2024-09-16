package com.example.artbackend.Service;

import com.example.artbackend.Entities.Evenement;
import com.example.artbackend.Repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {
    @Autowired
    EvenementRepository ER ;



    public List<Evenement> GetAllEvents(){
    return ER.findAll();
    }




}
