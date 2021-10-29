package com.ecommerce.ecommercedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;


@Embeddable
public class Login {

    private String username;
    private String password;
}
