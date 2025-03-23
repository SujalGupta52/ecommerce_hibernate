package com.ecommerce.entitiy;

import jakarta.persistence.*;

import java.util.Set;

enum Role {
    ADMIN, CUSTOMER
}

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Set<Order> orders;
}
