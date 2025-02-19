package com.matrimonio.service;

import com.matrimonio.model.Invitato;
import com.matrimonio.repository.InvitatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InvitatoService {

    private final InvitatoRepository invitatoRepository;

    @Autowired
    public InvitatoService(InvitatoRepository invitatoRepository) {
        this.invitatoRepository = invitatoRepository;
    }

    public Invitato aggiungiInvitato(Invitato invitato) {
        return invitatoRepository.save(invitato);
    }

    public Invitato getInvitato(Long id) {
        return invitatoRepository.findById(id).orElse(null);
    }

    public Iterable<Invitato> getAllInvitati() {
        return invitatoRepository.findAll();
    }
}
