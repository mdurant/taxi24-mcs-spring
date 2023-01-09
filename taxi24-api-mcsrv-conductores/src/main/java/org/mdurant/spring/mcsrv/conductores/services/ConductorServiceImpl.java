package org.mdurant.spring.mcsrv.conductores.services;

import java.util.List;
import java.util.Optional;

import org.mdurant.spring.mcsrv.conductores.entities.conductores;
import org.mdurant.spring.mcsrv.conductores.repositories.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConductorServiceImpl implements ConductorService {

	
	@Autowired
	private ConductorRepository repository;
	
	
	@Override
	@Transactional(readOnly= true)
	public List<conductores> listarTodos() {
		// TODO Auto-generated method stub
		return (List<conductores>) repository.findAll();
	}
	/*

	@Override
	public List<conductores> disponibles(Long id) {
		// TODO Auto-generated method stub
		return repository.findAllById(id);
	}
	*/

	@Override
	public List<conductores> disponibles3km() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly= true)
	public Optional<conductores> porId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<conductores> disponibles() {
		// TODO Auto-generated method stub
		return null;
	}

}
