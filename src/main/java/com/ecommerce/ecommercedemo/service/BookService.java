package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {


    List<Book> findAll();
    Optional<Book> findbyId(long id);
    Book save(Book book);


    //TODO :- add, update and delete book
}
