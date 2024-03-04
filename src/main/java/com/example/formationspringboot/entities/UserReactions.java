package com.example.formationspringboot.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import javax.print.attribute.standard.Media;
import java.time.LocalDateTime;

@MappedSuperclass
public class UserReactions {

//    (fetch = FetchType.LAZY) gives error
    @ManyToOne
    private Utilisateur user;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;

    @ManyToOne
    @JoinColumn(name = "media")
    @JsonBackReference
    private MultimediaContent media;

    public UserReactions(Utilisateur user, LocalDateTime created_at, LocalDateTime modified_at, MultimediaContent media) {
        this.user = user;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.media = media;
    }

    public UserReactions() {
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
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

    public MultimediaContent getMedia() {
        return media;
    }

    public void setMedia(MultimediaContent media) {
        this.media = media;
    }
}
