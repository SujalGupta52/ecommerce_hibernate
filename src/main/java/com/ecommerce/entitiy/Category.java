package com.ecommerce.entitiy;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(unique = true, nullable = false)
    private String name;
    @Column
    private String description;
}
