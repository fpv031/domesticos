package com.servicos.domesticos.model;

import jakarta.persistence.*;

@Entity
public class EmpregadoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Empregado empregado;

    @ManyToOne
    private Servico servico;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Empregado getEmpregado() { return empregado; }
    public void setEmpregado(Empregado empregado) { this.empregado = empregado; }
    public Servico getServico() { return servico; }
    public void setServico(Servico servico) { this.servico = servico; }
}