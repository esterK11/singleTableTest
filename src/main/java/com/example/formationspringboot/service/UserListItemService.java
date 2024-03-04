package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.UserListItem;
import com.example.formationspringboot.entities.enums.StatusVisionnage;

import java.util.List;

public interface UserListItemService {

    UserListItem addItemToWatchList(UserListItem userListItem);

    String deleteItemFromList(Long id);

    UserListItem updateItemInUserItemList(UserListItem userListItem);

    List<UserListItem> findAllByUserAAndStatusVisionnage(Long id);
}
