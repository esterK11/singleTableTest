package com.example.formationspringboot.repositories;

import com.example.formationspringboot.entities.UserListItem;
import com.example.formationspringboot.entities.enums.StatusVisionnage;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserListRepository extends JpaRepository<UserListItem, Long> {

//    List<UserListItem> getUserListItemsByUserEqualsAndStatusVisionnageOrderByCreated_atAsc(Long id, StatusVisionnage A_VOIR);
    List<UserListItem> findAllById(Long id);



    @EntityGraph(value = "watchlist.avoir")
    @Query(value = "SELECT i FROM UserListItem i WHERE i.user.id = ?1 and i.statusVisionnage = 'AVOIR'")
    List<UserListItem> findAllByUserAAndStatusVisionnage(Long id);
}
