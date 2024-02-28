package comercial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@Entity
@Table(name="comerciales")
public class Comercial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_comercial")
	private Integer idComercial;
	
	String nombre, apellido1, apellido2;
	
	private Double comision;


}
