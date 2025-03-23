package com.ecommerce.entitiy;

import jakarta.persistence.*;

import java.util.Date;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date orderDate;
    @Column(nullable = false)
    private float totalAmount;
}
