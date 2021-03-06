package com.ecommerce.ecommercedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;

    @Embedded
    private Contact contact;
    @Embedded
    private  Address addresses;
    @Embedded
    private Login login;

    @OneToOne
    private ShoppingCart cart;

    private Role role;
}
