package com.ecommerce.ecommercedemo.service.Impl;

import com.ecommerce.ecommercedemo.model.Address;
import com.ecommerce.ecommercedemo.model.Publisher;
import com.ecommerce.ecommercedemo.repositories.PublisherRepository;
import com.ecommerce.ecommercedemo.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {
    Publisher publisher;
    @Autowired
     private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Optional<Publisher> findPublisher(long id) {
        return publisherRepository.findById(id);
    }

    @Override
    public void savePublisher(Publisher publisher) {
         if( ! publisherRepository.existsById(publisher.getId()))
             publisherRepository.save(publisher);
    }

    @Override
    public void savePubli(long id, String name, String shortStory, Address address) {
        if( publisher.getId() != id){
            publisher.setId(id);
            publisher.setName(name);
            publisher.setShortStory(shortStory);
            publisher.setAddress(address);
        }
    }
}
