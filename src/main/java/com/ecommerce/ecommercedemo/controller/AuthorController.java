package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.exceptionResponse.CustomizedResponseEntityExceptionHandler;
import com.ecommerce.ecommercedemo.model.Author;
import com.ecommerce.ecommercedemo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {

    // TODO use the generic exception Handler
  //CustomizedResponseEntityExceptionHandler h = new CustomizedResponseEntityExceptionHandler();
    @Autowired
    private AuthorService authorService;

    @GetMapping("api/authors")
    public List<Author> findAllAuthors(){
        return authorService.findAll();
    }

    @GetMapping("api/authors/{id}")
    public Optional<Author> findanAuthor(@PathVariable long id){
        if(authorService.findAuthor(id) != null) {
            return authorService.findAuthor(id);
        }

        throw new AuthorNotFoundException("id " + id);
    }

    @GetMapping("api/authors/name")
    public Author findByName(@RequestParam("name") String name ){

 //   public Author findByName(@PathVariable String name){
        return  authorService.findbyName(name);
    }

    @PostMapping("api/authors")
    public ResponseEntity<Object> saveNewAuthor(@RequestBody Author author){
      Author savedUser =  authorService.saveAuthor(author);

       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

       return ResponseEntity.created(location).build();
    }

    @DeleteMapping("api/authors/{id}")
     public void deleteAuthorbyId(@PathVariable long id){
        authorService.deleteAuthor(id);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    private class AuthorNotFoundException extends RuntimeException {
        public AuthorNotFoundException(String s) {
            super(s);
        }
    }
}

