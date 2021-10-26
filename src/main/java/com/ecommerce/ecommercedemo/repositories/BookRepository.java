package com.ecommerce.ecommercedemo.repositories;

import com.ecommerce.ecommercedemo.model.Author;
import com.ecommerce.ecommercedemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {


}
