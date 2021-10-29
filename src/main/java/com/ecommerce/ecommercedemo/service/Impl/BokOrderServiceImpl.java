package com.ecommerce.ecommercedemo.service.Impl;

import com.ecommerce.ecommercedemo.model.BookOrder;
import com.ecommerce.ecommercedemo.repositories.BookOrderRepository;
import com.ecommerce.ecommercedemo.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BokOrderServiceImpl implements BookOrderService {

    @Autowired
    private BookOrderRepository bookOrderRepository;
    @Override
    public List<BookOrder> findAll() {
        return  bookOrderRepository.findAll();
    }

    @Override
    public BookOrder findById(long id) {
        bookOrderRepository.findById(id);
        return null;
    }

    @Override
    public void addOrder(BookOrder bookOrder) {

    bookOrderRepository.save(bookOrder);
    }




}
