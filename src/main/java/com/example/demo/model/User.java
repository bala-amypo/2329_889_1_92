package com.example.demo.model;



public class User{
    @Id
    private Long id;
    private String name;
    private  String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
}