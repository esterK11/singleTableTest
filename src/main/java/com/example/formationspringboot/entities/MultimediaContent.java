package com.example.formationspringboot.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

//@NamedEntityGraph(name = "media.scores", attributeNodes =
//        @NamedAttributeNode("scores")
//)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name = "media_type", discriminatorType = DiscriminatorType.STRING)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultimediaContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String image1;
    private Double duration; //Double avec majuscule permet de représenter la possibilité une valeur nulle si nécessaire
    private LocalDateTime created_at;
    private LocalDateTime  modified_at;
    //default eager
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur addedBy; //by user


    public MultimediaContent(Long id, String titre, String description, String image1, Double duration, LocalDateTime created_at, LocalDateTime modified_at, Utilisateur addedBy) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.image1 = image1;
        this.duration = duration;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.addedBy = addedBy;
    }

    public MultimediaContent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public void setModified_at(LocalDateTime modified_at) {
        this.modified_at = modified_at;
    }

    public Utilisateur getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Utilisateur addedBy) {
        this.addedBy = addedBy;
    }

}