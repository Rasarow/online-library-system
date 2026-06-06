package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter @Setter
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}
