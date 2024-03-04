package com.example.formationspringboot.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@DiscriminatorValue("Film")
public class Film extends MultimediaContent {

    private Integer release_year;
    private String video;

    @OneToMany(mappedBy = "media")
    @JsonManagedReference
    private List<Score> scores;

    public Film(Long id, String titre, String description, String image1, Double duration, LocalDateTime created_at, LocalDateTime modified_at, Utilisateur addedBy, Integer release_year, String video, List<Score> scores) {
        super(id, titre, description, image1, duration, created_at, modified_at, addedBy);
        this.release_year = release_year;
        this.video = video;
        this.scores = scores;
    }


    public Film() {
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}