package com.servicos.domesticos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicos.domesticos.dto.ServicoDTO;

@RestController
@RequestMapping("/api/servicos")
public class ServicoController {

    @GetMapping
    public ResponseEntity<?> listarServicos() {
        return ResponseEntity.ok("Lista de serviços");
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody ServicoDTO dto) {
        return ResponseEntity.ok("Serviço criado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@PathVariable Long id, @RequestBody ServicoDTO dto) {
        return ResponseEntity.ok("Serviço atualizado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        return ResponseEntity.ok("Serviço excluído");
    }
}
    
