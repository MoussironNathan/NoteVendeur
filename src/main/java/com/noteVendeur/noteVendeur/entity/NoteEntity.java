package com.noteVendeur.noteVendeur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int note;

    @OneToOne
    private PosteEntity idPoste;

    @ManyToOne
    private UserEntity userID;

}
