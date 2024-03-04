package com.example.formationspringboot.entities;

import com.example.formationspringboot.entities.enums.StatutSaison;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@NamedEntityGraph(name = "saison.episodes", attributeNodes = {
        @NamedAttributeNode("episodes"),
        @NamedAttributeNode("scores")
})
@DiscriminatorValue("Saison")
public class Saison extends MultimediaContent{
    private int nbrEpisodes;
    private int seasonNbr;
    @Enumerated(EnumType.STRING)
    private StatutSaison statut;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serieid")
//    @JsonBackReference
//    @JsonIgnore
    private MultimediaContent serieId;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "saisonId")
//    @JsonManagedReference
    private List<Episode> episodes = new ArrayList<>();
    //should be SET to avoid duplications

    @OneToMany(mappedBy = "media")
//    @JsonManagedReference
    private List<Score> scores;

    public Saison() {
    }

    public Saison(Long id, String titre, String description, String image1, Double duration, LocalDateTime created_at, LocalDateTime modified_at, Utilisateur addedBy, int nbrEpisodes, int seasonNbr, StatutSaison statut, MultimediaContent serieId, List<Episode> episodes, List<Score> scores) {
        super(id, titre, description, image1, duration, created_at, modified_at, addedBy);
        this.nbrEpisodes = nbrEpisodes;
        this.seasonNbr = seasonNbr;
        this.statut = statut;
        this.serieId = serieId;
        this.episodes = episodes;
        this.scores = scores;
    }

    public int getNbrEpisodes() {
        return nbrEpisodes;
    }

    public void setNbrEpisodes(int nbrEpisodes) {
        this.nbrEpisodes = nbrEpisodes;
    }

    public int getSeasonNbr() {
        return seasonNbr;
    }

    public void setSeasonNbr(int seasonNbr) {
        this.seasonNbr = seasonNbr;
    }

    public StatutSaison getStatut() {
        return statut;
    }

    public void setStatut(StatutSaison statut) {
        this.statut = statut;
    }

    public MultimediaContent getSerieId() {
        return serieId;
    }

    public void setSerieId(Serie serieId) {
        this.serieId = serieId;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public void setSerieId(MultimediaContent serieId) {
        this.serieId = serieId;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
