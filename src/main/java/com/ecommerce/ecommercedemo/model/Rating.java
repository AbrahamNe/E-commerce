package com.ecommerce.ecommercedemo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity

@Embeddable
public class Rating {
//    @Id
//    @GeneratedValue

    private long id;
    private String comment;
    private long rating;

}
