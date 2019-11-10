package com.xtorres.notesapp.repositories;

import com.orm.SugarRecord;
import com.xtorres.notesapp.models.Note;

import java.util.List;

public class NoteRepositorie {

    public static List<Note> note(){
        List<Note> notes = SugarRecord.listAll(Note.class);
        return notes;
    }

    public static Note read(Long id){
        Note note = SugarRecord.findById(Note.class, id);
        return note;
    }

    public static void create(Long idUser, String title, String description){
        Note note = new Note(idUser, title, description);
        SugarRecord.save(note);
    }

}
