package org.generation.api.clase;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.generation.api.participante.Participante;

@Entity
@Table (name="clases")
public class Clase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	private String descripcion;
	//private Participante[] participantes;
	private String tipo;
		
//	public Clase(long id, String descripcion, Participante[] participantes, String tipo) {
//		super();
//		this.id = id;
//		this.descripcion = descripcion;
//		this.participantes = participantes;
//		this.tipo = tipo;
//	}
	public Clase(long id, String descripcion, String tipo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	
		this.tipo = tipo;
	}
	public long getId() {
		return id;
	}//getId
	public void setId(long id) {
		this.id = id;
	}//setId
	public String getDescripcion() {
		return descripcion;
	}//getDescripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion
//	public Participante[] getParticipantes() {
//		return participantes;
//	}//getParticipantes
//	public void setParticipantes(Participante[] participantes) {
//		this.participantes = participantes;
//	}//setParticipantes
	public String getTipo() {
		return tipo;
	}//getTipo
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}//setTipo
//	@Override
//	public String toString() {
//		return "Clase [id=" + id + ", descripcion=" + descripcion + ", participantes=" + Arrays.toString(participantes)
//				+ ", tipo=" + tipo + "]";
//	}//toString
	@Override
	public String toString() {
		return "Clase [id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + "]";
	}//toString
	
	
}//class Clase
