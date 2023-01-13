package org.mdurant.spring.mcsrv.conductores.services;

import java.util.List;
import java.util.Optional;

import org.mdurant.spring.mcsrv.conductores.entities.Conductores;
import org.mdurant.spring.mcsrv.conductores.repositories.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConductorServiceImp implements ConductorService {

	@Autowired
	private ConductorRepository repository;
	
	
	@Override
	public List<Conductores> listarTodos() {
		
		return (List<Conductores>) repository.findAll();
	}

	@Override
	public List<Conductores> todosDisponibles(true) {
		
		return (List<Conductores>) repository.findByDisponible(false);
	}

	@Override
	public List<Conductores> disponibles3km() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Conductores> porId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
