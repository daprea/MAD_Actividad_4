package comercial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comercial.model.Comercial;
import comercial.service.ComercialService;

@RestController
@RequestMapping("/comercial")
public class ComercialController {
	
	@Autowired
	ComercialService comServ;
	
	@GetMapping("/all")
	public List<Comercial> todosComerciales(){
		return comServ.buscarTodos();
	}
	
	@GetMapping("/uno/{id}")
	public Comercial comercialPorId(@PathVariable Integer id) {		
		return comServ.getComercialById(id);
	}
	
	@PostMapping("/alta")
    public Comercial altaComercial(@RequestBody Comercial comercial) {
        return null;//comercialService.saveComercial(comercial);
	}
	
	 @DeleteMapping("/eliminar/{id}")
	 public void eliminarComercial(@PathVariable Long id) {
		 // TODO finalizar
	 }
	 
	 
	@GetMapping("/test")
	public String test() {
		return "Hola";
	}

}
