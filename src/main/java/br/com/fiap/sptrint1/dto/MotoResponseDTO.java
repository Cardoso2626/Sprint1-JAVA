package br.com.fiap.sptrint1.dto;

import br.com.fiap.sptrint1.model.Chaveiro;
import br.com.fiap.sptrint1.model.Patio;

import java.time.LocalDate;

public record MotoResponseDTO(Long id, String modelo, String cor, String placa, LocalDate dataFabricacao, Long patioId, Long chaveiroId) {
}
