package comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comercial.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {


}
