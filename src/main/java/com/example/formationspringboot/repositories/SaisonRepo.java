package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.Saison;
import com.example.formationspringboot.entities.Serie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SaisonRepo extends JpaRepository<Saison, Long> {
    @Query("from Saison ")
    List<Saison> findAllSeasonsBySerieId(Long id);

//    @EntityGraph(attributePaths = {"saison.episodes", "media.score"})
//    @EntityGraph(attributePaths = {"saisons"})
//    List<Saison> findSaisonsBySerieIdEquals(Long id);
//    @EntityGraph(value = "serie.saisons")
//    List<Saison> findAllBySerieId_Id(Long id);

    @EntityGraph(value = "saison.episodes")
//    Saison findSaisonById(Long id);
    Optional<Saison> findById(Long id);
}
