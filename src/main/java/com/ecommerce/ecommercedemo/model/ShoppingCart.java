package com.ecommerce.ecommercedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    private double id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dayplaced;
    private OrderStatus orderstatus;
    @OneToMany
    @JoinColumn(name = "bookorder_id")
    private List<BookOrder> bookOrders = new ArrayList<>();

    @Transient
    private double TotalPrice;
    // TODO add Payment method class
}
