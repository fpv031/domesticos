package com.servicos.domesticos.dto;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DisponibilidadeDTO {
    public DayOfWeek dia;
    public LocalTime horaInicio;
    public LocalTime horaFim;
    public Long usuarioId;
}