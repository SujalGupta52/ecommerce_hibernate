package com.ecommerce.entitiy;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
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
    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Set<OrderDetails> orderDetails;
}
