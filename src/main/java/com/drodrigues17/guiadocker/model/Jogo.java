package com.drodrigues17.guiadocker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Builder
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Jogo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(columnDefinition = "SERIAL")
  private Long id;
  private String nome;
  private String empresaResponsavel;
  private String estiloJogo;
  private Integer faixaEtaria;
  private String plataforma;
  private LocalDate dataLancamento;

}
