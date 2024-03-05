package com.example.formationspringboot.controllers;

import com.example.formationspringboot.entities.*;
import com.example.formationspringboot.service.FilmService;
import com.example.formationspringboot.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("multimedia/serie")
public class SerieController {

    @Autowired
    private SerieService serieService;


//    shows only serieEntity - OK
    @GetMapping("/All")
    public List<Serie> getAllSeries() {
        return serieService.getAllSeries(); // Utilisez le service pour récupérer tous les films
    }

    @PostMapping("/create")
    public Serie createSerie(@RequestBody Serie serie) {
        return serieService.createSerie(serie);
    }

    @PostMapping("/saison/create")
    public Saison createSaison(@RequestBody Saison saison) {
        return serieService.createSaison(saison);
    }

    @GetMapping("/Allsaison/")
    public List<Saison> getAllSaisonsBySerie() {
        return serieService.getAllSaisonsBySerie(); // Utilisez le service pour récupérer tous les films
    }

    @GetMapping("Test/{id}")
    public List<Saison> getSaisonBySerie(@PathVariable("id") Long id) {

        return serieService.getSaisonBySerie(id);
    }

    //show serie avec Score + saisons_card
    @GetMapping("/{SerieId}")
    public Serie getSerieAndSaisons(@PathVariable("SerieId") Long SerieId) {

        return serieService.getSerieAndSaisons(SerieId);
    }
/* Souad a mis en commentaire car doublon*/

//    @GetMapping("/saison/{id}")
//    public Saison getSaisonAndEpisodes(@PathVariable("SaisonId") Long SaisonId) {
//        return serieService.getSaisonAndEpisodes(SaisonId);
//    }

//        loading with named graphentity - ok
    @GetMapping("/season/{id}")
    public Optional<Saison> findSaisonBySeasonNbr(@PathVariable("id") Long id) {
        return serieService.findSaisonBySeasonNbr(id);
    }

    //gets only saisons d'un serie(id) - not what we are looking for?
//    @GetMapping("/seasonentity/{id}")
//    public List<Saison> findSaisonsBySerieId(@PathVariable("id") Long id) {
//        return serieService.findSaisonsBySerieId(id);
//    }

    @PostMapping("/episode/create")
    public Episode createEpisode(@RequestBody Episode episode) {
        return serieService.createEpisode(episode);
    }

    @GetMapping("/saison/episode/{id}")
    public Episode getEpisodeById(@PathVariable("id") Long id){
        return serieService.getEpisodeById(id);
    }

//    @GetMapping("/all/episodes")
//    public List<Episode> getAllEpisodes(){
//        return serieService.getAllEpisodes();
//    }
}
