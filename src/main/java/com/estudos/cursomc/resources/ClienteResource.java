package com.estudos.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.cursomc.domain.Cliente;
import com.estudos.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	// Resources representam os controladores da API
	// Os nomes dos serviços devem seguir o seguinte padrão:
	//		<nome da classe de domínio><sufixo do pacote>.
	// Ex: ClienteResource.

	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {	
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
