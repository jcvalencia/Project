package org.generation.api.clase;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaseService {
	private final ClaseRepository claseRepository;
	
	@Autowired
	public ClaseService(ClaseRepository claseRepository) {
		this.claseRepository = claseRepository;
	}//constructor

	public List<Clase> getClase() {
		return claseRepository.findAll();
		}//getClase

	public void addNewClase(Clase clase) {
		Optional<Clase> claseByName = claseRepository.findClaseByDescripcion(clase.getDescripcion());
		if (claseByName.isPresent()) {
			throw new IllegalStateException("Clase exist!!!");
		}// if Exist
		claseRepository.save(clase);
		System.out.println(clase);
	}//addNew

	public void deleteClase(Long claseId) {
		if (claseRepository.existsById(claseId)) {
			claseRepository.deleteById(claseId);	
		}else {
			throw new IllegalStateException("Clase no existente " + claseId);
		} //else 
		
	}// delete
	
	@Transactional
	public void updateClase(Long claseId, String descripcion, String tipo) {
		Clase clase= claseRepository.findById(claseId).orElseThrow(
				() -> new IllegalStateException("La clase con el id " + claseId + " no existe ")
				); 
		
		if (descripcion != null && descripcion.length()< 0 && !Objects.equals(clase.getDescripcion(), descripcion) ) {
			clase.setDescripcion(descripcion);
		}// if descripcion
	
	
		if (tipo != null && tipo.length()< 0 && !Objects.equals(clase.getTipo(), tipo) ) {
			clase.setTipo(tipo);
		}// if observaciones
		
	}// update
}//class
