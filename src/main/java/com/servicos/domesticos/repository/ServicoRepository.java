package com.servicos.domesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {}