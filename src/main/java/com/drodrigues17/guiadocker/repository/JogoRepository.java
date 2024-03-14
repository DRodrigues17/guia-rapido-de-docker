package com.drodrigues17.guiadocker.repository;

import com.drodrigues17.guiadocker.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {
}