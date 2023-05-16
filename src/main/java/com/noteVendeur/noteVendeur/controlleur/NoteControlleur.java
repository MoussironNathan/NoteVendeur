package com.noteVendeur.noteVendeur.controlleur;

import com.noteVendeur.noteVendeur.entity.NoteEntity;
import com.noteVendeur.noteVendeur.entity.PosteEntity;
import com.noteVendeur.noteVendeur.repository.NoteRepository;
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
public class NoteControlleur {

    @Autowired
    NoteRepository noteRepository;
    PosteRepository posteRepository;

    @GetMapping("/get/{userID}")
    public ResponseEntity<List<NoteEntity>> getNotes(@RequestParam int userID) {
        try {
            List<NoteEntity> notes = new ArrayList<>();

            notes.addAll(noteRepository.findByUserId(userID));

            if (notes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(notes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/post/{postID}")
    public ResponseEntity<NoteEntity> postNotes(@RequestParam int postID, @RequestBody int note) {
        try {
            NoteEntity noteEntity = new NoteEntity();

            List<PosteEntity> poste = posteRepository.findByPostId(postID);

            noteEntity.setIdPoste(poste.get(0));
            noteEntity.setNote(note);

            return new ResponseEntity<>(noteEntity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
