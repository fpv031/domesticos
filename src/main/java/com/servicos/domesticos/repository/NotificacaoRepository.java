package com.servicos.domesticos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.Notificacao;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
    List<Notificacao> findByUsuarioIdAndLidaFalse(Long usuarioId);
}