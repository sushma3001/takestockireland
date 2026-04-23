package com.takestock.takestockireland.controller;


import com.takestock.takestockireland.dto.UserDTO;
import com.takestock.takestockireland.entity.User;
import com.takestock.takestockireland.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // Marks as REST API controller
@RequestMapping("/api/users")    // Base URL for all endpoints
public class UserController {

    @Autowired  // Spring injects UserService
    private UserService userService;

    // GET http://localhost:8080/api/users
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }


    //Get : https://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    // POST http://localhost:8080/api/users (with JSON body)
    @PostMapping
    public UserDTO createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
