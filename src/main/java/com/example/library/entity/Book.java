package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter @Setter
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(
        name = "book_author",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<Author> authors;
}
