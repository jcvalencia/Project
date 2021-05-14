package org.generation.api.participante;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.generation.api.clase.Clase;


@Entity
@Table (name="participante")
public class Participante {
	@Id
	//@SequenceGenerator(name="participante_sequence", sequenceName = "participante_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO) //, generator = "participante_sequence" 
	private Long id;
	private String nombre;
	private String email;
	private String observaciones;
	//private Clase clase;
		
	public long getId() {
		return id;
	}//getId
	public Participante(Long id, String nombre, String email, String observaciones) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.observaciones = observaciones;
		//this.clase = clase;
	}//constructor
	public Participante() {
		// TODO Auto-generated constructor stub
	}
	public void setId(long id) {
		this.id = id;
	}//setId
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public String getEmail() {
		return email;
	}//getEmail
	public void setEmail(String email) {
		this.email = email;
	}//setEmail
	public String getObservaciones() {
		return observaciones;
	}//getObservaciones
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}//setObservaciones
//	public Clase getClase() {
//		return clase;
//	}//getClase
//	public void setClase(Clase clase) {
//		this.clase = clase;
//	}//setClase
	@Override
	public String toString() {
		return "Participante [id=" + id + ", nombre=" + nombre + ", email=" + email + ", observaciones=" + observaciones
				+ "]";
	}//
//	@Override
//	public String toString() {
//		return "Participante [id=" + id + ", nombre=" + nombre + ", email=" + email + ", observaciones=" + observaciones
//				+ ", clase=" + clase + "]";
//	}
	
}//class Participante
