package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.model.Author;
import com.ecommerce.ecommercedemo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> findAllAuthors(){
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Author> findanAuthor(@PathVariable long id){
        return authorService.findAuthor(id);
    }

    @PostMapping
    public void saveAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);
    }

}
