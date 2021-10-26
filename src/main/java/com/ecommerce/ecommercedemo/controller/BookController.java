package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.model.Book;
import com.ecommerce.ecommercedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllbooks(){
      return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getById(@PathVariable long id){
        return bookService.findbyId(id);
    }

    //@PostMapping
   @RequestMapping(value = "/api/books", method = RequestMethod.POST)
    public @ResponseBody Book addBook(@RequestBody Book book){
       return   bookService.save(book);
    }
}


