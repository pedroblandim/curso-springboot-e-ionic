package com.estudos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.cursomc.domain.Cliente;
import com.estudos.cursomc.repositories.ClienteRepository;
import com.estudos.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {

		Optional<Cliente> Cliente = repo.findById(id);
		return Cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id.toString()
				+ ", Tipo: " + Cliente.class.getName()
				));
	}

}
