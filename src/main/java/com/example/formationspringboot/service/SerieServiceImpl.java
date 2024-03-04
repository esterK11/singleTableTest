package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Episode;
import com.example.formationspringboot.entities.Saison;
import com.example.formationspringboot.entities.Serie;
import com.example.formationspringboot.repositories.EpisodeRepo;
import com.example.formationspringboot.repositories.SaisonRepo;
import com.example.formationspringboot.repositories.SerieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    SerieRepo serieRepo;

    @Autowired
    SaisonRepo saisonRepo;

    @Autowired
    EpisodeRepo episodeRepo;
    @Override
    public List<Serie> getAllSeries() {
        return serieRepo.findAll();
    }

    @Override
    public Serie createSerie(Serie serie) {
        return serieRepo.save(serie);
    }

    @Override
    public Saison createSaison(Saison saison) {
        return saisonRepo.save(saison);
    }

    @Override
    public List<Saison> getAllSaisonsBySerie() {
        return null;
    }

    @Override
    public List<Saison> getSaisonBySerie(Long id) {
//        Serie serie = serieRepo.findById(id).get();
          return saisonRepo.findAllSeasonsBySerieId(id);

    }


    @Override
    public Serie getSerieAndSaisons(Long serieId) {
        return serieRepo.findById(serieId).get();
    }

    @Override
    public Saison getSaisonAndEpisodes(Long saisonId) {
        return saisonRepo.findById(saisonId).get();
    }

    @Override
    public Episode createEpisode(Episode episode) {
        return episodeRepo.save(episode);
    }

    @Override
    public Optional<Saison> findSaisonBySeasonNbr(Long id) {
        return saisonRepo.findById(id);
    }

    @Override
    public List<Serie> findAllSeries() {
        return serieRepo.findAll();
    }

    @Override
    public List<Episode> getAllEpisodes() {
        return episodeRepo.findAll();
    }

    @Override
    public Episode getEpisodeById(Long id) {
        return episodeRepo.findById(id).get();
    }

//    @Override
//    public List<Saison> findSaisonsBySerieId(Long id) {
//        return saisonRepo.findAllBySerieId_Id(id);
//    }


}
