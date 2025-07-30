package com.servicos.domesticos.model;

import java.util.List;  
import com.servicos.domesticos.model.PedidoServico;
import com.servicos.domesticos.model.Endereco;
import com.servicos.domesticos.model.Disponibilidade;
import com.servicos.domesticos.model.Avaliacao;
import com.servicos.domesticos.model.Servico;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Servico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "servico")
    private List<PedidoServico> pedidos;

    public void setNome(String nome2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public void setDescricao(String descricao2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }

    // Getters e Setters
}
