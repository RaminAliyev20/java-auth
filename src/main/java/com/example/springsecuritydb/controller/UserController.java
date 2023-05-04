package com.example.springsecuritydb.controller;

import com.example.springsecuritydb.dao.entity.UserEntity;
import com.example.springsecuritydb.dto.UserDto;
import com.example.springsecuritydb.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("{id}")
    public UserDto getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public String addUser(UserDto userDto){
        userService.addUser(userDto);
        return "Elave edildi!";
    }
}
