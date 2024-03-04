package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
