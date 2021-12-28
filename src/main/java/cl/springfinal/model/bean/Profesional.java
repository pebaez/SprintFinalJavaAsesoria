package cl.springfinal.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="profesional")
public class Profesional implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idProfesional")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public String idProfesional;
	
	@Column(name="rutProfesional")
	public String rutProfesional;
	
	@Column(name="titulo")
	public String titulo;
	
	@Column(name="fechaIngreso")
	public String fechaIngreso;
	
	public Profesional() {
		
		super();
	}

	public Profesional(String idProfesional, String rutProfesional, String titulo, String fechaIngreso) {
		super();
		this.idProfesional = idProfesional;
		this.rutProfesional = rutProfesional;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(String idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getRutProfesional() {
		return rutProfesional;
	}

	public void setRutProfesional(String rutProfesional) {
		this.rutProfesional = rutProfesional;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
}
