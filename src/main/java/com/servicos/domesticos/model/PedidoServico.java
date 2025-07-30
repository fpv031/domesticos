package com.servicos.domesticos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDate;
import java.util.List;
import com.servicos.domesticos.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import com.servicos.domesticos.model.Servico;
import com.servicos.domesticos.model.Endereco;
import com.servicos.domesticos.model.Disponibilidade;
import com.servicos.domesticos.model.Avaliacao; 


@Entity
public class PedidoServico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario cliente;

    @ManyToOne
    private Usuario empregada;

    @ManyToOne
    private Servico servico;

    private LocalDate dataServico;
    private String descricao;
    private String status; // pendente, aceito, recusado, concluído
    public void setStatus(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }
    public void setCliente(Usuario orElseThrow) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }
    public void setEmpregada(Usuario orElseThrow) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmpregada'");
    }
    public void setServico(Servico dataServico2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setServico'");
    }
    public void setDescricao(String descricao2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }
    public void setServico(LocalDate dataServico2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setServico'");
    }
    public void setDataServico(LocalDate dataServico2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataServico'");
    }

    // Getters e Setters
}