package com.servicos.domesticos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicos.domesticos.dto.UsuarioDTO;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping
    public ResponseEntity<?> listarTodos() {
        return ResponseEntity.ok("Lista de usuários");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Long id) {
        return ResponseEntity.ok("Usuário encontrado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok("Usuário atualizado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        return ResponseEntity.ok("Usuário deletado");
    }

    @GetMapping("/empregadas")
    public ResponseEntity<?> listarEmpregadas() {
        return ResponseEntity.ok("Lista de empregadas");
    }

    @GetMapping("/clientes")
    public ResponseEntity<?> listarClientes() {
        return ResponseEntity.ok("Lista de clientes");
    }
}