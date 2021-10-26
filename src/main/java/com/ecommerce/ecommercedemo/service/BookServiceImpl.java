package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.Book;
import com.ecommerce.ecommercedemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findbyId(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        bookRepository.save(book);
        return book;
    }


//    @Override
//    public void removeBook(long isbn) {
//            if (bookRepository.existsByIsbn(isbn)) {
//                bookRepository.delete(bookRepository.findByIsbn(isbn));
//        }
//    }



}
