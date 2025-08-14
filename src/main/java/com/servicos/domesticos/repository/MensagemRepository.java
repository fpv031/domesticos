package com.servicos.domesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}