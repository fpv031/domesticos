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

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void setNome(String nome2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public void setEmail(String email2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

    public void setSenha(String senha2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSenha'");
    }

    public void setTipo(String tipo2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTipo'");
    }

    // Getters e Setters
}
