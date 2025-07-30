package com.servicos.domesticos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.PedidoDTO;
import com.servicos.domesticos.model.PedidoServico;
import com.servicos.domesticos.repository.PedidoServicoRepository;
import com.servicos.domesticos.repository.ServicoRepository;
import com.servicos.domesticos.repository.UsuarioRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoServicoRepository pedidoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ServicoRepository servicoRepository;

    public PedidoServico criar(PedidoDTO dto) {
        PedidoServico pedido = new PedidoServico();
        pedido.setCliente(usuarioRepository.findById(dto.clienteId).orElseThrow());
        pedido.setEmpregada(usuarioRepository.findById(dto.empregadaId).orElseThrow());
        pedido.setServico(servicoRepository.findById(dto.servicoId).orElseThrow());
        pedido.setDescricao(dto.descricao);
        pedido.setDataServico(dto.dataServico);
        pedido.setStatus("pendente");
        return pedidoRepository.save(pedido);
    }

    public List<PedidoServico> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoServico> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public PedidoServico atualizarStatus(Long id, String status) {
        PedidoServico pedido = pedidoRepository.findById(id).orElseThrow();
        pedido.setStatus(status);
        return pedidoRepository.save(pedido);
    }
}