package com.servicos.domesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
}