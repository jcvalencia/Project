//package org.generation.api.clase;
//import java.util.List;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//	@Configuration
//	public class ClaseConfig {
//
//		@Bean
//		CommandLineRunner commandLineRunner(ClaseRepository repository) {
//			return args -> {
//				
//				Clase clase1 = new Clase(1L, "Turma Amarela",  "Presencial");
//				Clase clase2 = new Clase(2L, "Turma Verde",  "A distância");
//
//				repository.saveAll(
//						List.of(clase1, clase2)
//						);
//			}; 
//		}
//		
//	}//class
