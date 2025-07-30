package com.servicos.domesticos.model;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Disponibilidade {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DayOfWeek dia;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    @ManyToOne
    private Usuario usuario; // empregada

    // Getters e Setters
}