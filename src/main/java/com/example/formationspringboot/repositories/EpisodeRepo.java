package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.Episode;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

@Repository
public interface EpisodeRepo extends JpaRepository<Episode, Long> {
//    @Query("from Episode ")

    @EntityGraph(value = "episode.score")
    Optional<Episode> findById(Long id);
}
