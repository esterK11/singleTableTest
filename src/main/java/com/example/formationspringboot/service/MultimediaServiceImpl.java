package com.example.formationspringboot.service;


import com.example.formationspringboot.entities.MultimediaContent;
import com.example.formationspringboot.entities.Utilisateur;
import com.example.formationspringboot.repositories.MultimediaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultimediaServiceImpl implements MultimediaService{
    @Autowired
    MultimediaRepo multimediaRepo;

    @Override
    public List<MultimediaContent> getAllMultimedias() {

        return multimediaRepo.findAll();
    }

    @Override
    public List<MultimediaContent> getAllMediaByUserId(Utilisateur utilisateur) {
        return multimediaRepo.findByAddedBy(utilisateur);
    }

    @Override
    public List<MultimediaContent> getAllFilmsAndSeries() {
        return multimediaRepo.getAll();
    }
}
