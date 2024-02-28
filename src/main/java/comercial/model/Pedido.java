package comercial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private Integer idPedido;

	@Column(name="id_comercial")
	private Integer idComercial;
	
	private double total;
	private Date fecha;
	
}


//@id_ciente INT
//@id_comercial INT