package com.example.formationspringboot.controllers;

import com.example.formationspringboot.entities.Film;
import com.example.formationspringboot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/all")
    public List<Film> getAllFilms() {
        return filmService.getAllFilms(); // Utilisez le service pour récupérer tous les films
    }

    @PostMapping("/create")
    public Film createFilm(@RequestBody Film film) {
        return filmService.createFilm(film);
    }


}

