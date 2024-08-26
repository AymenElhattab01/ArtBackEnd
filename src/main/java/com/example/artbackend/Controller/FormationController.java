package com.example.artbackend.Controller;

import com.example.artbackend.Entities.Formation;
import com.example.artbackend.Service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Formation")
public class FormationController {
    @Autowired
    private FormationService formationService;


    @GetMapping("/GetFormation")
    public ResponseEntity<List<Formation>> GetFormation() {
        try {
            List<Formation> formations = formationService.GetAllFormation();
            return ResponseEntity.ok(formations );
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

}
