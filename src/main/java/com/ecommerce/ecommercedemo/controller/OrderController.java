package com.ecommerce.ecommercedemo.controller;

import com.ecommerce.ecommercedemo.model.BookOrder;
import com.ecommerce.ecommercedemo.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private BookOrderService orderService;

     @GetMapping
     public List<BookOrder> getAllOrder(){
         return orderService.findAll();
     }

     @GetMapping("/{id}")
     public BookOrder findOrderbyId( @PathVariable long id){
         return orderService.findById(id);
     }

     @PostMapping("/admin")
    public  @ResponseBody void addOder(@RequestBody  BookOrder order){
        orderService.addOrder(order);
    }


}
