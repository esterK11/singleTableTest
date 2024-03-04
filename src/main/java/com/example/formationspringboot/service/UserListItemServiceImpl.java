package com.example.formationspringboot.service;

import com.example.formationspringboot.entities.UserListItem;
import com.example.formationspringboot.entities.enums.StatusVisionnage;
import com.example.formationspringboot.repositories.UserListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListItemServiceImpl implements UserListItemService{

    private final UserListRepository userListRepository;

    public UserListItemServiceImpl(UserListRepository userListRepository) {
        this.userListRepository = userListRepository;
    }

    @Override
    public UserListItem addItemToWatchList(UserListItem userListItem) {
        return userListRepository.save(userListItem);
    }

    @Override
    public String deleteItemFromList(Long id) {
        return null;
    }

    @Override
    public UserListItem updateItemInUserItemList(UserListItem userListItem) {
        return null;
    }

    @Override
    public List<UserListItem> findAllByUserAAndStatusVisionnage(Long id) {
        return userListRepository.findAllByUserAAndStatusVisionnage(id);
    }

}
