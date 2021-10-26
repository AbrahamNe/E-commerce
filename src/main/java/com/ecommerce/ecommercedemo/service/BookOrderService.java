package com.ecommerce.ecommercedemo.service;

import com.ecommerce.ecommercedemo.model.BookOrder;

import java.util.List;

public interface BookOrderService {


    List<BookOrder> findAll();
    BookOrder findById(long id);
    void addOrder(BookOrder bookOrder);;
}
