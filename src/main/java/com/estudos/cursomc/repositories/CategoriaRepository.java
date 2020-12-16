package com.estudos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	// Classe de acesso a dados
}
