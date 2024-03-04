package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Film;
import com.example.formationspringboot.entities.Utilisateur;
import com.example.formationspringboot.repositories.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmRepo filmRepo;

    @Override
    public List<Film> getAllFilms() {
        return filmRepo.findAll();
    }

    @Override
    public List<Film> getFilmsByUser(Utilisateur addedBy) {
        return filmRepo.findFilmsByUser(addedBy);
    }

    @Override
    public Film createFilm(Film film) {
        return filmRepo.save(film);
    }

}
