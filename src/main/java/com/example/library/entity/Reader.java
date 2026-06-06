package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class Reader {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
}
