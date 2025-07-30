package com.servicos.domesticos.model;

import java.time.LocalDate;
import java.util.List;
import com.servicos.domesticos.model.PedidoServico;
import com.servicos.domesticos.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import com.servicos.domesticos.model.Servico;

@Entity
public class Pagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private PedidoServico pedido;

    private LocalDate dataPagamento;
    private Double valor;
    private String metodo; // pix, cartão, dinheiro
    private String status; // confirmado, pendente
    public void setStatus(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }
    public void setValor(Double valor2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setValor'");
    }
    public void setMetodo(String metodo2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMetodo'");
    }
    public void setPedido(PedidoServico orElseThrow) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPedido'");
    }
    public void setDataPagamento(LocalDate now) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataPagamento'");
    }

    // Getters e Setters
}