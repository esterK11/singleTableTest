package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.Film;
import com.example.formationspringboot.entities.Saison;
import com.example.formationspringboot.entities.Serie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Repository
public interface SerieRepo extends JpaRepository<Serie, Long> {


    @Query("from Serie, Saison , Episode ")
    public List<Serie> getAllSeries();


//
//@EntityGraph(attributePaths = {"customerPartyFieldMappingEntity.subField"})
//    @EntityGraph(attributePaths = {"serie.saison" })
//    @EntityGraph(value = "Item.characteristics")
    List<Serie> findAll();

    @EntityGraph("serie.saisons")
    Optional<Serie> findById(Long id);
}
