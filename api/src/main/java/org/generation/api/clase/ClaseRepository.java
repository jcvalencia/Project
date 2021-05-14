package org.generation.api.clase;
import java.util.Optional;

import org.generation.api.clase.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Long>{
	@Query("SELECT c FROM clase c WHERE c.descripcion= ?1")
	Optional<Clase> findClaseByDescripcion(String descripcion);

	
} //interface
