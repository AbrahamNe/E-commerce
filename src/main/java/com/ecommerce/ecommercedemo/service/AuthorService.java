package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Author saveAuthor(Author author);
    List<Author>findAll();
    Optional<Author> findAuthor(long id);
     Author findbyName(String authorName);
     void deleteAuthor(long id);

}
