package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends  JpaRepository<Utilisateur, Long> {
}
