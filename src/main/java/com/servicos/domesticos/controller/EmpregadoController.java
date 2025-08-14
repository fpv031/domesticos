package com.servicos.domesticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicos.domesticos.dto.EmpregadoDTO;
import com.servicos.domesticos.model.Empregado;
import com.servicos.domesticos.service.EmpregadoService;

@RestController
@RequestMapping("/api/empregados")
public class EmpregadoController {

    @Autowired
    private EmpregadoService empregadoService;

    @PostMapping
    public ResponseEntity<Empregado> cadastrar(@RequestBody EmpregadoDTO dto) {
        Empregado empregado = empregadoService.cadastrar(dto);
        return ResponseEntity.ok(empregado);
    }

    @GetMapping
    public ResponseEntity<List<Empregado>> listar() {
        List<Empregado> lista = empregadoService.listar();
        return ResponseEntity.ok(lista);
    }
}