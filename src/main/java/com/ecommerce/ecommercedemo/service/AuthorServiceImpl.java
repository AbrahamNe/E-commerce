package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Author;
import com.ecommerce.ecommercedemo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{

   @Autowired
    private AuthorRepository authorRepository;
    @Override
    public void saveAuthor(Author author) {

        //TODO check if the author exists
        if(author != null)
            authorRepository.save(author);
    }

    @Override
    public Optional<Author> findAuthor(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }


}
