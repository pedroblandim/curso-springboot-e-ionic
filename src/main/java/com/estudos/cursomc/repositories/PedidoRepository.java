package com.estudos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	// Classe de acesso a dados
}
