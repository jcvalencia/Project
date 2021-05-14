package org.generation.api.participante;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParticipanteConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(ParticipanteRepository repository) {
		return args -> {
			Participante jperez = new Participante(1L, "Lucas", "lucas@email.com", "Muy dedicado");
			Participante mdiaz = new Participante(2L, "Tiago", "tiago@email.com", "Participante Introvertido");
			Participante jvazquez = new Participante(3L, "Marcelo", "marcelo@email.com", "Muy dedicado");
			repository.saveAll(
					List.of(jperez, mdiaz, jvazquez)
					);
		}; 
	}
	
}//class
