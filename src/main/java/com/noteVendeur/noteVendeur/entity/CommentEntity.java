package com.noteVendeur.noteVendeur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    @OneToOne
    private PosteEntity idPoste;

    @ManyToOne
    private UserEntity userID;

}
