package com.noteVendeur.noteVendeur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PosteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
