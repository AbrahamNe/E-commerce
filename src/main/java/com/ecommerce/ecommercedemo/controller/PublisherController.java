package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.model.Publisher;
import com.ecommerce.ecommercedemo.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/publishers")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping
    public List<Publisher> findAllPublishers(){
        return publisherService.findAll();
    }
      @GetMapping("/{id}")
    public Optional<Publisher> findaPublisher( @PathVariable  long id){
        return publisherService.findPublisher(id);
    }
}
