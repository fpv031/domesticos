package com.servicos.domesticos.dto;

import java.util.List;

public class EmpregadoDTO {
    public String nome;
    public String email;
    public String senha;
    public String habilidades;
    public Double valorHora;
    public List<Long> servicosIds; // IDs dos serviços oferecidos
}