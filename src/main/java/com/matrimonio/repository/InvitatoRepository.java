package com.matrimonio.repository;

import com.matrimonio.model.Invitato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitatoRepository extends JpaRepository<Invitato, Long> {
}
