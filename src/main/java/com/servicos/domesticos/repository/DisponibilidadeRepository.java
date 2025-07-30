package com.servicos.domesticos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Disponibilidade;

public interface DisponibilidadeRepository extends JpaRepository<Disponibilidade, Long> {
    List<Disponibilidade> findByUsuarioId(Long usuarioId);
}