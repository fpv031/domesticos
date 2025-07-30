package com.servicos.domesticos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;          
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicos.domesticos.dto.DisponibilidadeDTO;

@RestController
@RequestMapping("/api/disponibilidade")
public class DisponibilidadeController {

    @PostMapping
    public ResponseEntity<?> definir(@RequestBody DisponibilidadeDTO dto) {
        return ResponseEntity.ok("Disponibilidade definida");
    }

    @GetMapping("/empregada/{id}")
    public ResponseEntity<?> consultar(@PathVariable Long id) {
        return ResponseEntity.ok("Disponibilidade da empregada");
    }
}