package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.model.User;
import com.ecommerce.ecommercedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserbyId(@PathVariable long id){
        return userService.findUser(id);
    }

    @PostMapping("/admin")
    public void addUser( @RequestBody User user){
        userService.saveUser(user);
    }
}
