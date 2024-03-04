package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.MultimediaContent;
import com.example.formationspringboot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MultimediaRepo extends JpaRepository<MultimediaContent, Long> {
    @Query("from MultimediaContent ")
    public List<MultimediaContent> getAllMultimedias();
    @Query("SELECT m from MultimediaContent m WHERE m.addedBy = ?1")
    List<MultimediaContent> findByAddedBy(Utilisateur utilisateur);

    @Query("SELECT m FROM MultimediaContent m where TYPE (m) in (Film, Serie)")
    List<MultimediaContent> getAll();
}
