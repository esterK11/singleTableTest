package com.example.formationspringboot.entities;


import com.example.formationspringboot.serializers.SaisonIdSerializer;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedEntityGraph(name = "serie.saisons", attributeNodes = {
        @NamedAttributeNode("saisons"),
        @NamedAttributeNode("scores")
}
)
@DiscriminatorValue("Serie")

public class Serie extends MultimediaContent {

    private Integer startYear; // int ou integer?
    private Integer lastYear;
    private String video;

    private Integer nbrSaison;
    //OneToMany has fetchType.LAZY by default
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "serieId")

//    @JsonManagedReference
    private List<Saison> saisons = new ArrayList<>();

    @OneToMany(mappedBy = "media")
//    @JsonManagedReference
    private List<Score> scores;
//should be a set to avoid duplicates

    public Serie() {
    }

    public Serie(Long id, String titre, String description, String image1, Double duration, LocalDateTime created_at, LocalDateTime modified_at, Utilisateur addedBy, Integer startYear, Integer lastYear, String video, Integer nbrSaison, List<Saison> saisons, List<Score> scores) {
        super(id, titre, description, image1, duration, created_at, modified_at, addedBy);
        this.startYear = startYear;
        this.lastYear = lastYear;
        this.video = video;
        this.nbrSaison = nbrSaison;
        this.saisons = saisons;
        this.scores = scores;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getLastYear() {
        return lastYear;
    }

    public void setLastYear(Integer lastYear) {
        this.lastYear = lastYear;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Integer getNbrSaison() {
        return nbrSaison;
    }

    public void setNbrSaison(Integer nbrSaison) {
        this.nbrSaison = nbrSaison;
    }

    public List<Saison> getSaisons() {
        return saisons;
    }

    public void setSaisons(List<Saison> saisons) {
        this.saisons = saisons;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}