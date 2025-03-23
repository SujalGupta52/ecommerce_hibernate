package com.ecommerce.entitiy;
enum Role {
    ADMIN, CUSTOMER
}
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private Role role;
}
