package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findUser(long id);
    void saveUser(User user);
}
