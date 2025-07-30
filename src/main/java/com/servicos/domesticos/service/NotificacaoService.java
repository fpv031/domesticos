package com.servicos.domesticos.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.NotificacaoDTO;
import com.servicos.domesticos.model.Notificacao;
import com.servicos.domesticos.repository.NotificacaoRepository;
import com.servicos.domesticos.repository.UsuarioRepository;

@Service
public class NotificacaoService {

    @Autowired
    private NotificacaoRepository notificacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Notificacao enviar(NotificacaoDTO dto) {
        Notificacao n = new Notificacao();
        n.setMensagem(dto.mensagem);
        n.setUsuario(usuarioRepository.findById(dto.usuarioId).orElseThrow());
        n.setDataHora(LocalDateTime.now());
        n.setLida(false);
        return notificacaoRepository.save(n);
    }

    public List<Notificacao> listarNaoLidas(Long usuarioId) {
        return notificacaoRepository.findByUsuarioIdAndLidaFalse(usuarioId);
    }
}
