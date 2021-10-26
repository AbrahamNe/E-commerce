package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    void saveAuthor(Author author);
    List<Author>findAll();
    Optional<Author> findAuthor(long id);


}
