package com.matrimonio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Invitato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;
    private boolean partecipa;

    public Invitato() {}

    public Invitato(Long id, String nome, String cognome, boolean partecipa) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.partecipa = partecipa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public boolean isPartecipa() {
        return partecipa;
    }

    public void setPartecipa(boolean partecipa) {
        this.partecipa = partecipa;
    }
}
