package com.servicos.domesticos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.servicos.domesticos.model.PedidoServico;

public interface PedidoServicoRepository extends JpaRepository<PedidoServico, Long> {
    List<PedidoServico> findByClienteId(Long clienteId);
    List<PedidoServico> findByEmpregadaId(Long empregadaId);
}