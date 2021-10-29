package com.ecommerce.ecommercedemo.service.Impl;

import com.ecommerce.ecommercedemo.model.Author;
import com.ecommerce.ecommercedemo.repositories.AuthorRepository;
import com.ecommerce.ecommercedemo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

   @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Author saveAuthor(Author author) {

        //TODO check if the author exists
        if(author != null)
            authorRepository.save(author);
        return author;
    }

    @Override
    public Optional<Author> findAuthor(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findbyName(String authorName){
      return   authorRepository.findAuthorByName(authorName);
    }

    @Override
    public void deleteAuthor(long id) {
        authorRepository.deleteById(id);
    }


}
