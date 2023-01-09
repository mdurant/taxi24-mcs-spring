package org.mdurant.spring.mcsrv.conductores.services;
import java.util.List;
import java.util.Optional;

import org.mdurant.spring.mcsrv.conductores.entities.conductores;

public interface ConductorService {
	
		// todos
		// aquellos disponibles
		// disponibles en un radio de 3km para una ubicación especifica
		// conductor x id
	
	List<conductores> listarTodos();
	List<conductores> disponibles();
	List<conductores> disponibles3km();
	Optional<conductores> porId(Long id); 
	
	
	

}
