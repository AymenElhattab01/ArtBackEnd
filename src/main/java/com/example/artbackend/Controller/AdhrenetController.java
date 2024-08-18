package com.example.artbackend.Controller;

import com.example.artbackend.Entities.Utilisateur;
import com.example.artbackend.Entities.adherent;
import com.example.artbackend.Repository.UtilisateurRepository;
import com.example.artbackend.Service.ServiceUtilisateur;
import jakarta.servlet.http.HttpServlet;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/Adhrent")
@RestController
public class AdhrenetController {
    @Autowired
    ServiceUtilisateur SU;
    @Autowired
    UtilisateurRepository AR;

    @PostMapping("/add")
    public ResponseEntity<HttpServlet> add(@RequestParam int id , @RequestBody adherent ad){
        try {
            Optional<Utilisateur> u = AR.findById(id);
            ad.setUtilisateur(u.get());
            SU.addadhrenet(ad );
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
