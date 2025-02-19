package com.matrimonio.controller;

import com.matrimonio.model.Invitato;
import com.matrimonio.service.InvitatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invitati")

public class InvitatoController {

    private final InvitatoService invitatoService;

    @Autowired
    public InvitatoController(InvitatoService invitatoService) {
        this.invitatoService = invitatoService;
    }

    @PostMapping
    public Invitato aggiungiInvitato(@RequestBody Invitato invitato) {
        return invitatoService.aggiungiInvitato(invitato);
    }

    @GetMapping("/{id}")
    public Invitato getInvitato(@PathVariable Long id) {
        return invitatoService.getInvitato(id);
    }

    @GetMapping
    public Iterable<Invitato> getAllInvitati() {
        return invitatoService.getAllInvitati();
    }
}
