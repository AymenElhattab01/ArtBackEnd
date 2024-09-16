package com.example.artbackend.Service;

import com.example.artbackend.Entities.Media;
import com.example.artbackend.Repository.MediaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    @Autowired
    MediaInterface MI;


    public  void   AddMedia(Media media){
         MI.save(media);
    }
}
