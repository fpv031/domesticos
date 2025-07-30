package com.servicos.domesticos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Avaliacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario avaliador;

    @ManyToOne
    private Usuario avaliado;

    private int nota; // de 1 a 5
    private String comentario;
    public void setAvaliador(Usuario orElseThrow) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAvaliador'");
    }
    public void setNota(int nota2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNota'");
    }
    public void setComentario(String comentario2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setComentario'");
    }

    // Getters e Setters
}