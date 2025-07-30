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
import com.servicos.domesticos.dto.EnderecoDTO;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @PostMapping
    public ResponseEntity<?> adicionar(@RequestBody EnderecoDTO dto) {
        return ResponseEntity.ok("Endereço adicionado");
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<?> listar(@PathVariable Long id) {
        return ResponseEntity.ok("Endereços do usuário");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody EnderecoDTO dto) {
        return ResponseEntity.ok("Endereço atualizado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        return ResponseEntity.ok("Endereço excluído");
    }
}