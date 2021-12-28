package cl.springfinal.model.bean;

public class Asistentes {
	
	
	String idAsistente;
	
	String idEmpresa;
	
	String rutAsistente;
	
	String nombresAsistentes;
	
	String apellidosAsistentes;
	
	boolean asistio;
	
	public Asistentes() {}

	

	public Asistentes(String idAsistente, String idEmpresa, String rutAsistente, String nombresAsistentes,
			String apellidosAsistentes, boolean asistio) {
		super();
		this.idAsistente = idAsistente;
		this.idEmpresa = idEmpresa;
		this.rutAsistente = rutAsistente;
		this.nombresAsistentes = nombresAsistentes;
		this.apellidosAsistentes = apellidosAsistentes;
		this.asistio = asistio;
	}



	public String getIdAsistente() {
		return idAsistente;
	}



	public void setIdAsistente(String idAsistente) {
		this.idAsistente = idAsistente;
	}



	public String getIdEmpresa() {
		return idEmpresa;
	}



	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}



	public String getRutAsistente() {
		return rutAsistente;
	}



	public void setRutAsistente(String rutAsistente) {
		this.rutAsistente = rutAsistente;
	}



	public String getNombresAsistentes() {
		return nombresAsistentes;
	}



	public void setNombresAsistentes(String nombresAsistentes) {
		this.nombresAsistentes = nombresAsistentes;
	}



	public String getApellidosAsistentes() {
		return apellidosAsistentes;
	}



	public void setApellidosAsistentes(String apellidosAsistentes) {
		this.apellidosAsistentes = apellidosAsistentes;
	}



	public boolean isAsistio() {
		return asistio;
	}



	public void setAsistio(boolean asistio) {
		this.asistio = asistio;
	}

	
	
	

}
