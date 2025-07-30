package com.servicos.domesticos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.AvaliacaoDTO;
import com.servicos.domesticos.model.Avaliacao;
import com.servicos.domesticos.repository.AvaliacaoRepository;
import com.servicos.domesticos.repository.UsuarioRepository;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Avaliacao avaliar(AvaliacaoDTO dto) {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setAvaliador(usuarioRepository.findById(dto.avaliadorId).orElseThrow());
        avaliacao.setAvaliador(usuarioRepository.findById(dto.avaliadoId).orElseThrow());
        avaliacao.setNota(dto.nota);
        avaliacao.setComentario(dto.comentario);
        return avaliacaoRepository.save(avaliacao);
    }

    public List<Avaliacao> listarPorAvaliado(Long id) {
        return avaliacaoRepository.findByAvaliadoId(id);
    }
}