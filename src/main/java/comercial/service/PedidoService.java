package comercial.service;

import comercial.model.Pedido;

import java.util.List;

public interface PedidoService {
    
	public List<Pedido> getAllPedidos();
	
    public List<Pedido> getPedidosByComercialId(Integer comercialId);
}
