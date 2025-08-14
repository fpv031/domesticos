package com.servicos.domesticos.model;


import java.util.List;  
import com.servicos.domesticos.model.PedidoServico;
import com.servicos.domesticos.model.Endereco;
import com.servicos.domesticos.model.Disponibilidade;
import com.servicos.domesticos.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import com.servicos.domesticos.model.Avaliacao;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String tipo; // "cliente" ou "empregada"

    @OneToMany(mappedBy = "cliente")
    private List<PedidoServico> pedidosFeitos;

    @OneToMany(mappedBy = "empregada")
    private List<PedidoServico> pedidosRecebidos;

    @OneToMany(mappedBy = "usuario")
    private List<Endereco> enderecos;

    @OneToMany(mappedBy = "usuario")
    private List<Disponibilidade> disponibilidades;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
