package com.example.artbackend.Controller;

import com.example.artbackend.Entities.Evenement;
import com.example.artbackend.Service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Evenemet")
@CrossOrigin(origins = "http://localhost:4200")
public class EvenementController {
    @Autowired
    EvenementService ES;



    @GetMapping("/GetAll")
    public ResponseEntity<List<Evenement>> GetAll() {
        try {

            List<Evenement> evenements = ES.GetAllEvents();
            return ResponseEntity.ok(evenements);
        }catch (Exception e ){
            return ResponseEntity.status(500).body(null);
        }

    }

}
