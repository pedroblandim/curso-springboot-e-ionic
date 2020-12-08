package com.seatecnologia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatecnologia.cursomc.domain.Categoria;
import com.seatecnologia.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	// Resources representam os controladores da API
	// Os nomes dos serviços devem seguir o seguinte padrão:
	//		<nome da classe de domínio><sufixo do pacote>.
	// Ex: CategoriaResource.

	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {	
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
