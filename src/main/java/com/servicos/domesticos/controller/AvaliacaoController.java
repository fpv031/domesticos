package com.servicos.domesticos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicos.domesticos.dto.AvaliacaoDTO;

@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

    @PostMapping
    public ResponseEntity<?> avaliar(@RequestBody AvaliacaoDTO dto) {
        return ResponseEntity.ok("Avaliação enviada");
    }

    @GetMapping("/empregada/{id}")
    public ResponseEntity<?> verAvaliacoesEmpregada(@PathVariable Long id) {
        return ResponseEntity.ok("Avaliações da empregada");
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<?> verAvaliacoesCliente(@PathVariable Long id) {
        return ResponseEntity.ok("Avaliações do cliente");
    }
}