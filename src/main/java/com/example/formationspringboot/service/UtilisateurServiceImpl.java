package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.Utilisateur;
import com.example.formationspringboot.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur getUserById(Long userId) {
        Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(userId);
        return utilisateurOptional.orElse(null); // Retourner l'utilisateur s'il existe, sinon null
    }

    @Override
    public Utilisateur createuser(Utilisateur user) {
        return utilisateurRepository.save(user);
    }
}
