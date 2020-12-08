package com.seatecnologia.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	// Resources representam os controladores da API
	// Os nomes dos serviços devem seguir o seguinte padrão:
	//		<nome da classe de domínio><sufixo do pacote>.
	// Ex: CategoriaResource.

//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public String listar() {
		return "Rest está funcionando";
	}
	
}
