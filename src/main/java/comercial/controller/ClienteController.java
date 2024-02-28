package comercial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comercial.model.Cliente;
import comercial.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/all")
	public List<Cliente> verCliente(){
		return clienteService.getAllClientes();
	}
	
}