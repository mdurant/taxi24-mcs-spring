package org.mdurant.spring.mcsrv.conductores.services;
import java.util.List;
import java.util.Optional;

import org.mdurant.spring.mcsrv.conductores.entities.Conductores;
import org.mdurant.spring.mcsrv.conductores.repositories.ConductorRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConductorService {
	
		// todos
		// aquellos disponibles
		// disponibles en un radio de 3km para una ubicación especifica
		// conductor x id
	
	List<Conductores> listarTodos();
	List<Conductores> findByDisponible();
	List<Conductores> disponibles3km();
	Optional<Conductores> porId(Long id); 
	
	
	

}
