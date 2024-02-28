package comercial.service;

import org.springframework.beans.factory.annotation.Autowired;

import comercial.repository.ClienteRepository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comercial.model.Cliente;
import comercial.repository.ComercialRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
    private ClienteRepository clienteRepository;
	    
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
}