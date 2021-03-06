package com.ecommerce.ecommercedemo.service.Impl;

import com.ecommerce.ecommercedemo.model.User;
import com.ecommerce.ecommercedemo.repositories.UserRepository;
import com.ecommerce.ecommercedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUser(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void saveUser(User user) {
        if(userRepository.findById( user.getId()) == null){
            userRepository.save(user);
        }
    }
}
