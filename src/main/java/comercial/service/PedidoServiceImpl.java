package comercial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import comercial.model.Pedido;
import comercial.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {
	
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAllPedidos();
    }
    
    
    public List<Pedido> getPedidosByComercialId(Integer comercialId) {
        return pedidoRepository.findByComercialId(comercialId);
    }
}