package com.seatecnologia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatecnologia.cursomc.domain.Pedido;
import com.seatecnologia.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	// Resources representam os controladores da API
	// Os nomes dos serviços devem seguir o seguinte padrão:
	//		<nome da classe de domínio><sufixo do pacote>.
	// Ex: PedidoResource.

	@Autowired
	private PedidoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {	
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
