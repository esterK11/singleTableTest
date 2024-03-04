package com.example.formationspringboot.controllers;

import com.example.formationspringboot.entities.Film;
import com.example.formationspringboot.entities.MultimediaContent;
import com.example.formationspringboot.entities.Utilisateur;
import com.example.formationspringboot.service.FilmService;
import com.example.formationspringboot.service.MultimediaService;
import com.example.formationspringboot.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/multimedia")
public class MultimediaController {

    @Autowired
    private MultimediaService multimediaService;

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private FilmService filmService;

    @GetMapping("/All")
    public List<MultimediaContent> getAllMultimedias() {
        return multimediaService.getAllMultimedias(); // Utilisez le service pour récupérer tous les films
    }

    @GetMapping("/user/{addedBy}")
    public List<MultimediaContent> getMultimediaByUser(@PathVariable("addedBy") Long userId) {
        // Récupérer l'utilisateur à partir de l'ID (vous devrez implémenter cette logique)
        Utilisateur utilisateur = utilisateurService.getUserById(userId);
        // Récupérer tous les multimedia ajoutés par l'utilisateur
        return multimediaService.getAllMediaByUserId(utilisateur);
    }

    @GetMapping("/user/{addedBy}/films")
    public List<Film> getFilmsByUser(@PathVariable("addedBy") Long addedBy) {
        Utilisateur utilisateur = utilisateurService.getUserById(addedBy);
        return filmService.getFilmsByUser(utilisateur);
    }

    @GetMapping("/filmsandseries")
    public List<MultimediaContent> getAllFilmsAndSeries() {
        return multimediaService.getAllFilmsAndSeries();
    }
}
