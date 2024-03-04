package com.example.formationspringboot.controllers;

import com.example.formationspringboot.entities.UserListItem;
import com.example.formationspringboot.entities.enums.StatusVisionnage;
import com.example.formationspringboot.service.UserListItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.formationspringboot.entities.enums.StatusVisionnage.AVOIR;

@RestController
@RequestMapping("/mylist")
public class UserListItemController {

    private final UserListItemService userListService;

    public UserListItemController(UserListItemService userListService) {
        this.userListService = userListService;
    }

    @PostMapping("/add")
    public UserListItem addAnItemToMyList(@RequestBody UserListItem userItem) {
        return userListService.addItemToWatchList(userItem);
    }

    @GetMapping("/tosee/{id}")
    public List<UserListItem> getUserListItemsByUserAndStatus(@PathVariable("id") Long id) {
        return userListService.findAllByUserAAndStatusVisionnage(id);
    }
}
