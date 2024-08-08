package com.example.artbackend.Service;

import com.example.artbackend.Entities.Artiste;
import com.example.artbackend.Entities.Tableau;
import com.example.artbackend.Repository.ArtisteRepository;
import com.example.artbackend.Repository.TableauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableauService {
@Autowired
TableauRepository TB;

@Autowired
ArtisteRepository AR;

public List<Artiste> GetArtistes(){
    return  AR.findAll();
}
public List<Tableau> GetTableau(int id ){
    return  TB.findByArtiste_Id(id);
}





}