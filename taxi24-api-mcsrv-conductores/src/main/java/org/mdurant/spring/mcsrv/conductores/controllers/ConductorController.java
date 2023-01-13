package org.mdurant.spring.mcsrv.conductores.controllers;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.mdurant.spring.mcsrv.conductores.entities.Conductores;
import org.mdurant.spring.mcsrv.conductores.services.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConductorController {
	
	@Autowired
	private ConductorService service;
	
	
	@GetMapping("/listarTodosConductores")
	public List<Conductores> listar(){
		return service.listarTodos();
	}
	
	@GetMapping("/listarTodosConductoresDisponibles")
	public List<Conductores> listarDisponibles(){
		return service.todosDisponibles(true);
	}

	@GetMapping("/listarConductores/{id}")
	public ResponseEntity<?> detalle(@PathVariable Long id) {
		Optional<Conductores> conductorOptional = service.porId(id);
		if(conductorOptional.isPresent()) {
			return ResponseEntity.ok(conductorOptional.get());
		}
		return ResponseEntity.notFound().build();

	}
}
