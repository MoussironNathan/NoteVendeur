package com.noteVendeur.noteVendeur.controlleur;

import com.noteVendeur.noteVendeur.entity.CommentEntity;
import com.noteVendeur.noteVendeur.entity.NoteEntity;
import com.noteVendeur.noteVendeur.entity.PosteEntity;
import com.noteVendeur.noteVendeur.repository.CommentRepository;
import com.noteVendeur.noteVendeur.repository.PosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentController {

    @Autowired
    CommentRepository commentRepository;
    PosteRepository posteRepository;

    @GetMapping("/get/{userID}")
    public ResponseEntity<List<CommentEntity>> getComments(@RequestParam int userID) {
        try {
            List<CommentEntity> comments = new ArrayList<>();

            comments.addAll(commentRepository.findByUserId(userID));

            if (comments.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(comments, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/post/{postID}")
    public ResponseEntity<CommentEntity> postComments(@RequestParam int postID, @RequestBody String comment) {
        try {
            CommentEntity commentEntity = new CommentEntity();

            List<PosteEntity> poste = posteRepository.findByPostId(postID);

            commentEntity.setIdPoste(poste.get(0));
            commentEntity.setComment(comment);

            return new ResponseEntity<>(commentEntity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
