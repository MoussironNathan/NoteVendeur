package com.noteVendeur.noteVendeur.entity;

import jakarta.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
