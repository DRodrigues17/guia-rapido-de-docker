package com.drodrigues17.poc.postgre.controller;

import com.drodrigues17.poc.postgre.model.Jogo;
import com.drodrigues17.poc.postgre.repository.JogoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequiredArgsConstructor
@RestController
@RequestMapping("/jogos")
public class JogoController {
  private final JogoRepository jogoRepository;

  @GetMapping
  public ResponseEntity<Jogo> buscarJogo(){
    Jogo jogo = Jogo.builder()
        .nome("Tony Hawk's Downhill Jam")
        .empresaResponsavel("Activision, SuperVillain Studios")
        .estiloJogo("Corrida, Skate")
        .faixaEtaria(10)
        .plataforma("Playstation 2")
        .dataLancamento(LocalDate.of(2007,5,8))
        .build();
    return ResponseEntity.ok(jogoRepository.save(jogo));
  }

}