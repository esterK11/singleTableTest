package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.Film;
import com.example.formationspringboot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepo extends JpaRepository<Film, Long> {
    //Définit une requête JPQL personnalisée qui récupère tous les enregistrements de la table Film.
    //La syntaxe "from Film" est utilisée pour sélectionner toutes les entrées de la table Film.
    @Query("from Film ")
    public List<Film> getAllFilms();
    @Query("SELECT f from Film f WHERE f.addedBy= ?1")
    List<Film> findFilmsByUser(Utilisateur addedBy);
}
