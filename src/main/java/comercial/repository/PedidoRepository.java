package comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import comercial.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	@Query("SELECT e FROM Pedido e")
	public List<Pedido> findAllPedidos();
	
	@Query("SELECT e FROM Pedido e WHERE e.idComercial=?1")
	public List<Pedido> findByComercialId(Integer comercialId);
	
}
