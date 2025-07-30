package com.servicos.domesticos.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.PagamentoDTO;
import com.servicos.domesticos.model.Pagamento;
import com.servicos.domesticos.repository.PagamentoRepository;
import com.servicos.domesticos.repository.PedidoServicoRepository;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private PedidoServicoRepository pedidoRepository;

    public Pagamento confirmarPagamento(PagamentoDTO dto) {
        Pagamento pagamento = new Pagamento();
        pagamento.setPedido(pedidoRepository.findById(dto.pedidoId).orElseThrow());
        pagamento.setValor(dto.valor);
        pagamento.setMetodo(dto.metodo);
        pagamento.setStatus("confirmado");
        pagamento.setDataPagamento(LocalDate.now());
        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> listar() {
        return pagamentoRepository.findAll();
    }
}