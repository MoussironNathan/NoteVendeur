package com.noteVendeur.noteVendeur.repository;

import com.noteVendeur.noteVendeur.entity.CommentEntity;
import com.noteVendeur.noteVendeur.entity.NoteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<CommentEntity, Long> {
    List<CommentEntity> findByUserId(int userId);
}
