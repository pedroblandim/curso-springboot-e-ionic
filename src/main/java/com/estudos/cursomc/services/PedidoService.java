package com.estudos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.cursomc.domain.Pedido;
import com.estudos.cursomc.repositories.PedidoRepository;
import com.estudos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {

		Optional<Pedido> pedido = repo.findById(id);
		return pedido.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id.toString()
				+ ", Tipo: " + Pedido.class.getName()
				));
	}

}
