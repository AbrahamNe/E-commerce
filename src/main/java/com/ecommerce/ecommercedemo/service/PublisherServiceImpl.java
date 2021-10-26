package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Publisher;
import com.ecommerce.ecommercedemo.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {
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
}
