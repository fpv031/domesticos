package com.servicos.domesticos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String habilidades;
    private Double valorHora;

    @ManyToMany
    @JoinTable(
        name = "empregado_servico",
        joinColumns = @JoinColumn(name = "empregado_id"),
        inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
    private List<Servico> servicosOferecidos;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getHabilidades() { return habilidades; }
    public void setHabilidades(String habilidades) { this.habilidades = habilidades; }
    public Double getValorHora() { return valorHora; }
    public void setValorHora(Double valorHora) { this.valorHora = valorHora; }
    public List<Servico> getServicosOferecidos() { return servicosOferecidos; }
    public void setServicosOferecidos(List<Servico> servicosOferecidos) { this.servicosOferecidos = servicosOferecidos; }
}