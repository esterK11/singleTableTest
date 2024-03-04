package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Episode;
import com.example.formationspringboot.entities.Saison;
import com.example.formationspringboot.entities.Serie;

import java.util.List;
import java.util.Optional;

public interface SerieService {
    public List<Serie> getAllSeries();

    Serie createSerie(Serie serie);

    Saison createSaison(Saison saison);

    List<Saison> getAllSaisonsBySerie();

    List<Saison> getSaisonBySerie(Long id);

    Serie getSerieAndSaisons(Long serieId);

    Saison getSaisonAndEpisodes(Long saisonId);

    Episode createEpisode(Episode episode);

    Optional<Saison> findSaisonBySeasonNbr(Long id);

    List<Serie> findAllSeries();

    List<Episode> getAllEpisodes();

    Episode getEpisodeById(Long id);

    //check seasonrepo by id de serie
//    List<Saison> findSaisonsBySerieId(Long id);
}
