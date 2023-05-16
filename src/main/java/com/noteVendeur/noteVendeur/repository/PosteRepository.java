package com.noteVendeur.noteVendeur.repository;

import com.noteVendeur.noteVendeur.entity.CommentEntity;
import com.noteVendeur.noteVendeur.entity.PosteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PosteRepository extends CrudRepository<PosteEntity, Long> {
    List<PosteEntity> findByPostId(int postID);
}
