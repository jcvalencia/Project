package org.generation.api.clase;

import java.util.List;

import org.generation.api.participante.Participante;
import org.generation.api.participante.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/clase")
public class ClaseController {
private final ClaseService claseService;
	
	@Autowired
	public ClaseController(ClaseService claseService) {
		this.claseService = claseService;
	} //constructor 
	
	@GetMapping
	public List<Clase> getClase() {
		return claseService.getClase();
	}//get
	
	@PostMapping
	public void registerNewClase(@RequestBody Clase clase) {
		claseService.addNewClase(clase);
	}//registerNew

	@DeleteMapping(path = "{claseID}")
	public void deleteClase(@PathVariable("claseID") Long claseId) {
		claseService.deleteClase(claseId);
	}//delete 
	
	@PutMapping(path = "{claseID}")
	public void updateClase(
			@PathVariable("claseID") Long claseId,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String tipo) {
			
		claseService.updateClase(claseId, descripcion, tipo);
		
	}// update
	
}//class
