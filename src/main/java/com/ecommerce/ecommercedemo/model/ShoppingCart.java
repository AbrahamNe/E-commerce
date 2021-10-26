package com.ecommerce.ecommercedemo.model;

import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    private double id;

    private Date dayplaced;
    private OrderStatus orderstatus;
    @OneToMany
    @JoinColumn(name = "bookorder_id")
    private List<BookOrder> bookOrders = new ArrayList<>();

    @Transient
    private double TotalPrice;
    // TODO add Payment method class
}
