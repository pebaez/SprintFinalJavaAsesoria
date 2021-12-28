package cl.springfinal.model.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "administrativo")
public class Administrativo {
	
	
	public String idAdministrativo;
	public String area;
	public String experiencia;
	public String rutAdministrativo;
	
	
	public Administrativo() {}
	
	
	
	public Administrativo(String rutUsuario, int idUsuario, String nombres, String apellidos, String fechaNacimiento,
			String usuario, String rol, String password, String area, String experiencia, String rutAdministrativo) {
		
		this.area = area;
		this.experiencia = experiencia;
		this.rutAdministrativo = rutAdministrativo;
	}

	


	



	public String getRutAdministrativo() {
		return rutAdministrativo;
	}

	public void setRutAdministrativo(String rutAdministrativo) {
		this.rutAdministrativo = rutAdministrativo;
	}


	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	public String getIdAdministrativo() {
		return idAdministrativo;
	}



	public void setIdAdministrativo(String idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}
	

}
