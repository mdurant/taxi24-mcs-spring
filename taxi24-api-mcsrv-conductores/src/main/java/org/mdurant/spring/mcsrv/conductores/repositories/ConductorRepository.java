package org.mdurant.spring.mcsrv.conductores.repositories;

import java.util.List;

import org.mdurant.spring.mcsrv.conductores.entities.Conductores;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ConductorRepository extends CrudRepository<Conductores, Long> {
	
	
	public List<Conductores> listarTodos();
	
	
	@Query(value= "select cond.id, cond.nombre, cond.apellido, cond.codigo_ci, cond.email \n"
			+ "from conductores as cond where cond.disponible= true", nativeQuery = true)
	public List<Conductores> findByDisponible(Boolean disponible);
	
	public List<Conductores> porId();
	
	public List<Conductores> findByRadio3km(Boolean radio3km);
	
	

}
