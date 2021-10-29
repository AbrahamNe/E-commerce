package com.ecommerce.ecommercedemo.repositories;

import com.ecommerce.ecommercedemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
