package com.servicos.domesticos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    List<Endereco> findByUsuarioId(Long usuarioId);
}