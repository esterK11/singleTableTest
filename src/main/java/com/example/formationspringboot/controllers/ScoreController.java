package com.example.formationspringboot.controllers;

import com.example.formationspringboot.entities.Score;
import com.example.formationspringboot.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping("/create")
    public Score addScore(@RequestBody Score s){
        return scoreService.createScore(s);

    }

    @GetMapping("")
    public List<Score> getAllScores(){
        return scoreService.getAllScores();
    }
}
