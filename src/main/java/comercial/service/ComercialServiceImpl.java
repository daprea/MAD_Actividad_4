package comercial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comercial.model.Comercial;
import comercial.repository.ComercialRepository;

@Service
public class ComercialServiceImpl implements ComercialService {

	@Autowired
	ComercialRepository repoCom;
	
	@Override
	public List<Comercial> buscarTodos() {
		return repoCom.findAll();
	}
	
	@Override
    public Comercial getComercialById(int idComercial){
		return repoCom.findComercial(idComercial);
	}
}
