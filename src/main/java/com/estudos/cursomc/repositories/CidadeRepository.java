package com.estudos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	// Classe de acesso a dados
}
