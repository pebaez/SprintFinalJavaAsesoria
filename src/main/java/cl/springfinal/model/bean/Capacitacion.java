package cl.springfinal.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "capacitacion")
public class Capacitacion implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5863623831881360866L;

	@Id
	@Column(name="idcapacitacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private String id;
	
	private String rut;
	
	private String nombres;
	
	private String direccion;
	
	private String fechaCapacitacion;
	
	private String horario;
	
	private String duracion;
	
	private String cantidadAsistentes;
	
	private String comentarios;
	
		
	
	public Capacitacion() {}

	public Capacitacion(String id, String rut, String nombres, String direccion, String fechaCapacitacion,
			String horario, String duracion, String cantidadAsistentes, String comentarios) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombres = nombres;
		this.direccion = direccion;
		this.fechaCapacitacion = fechaCapacitacion;
		this.horario = horario;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
		this.comentarios = comentarios;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}



	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}



	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}



	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}



	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	/**
	 * @return the fechaCapacitacion
	 */
	public String getFechaCapacitacion() {
		return fechaCapacitacion;
	}



	/**
	 * @param fechaCapacitacion the fechaCapacitacion to set
	 */
	public void setFechaCapacitacion(String fechaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
	}



	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}



	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}



	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}



	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}



	/**
	 * @return the cantidadAsistentes
	 */
	public String getCantidadAsistentes() {
		return cantidadAsistentes;
	}



	/**
	 * @param cantidadAsistentes the cantidadAsistentes to set
	 */
	public void setCantidadAsistentes(String cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}



	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}



	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
}
