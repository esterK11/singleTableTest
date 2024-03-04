package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Film;
import com.example.formationspringboot.entities.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FilmService {

    public List<Film> getAllFilms();


    List<Film> getFilmsByUser(Utilisateur addedBy);

    Film createFilm(Film film);
}
