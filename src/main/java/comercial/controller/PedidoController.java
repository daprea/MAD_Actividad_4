package comercial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comercial.model.Cliente;
import comercial.model.Pedido;
import comercial.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping("/all")
	public List<Pedido> verPedidos(){
		return pedidoService.getAllPedidos();
	}
	
	@GetMapping("/{id}")
	public List<Pedido> verPedidosComercial(@PathVariable Integer id){
		return pedidoService.getPedidosByComercialId(id);
	}

}
