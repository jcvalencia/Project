package org.generation.api.participante;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long>{
	@Query("SELECT p FROM participante p WHERE p.name= ?1")
	Optional<Participante> findParticipanteByName(String name);
	
}//interface
