package com.servicos.domesticos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicos.domesticos.dto.PedidoDTO;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody PedidoDTO dto) {
        return ResponseEntity.ok("Pedido criado");
    }

    @GetMapping
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok("Lista de pedidos");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detalhes(@PathVariable Long id) {
        return ResponseEntity.ok("Detalhes do pedido");
    }

    @PutMapping("/{id}/aceitar")
    public ResponseEntity<?> aceitar(@PathVariable Long id) {
        return ResponseEntity.ok("Pedido aceito");
    }

    @PutMapping("/{id}/recusar")
    public ResponseEntity<?> recusar(@PathVariable Long id) {
        return ResponseEntity.ok("Pedido recusado");
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<?> atualizarStatus(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok("Status atualizado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> cancelar(@PathVariable Long id) {
        return ResponseEntity.ok("Pedido cancelado");
    }   
}
