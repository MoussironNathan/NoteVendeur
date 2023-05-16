package com.noteVendeur.noteVendeur.repository;

import com.noteVendeur.noteVendeur.entity.NoteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<NoteEntity, Long> {
    List<NoteEntity> findByUserId(int userId);
}
