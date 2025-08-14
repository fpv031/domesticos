package com.servicos.domesticos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.servicos.domesticos.dto.MensagemDTO;
import com.servicos.domesticos.model.Mensagem;
import com.servicos.domesticos.service.MensagemService;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private MensagemService mensagemService;

    @PostMapping("/mensagem")
    public ResponseEntity<Mensagem> enviar(@RequestBody MensagemDTO dto) {
        Mensagem mensagem = new Mensagem();
        mensagem.setConteudo(dto.conteudo);
        // Adicione lógica para setar conversa/remetente
        Mensagem enviada = mensagemService.enviar(mensagem);
        return ResponseEntity.ok(enviada);
    }

    @GetMapping("/conversa/{id}")
    public ResponseEntity<List<Mensagem>> listar(@PathVariable Long id) {
        List<Mensagem> lista = mensagemService.listarPorConversa(id);
        return ResponseEntity.ok(lista);
    }
}