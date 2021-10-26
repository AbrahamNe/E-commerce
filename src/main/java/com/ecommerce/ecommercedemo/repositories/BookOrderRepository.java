package com.ecommerce.ecommercedemo.repositories;

import com.ecommerce.ecommercedemo.model.Book;
import com.ecommerce.ecommercedemo.model.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookOrderRepository extends JpaRepository<BookOrder, Long> {

}
