package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
