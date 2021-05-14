package org.generation.api.participante;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteService {
	private final ParticipanteRepository participanteRepository;
	
	@Autowired
	public ParticipanteService(ParticipanteRepository participanteRepository) {
		this.participanteRepository = participanteRepository;
	}//constructor

	public List<Participante> getParticipantes() {
		return participanteRepository.findAll();
		
		}//getParticipantes

	public void addNewParticipante(Participante participante) {
		Optional<Participante> participanteByName = participanteRepository.findParticipanteByName(participante.getNombre());
		if (participanteByName.isPresent()) {
			throw new IllegalStateException("Name exist!!!");
		}// if Exist
		participanteRepository.save(participante);
		System.out.println(participante);
	}//addNewParticipante

	public void deleteParticipante(Long participanteId) {
		if (participanteRepository.existsById(participanteId)) {
			participanteRepository.deleteById(participanteId);	
		}else {
			throw new IllegalStateException("Participante no existente " + participanteId);
		} //else 
		
	}// delete
	
	@Transactional
	public void updateParticipante(Long participanteId, String nombre, String email, String observaciones) {
		Participante participante = participanteRepository.findById(participanteId).orElseThrow(
				() -> new IllegalStateException("El participante con el id " + participanteId + " no existe ")
				); 
		
		if (nombre != null && nombre.length()< 0 && !Objects.equals(participante.getNombre(), nombre) ) {
			participante.setNombre(nombre);
		}// if nombre
		
		
		if (email != null && email.length()< 0 && !Objects.equals(participante.getEmail(), email) ) {
			participante.setEmail(email);
		}// if email
		
		if (observaciones != null && observaciones.length()< 0 && !Objects.equals(participante.getObservaciones(), observaciones) ) {
			participante.setObservaciones(observaciones);
		}// if observaciones
		
	}// update
}//class
