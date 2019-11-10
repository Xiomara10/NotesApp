package com.xtorres.notesapp.models;

public class Note {

    private Long id;
    private Long idUser;
    private String title;
    private String description;

    public Note() {
    }

    public Note(Long idUser, String title, String description) {
        this.idUser = idUser;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
