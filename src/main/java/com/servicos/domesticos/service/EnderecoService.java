package com.servicos.domesticos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.EnderecoDTO;
import com.servicos.domesticos.model.Endereco;
import com.servicos.domesticos.repository.EnderecoRepository;
import com.servicos.domesticos.repository.UsuarioRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Endereco salvar(EnderecoDTO dto) {
        Endereco endereco = new Endereco();
        endereco.setRua(dto.rua);
        endereco.setNumero(dto.numero);
        endereco.setCidade(dto.cidade);
        endereco.setEstado(dto.estado);
        endereco.setCep(dto.cep);
        endereco.setUsuario(usuarioRepository.findById(dto.usuarioId).orElseThrow());
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listarPorUsuario(Long usuarioId) {
        return enderecoRepository.findByUsuarioId(usuarioId);
    }
}