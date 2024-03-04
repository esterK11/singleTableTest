package com.example.formationspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Score extends UserReactions{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;

    public Score(Utilisateur user, LocalDateTime created_at, LocalDateTime modified_at, MultimediaContent mediaId, Long id, int score) {
        super(user, created_at, modified_at, mediaId);
        this.id = id;
        this.score = score;
    }

    public Score() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
