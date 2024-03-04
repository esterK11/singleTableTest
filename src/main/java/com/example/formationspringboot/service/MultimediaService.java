package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.MultimediaContent;
import com.example.formationspringboot.entities.Utilisateur;

import java.util.List;

public interface MultimediaService {
    public List<MultimediaContent> getAllMultimedias();
    List<MultimediaContent> getAllMediaByUserId(Utilisateur utilisateur);

    List<MultimediaContent> getAllFilmsAndSeries();
}
