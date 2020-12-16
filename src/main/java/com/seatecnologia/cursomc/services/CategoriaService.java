package com.seatecnologia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatecnologia.cursomc.domain.Categoria;
import com.seatecnologia.cursomc.repositories.CategoriaRepository;
import com.seatecnologia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {

		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id.toString()
				+ ", Tipo: " + Categoria.class.getName()
				));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null); // garantir que é um novo objeto
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId()); // joga exceção se não existir
		return repo.save(obj);
	}
	
}
