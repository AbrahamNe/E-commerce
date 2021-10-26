package com.ecommerce.ecommercedemo.repositories;

import com.ecommerce.ecommercedemo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PublisherRepository extends JpaRepository<Publisher, Long> {
//    Publisher findById(long id);
//    Publisher findByName(String name);
//    boolean existsByName(String name);
}
