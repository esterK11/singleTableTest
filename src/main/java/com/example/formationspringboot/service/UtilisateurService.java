package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService{

    public Utilisateur getUserById(Long userId);


    Utilisateur createuser(Utilisateur user);
}
