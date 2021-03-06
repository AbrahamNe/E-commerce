package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Address;
import com.ecommerce.ecommercedemo.model.Publisher;

import java.util.List;
import java.util.Optional;

public interface PublisherService {

    List<Publisher> findAll();
    Optional<Publisher> findPublisher(long id);
    void savePublisher(Publisher publisher);
     void savePubli(long id, String name, String shortStory, Address address);


}
