package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CrudUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String phone;

}
