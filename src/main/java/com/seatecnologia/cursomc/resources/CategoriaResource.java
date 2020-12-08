package com.seatecnologia.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatecnologia.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	// Resources representam os controladores da API
	// Os nomes dos serviços devem seguir o seguinte padrão:
	//		<nome da classe de domínio><sufixo do pacote>.
	// Ex: CategoriaResource.

//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping()
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
	
}
