package com.servicos.domesticos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByAvaliadoId(Long id);
}