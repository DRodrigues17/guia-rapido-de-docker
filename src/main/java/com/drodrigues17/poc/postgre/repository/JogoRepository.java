package com.drodrigues17.poc.postgre.repository;

import com.drodrigues17.poc.postgre.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {
}