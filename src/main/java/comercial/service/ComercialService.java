package comercial.service;

import java.util.List;

import comercial.model.Comercial;

public interface ComercialService {

	public List<Comercial> buscarTodos();
	
	public Comercial getComercialById(int idComercial);
	
}
