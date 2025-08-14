package com.servicos.domesticos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.servicos.domesticos.model.Mensagem;
import com.servicos.domesticos.repository.MensagemRepository;

import java.util.List;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    public Mensagem enviar(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }

    public List<Mensagem> listarPorConversa(Long conversaId) {
        // Implemente a busca por conversa se necessário
        return mensagemRepository.findAll();
    }
}