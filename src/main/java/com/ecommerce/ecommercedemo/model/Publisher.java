package com.ecommerce.ecommercedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String shortStory;
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private List<Book> books = new ArrayList();

    @Embedded
    private Address address;

}
