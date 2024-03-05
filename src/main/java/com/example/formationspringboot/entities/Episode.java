package com.example.formationspringboot.entities;

import com.example.formationspringboot.serializers.SerieIdSerializer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@DiscriminatorValue("Episode")
@NamedEntityGraph(name = "episode.score", attributeNodes =
        @NamedAttributeNode("scores")
)
public class Episode extends MultimediaContent{
    private Integer numEpisode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "saisonId")
    @JsonBackReference
//    @JsonIgnore
    private MultimediaContent saisonId;

    @OneToMany(mappedBy = "media")
//    @JsonManagedReference
    private List<Score> scores;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serieId")
    @JsonSerialize(using = SerieIdSerializer.class)
//    @JsonBackReference
//    @JsonIgnore
    private MultimediaContent serieId;

    public Episode(Long id, String titre, String description, String image1, Double duration, LocalDateTime created_at, LocalDateTime modified_at, Utilisateur addedBy, Integer numEpisode, MultimediaContent saisonId, List<Score> scores, MultimediaContent serieId) {
        super(id, titre, description, image1, duration, created_at, modified_at, addedBy);
        this.numEpisode = numEpisode;
        this.saisonId = saisonId;
        this.scores = scores;
        this.serieId = serieId;
    }

    public Episode() {
    }

    public Integer getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(Integer numEpisode) {
        this.numEpisode = numEpisode;
    }

    public MultimediaContent getSaisonId() {
        return saisonId;
    }

    public void setSaisonId(MultimediaContent saisonId) {
        this.saisonId = saisonId;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public MultimediaContent getSerieId() {
        return serieId;
    }

    public void setSerieId(MultimediaContent serieId) {
        this.serieId = serieId;
    }
}