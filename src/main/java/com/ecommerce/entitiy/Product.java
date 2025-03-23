package com.ecommerce.entitiy;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(nullable = false)
    private String name;
    @Column
    private float price;
    @Column
    private int stockQuantity;
    @ManyToOne
    @JoinColumn
    private Category category;
}
