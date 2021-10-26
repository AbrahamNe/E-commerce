package com.ecommerce.ecommercedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Author {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String biography;

    @OneToMany
    @JoinColumn(name = "author_id")
    //@JsonIgnore
    private List<Book> books = new ArrayList();

    // @Transient properies that will not be stored in the data base
}
