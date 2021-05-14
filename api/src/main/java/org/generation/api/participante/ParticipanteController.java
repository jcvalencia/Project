package org.generation.api.participante;

import java.util.List;

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
@RequestMapping(path = "api/v1/participante")
public class ParticipanteController {
	private final ParticipanteService participanteService;
	
	@Autowired
	public ParticipanteController(ParticipanteService participanteService) {
		this.participanteService = participanteService;
	} //constructor 
	
	
	@GetMapping
	public List<Participante> getParticipantes() {
		return participanteService.getParticipantes();
	}//getParticipantes
	
	@PostMapping
	public void registerNewParticipante(@RequestBody Participante participante) {
		participanteService.addNewParticipante(participante);
	}//registerNewParticipante

	@DeleteMapping(path = "{participanteID}")
	public void deleteParticipante(@PathVariable("participanteID") Long participanteId) {
		participanteService.deleteParticipante(participanteId);
	}//delete 
	
	@PutMapping(path = "{participanteID}")
	public void updateParticipante(
			@PathVariable("participanteID") Long participanteId,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String email,
			@RequestParam(required = false) String observaciones) {
			
		participanteService.updateParticipante(participanteId, nombre, email, observaciones);
		
	}// update
	
	
}//class
