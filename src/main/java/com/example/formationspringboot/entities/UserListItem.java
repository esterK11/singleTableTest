package com.example.formationspringboot.entities;

import com.example.formationspringboot.entities.enums.StatusVisionnage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.mapping.Fetchable;

import java.time.LocalDateTime;

@Entity
@NamedEntityGraph(name = "watchlist.avoir", attributeNodes =
        @NamedAttributeNode("media")
)
public class UserListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;

    @ManyToOne //fetchtype = Eager by default
    @JsonIgnore
    private Utilisateur user;

    @ManyToOne(fetch = FetchType.LAZY) //fetchtype = Eager by default
//    @JsonIgnore => I don't see the object in my response
    private MultimediaContent media;

    @Enumerated(EnumType.STRING)
    private StatusVisionnage statusVisionnage;

    public UserListItem(Long id, LocalDateTime created_at, LocalDateTime modified_at, Utilisateur user, MultimediaContent media, StatusVisionnage statusVisionnage) {
        this.id = id;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.user = user;
        this.media = media;
        this.statusVisionnage = statusVisionnage;
    }

    public UserListItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public MultimediaContent getMedia() {
        return media;
    }

    public void setMedia(MultimediaContent media) {
        this.media = media;
    }

    public StatusVisionnage getStatusVisionnage() {
        return statusVisionnage;
    }

    public void setStatusVisionnage(StatusVisionnage statusVisionnage) {
        this.statusVisionnage = statusVisionnage;
    }
}
