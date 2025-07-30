package com.servicos.domesticos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    @ManyToOne
    private Usuario usuario;

    public void setUsuario(Usuario orElseThrow) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUsuario'");
    }

    public void setCep(String cep2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCep'");
    }

    public void setEstado(String estado2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }

    public void setCidade(String cidade2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCidade'");
    }

    public void setNumero(String numero2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNumero'");
    }

    public void setRua(String rua2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRua'");
    }

    // Getters e Setters
}
