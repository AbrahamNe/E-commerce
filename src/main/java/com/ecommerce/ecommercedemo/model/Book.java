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
@Getter
@Setter

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private long isbn;
    private String title;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date publishedDate;
    private double price;

    @OneToMany
    @JoinColumn(name = "book_id")
    private List<BookOrder> bookOrders = new ArrayList<>();

    //TODO :- add ratings for books

    // TODO :- how to add images


}
