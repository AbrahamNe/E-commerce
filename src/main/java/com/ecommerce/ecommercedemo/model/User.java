package com.ecommerce.ecommercedemo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    @Embedded
    private  Address addresses;
    private String username;
    private String email;
    private String passWord;


    @OneToOne
    private ShoppingCart cart;

    private Role role;
}
