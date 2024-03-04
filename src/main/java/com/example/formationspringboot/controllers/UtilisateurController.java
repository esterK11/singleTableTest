package com.example.formationspringboot.controllers;

import com.example.formationspringboot.entities.Utilisateur;
import com.example.formationspringboot.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public String getALlUtilisateurs() {
        return "get all users was called";
    }

    @PostMapping("/create")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur user) {
        return utilisateurService.createuser(user);
    }

    @PutMapping
    public String updateUtilisateur() {
        return "update all users was called";
    }

    @DeleteMapping
    public String deleteUtilisateur() {
        return "delete all users was called";
    }

}
