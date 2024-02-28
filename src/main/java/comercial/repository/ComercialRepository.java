package comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import comercial.model.Comercial;

public interface ComercialRepository extends JpaRepository<Comercial, Integer>{

	// SELECT * FROM `comerciales` WHERE id_comercial=20;
	@Query("SELECT e FROM Comercial e WHERE e.idComercial=?1")
	public Comercial findComercial(Integer id);
	
}

