package com.servicos.domesticos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Conversa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario cliente;

    @ManyToOne
    private Empregado prestador;

    @OneToMany(mappedBy = "conversa")
    private List<Mensagem> mensagens;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Usuario getCliente() { return cliente; }
    public void setCliente(Usuario cliente) { this.cliente = cliente; }
    public Empregado getPrestador() { return prestador; }
    public void setPrestador(Empregado prestador) { this.prestador = prestador; }
    public List<Mensagem> getMensagens() { return mensagens; }
    public void setMensagens(List<Mensagem> mensagens) { this.mensagens = mensagens; }
}