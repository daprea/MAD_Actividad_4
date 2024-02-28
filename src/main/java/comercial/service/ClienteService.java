package comercial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import comercial.model.Cliente;

public interface ClienteService {

	public List<Cliente> getAllClientes();
	
}
