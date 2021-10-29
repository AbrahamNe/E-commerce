package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.model.Address;
import com.ecommerce.ecommercedemo.model.Publisher;
import com.ecommerce.ecommercedemo.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Optional<Publisher> findPublisher( @PathVariable  long id){
        return publisherService.findPublisher(id);
    }

    @PostMapping("/add")
    public void addpublisher( @RequestBody long id, String name, String shortStory,
                           Address address){
        publisherService.savePubli(id,name,shortStory,address);
    }
}
