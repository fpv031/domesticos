package com.servicos.domesticos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.ServicoDTO;
import com.servicos.domesticos.model.Servico;
import com.servicos.domesticos.repository.ServicoRepository;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico criar(ServicoDTO dto) {
        Servico servico = new Servico();
        servico.setNome(dto.nome);
        servico.setDescricao(dto.descricao);
        return servicoRepository.save(servico);
    }

    public List<Servico> listar() {
        return servicoRepository.findAll();
    }
}