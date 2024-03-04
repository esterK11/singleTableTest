package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Score;

import java.util.List;

public interface ScoreService {


    Score createScore(Score s);

    List<Score> getAllScores();
}
