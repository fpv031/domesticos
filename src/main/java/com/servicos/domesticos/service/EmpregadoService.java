package com.servicos.domesticos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.EmpregadoDTO;
import com.servicos.domesticos.model.Empregado;
import com.servicos.domesticos.model.Servico;
import com.servicos.domesticos.repository.EmpregadoRepository;
import com.servicos.domesticos.repository.ServicoRepository;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository empregadoRepository;

    @Autowired
    private ServicoRepository servicoRepository;

    public Empregado cadastrar(EmpregadoDTO dto) {
        Empregado empregado = new Empregado();
        empregado.setNome(dto.nome);
        empregado.setEmail(dto.email);
        empregado.setSenha(dto.senha);
        empregado.setHabilidades(dto.habilidades);
        empregado.setValorHora(dto.valorHora);

        List<Servico> servicos = servicoRepository.findAllById(dto.servicosIds);
        empregado.setServicosOferecidos(servicos);

        return empregadoRepository.save(empregado);
    }

    public List<Empregado> listar() {
        return empregadoRepository.findAll();
    }
}