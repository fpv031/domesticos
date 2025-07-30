package com.servicos.domesticos.dto;

import java.time.LocalDate;

public class PedidoDTO {
    public Long clienteId;
    public Long empregadaId;
    public Long servicoId;
    public String descricao;
    public LocalDate dataServico;
}