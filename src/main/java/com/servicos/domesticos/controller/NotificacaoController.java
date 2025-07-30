package com.servicos.domesticos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicos.domesticos.dto.NotificacaoDTO;

@RestController
@RequestMapping("/api/notificacoes")
public class NotificacaoController {

    @PostMapping("/enviar")
    public ResponseEntity<?> enviarNotificacao(@RequestBody NotificacaoDTO dto) {
        return ResponseEntity.ok("Notificação enviada");
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<?> listarPorUsuario(@PathVariable Long id) {
        return ResponseEntity.ok("Notificações do usuário");
    }
}