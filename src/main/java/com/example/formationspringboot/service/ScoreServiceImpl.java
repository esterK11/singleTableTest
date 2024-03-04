package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Score;
import com.example.formationspringboot.repositories.ScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{

    private final ScoreRepository scoreRepository;

    public ScoreServiceImpl(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public Score createScore(Score s) {
        return scoreRepository.save(s);
    }

    @Override
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }
}
