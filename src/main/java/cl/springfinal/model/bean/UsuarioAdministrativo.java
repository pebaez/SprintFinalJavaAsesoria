package cl.springfinal.model.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class UsuarioAdministrativo {
	
	@Column(name="idAdministrativo")
	private String idAdministrativo;
		
	@Column(name="rutAdministrativo")
	private String rutAdministrativo;
	
	@Column(name="area")
	private String area;
	
	@Column(name="experienciaprevia")
	private String experiencia;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="IdUsuario")
	private int IdUsuario;
	
	@Column(name="nombres")
	private String nombres; 
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="fechaNacimiento")
	private String fechaNacimiento;
		
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="rol")
	private String rol;
	
	@Column(name="password")
	private String password;
	
	
	public UsuarioAdministrativo() {}

	public UsuarioAdministrativo(String idAdministrativo, String rutAdministrativo, String area, String experiencia,
			int idUsuario, String nombres, String apellidos, String fechaNacimiento, String usuario, String rol,
			String password) {
		super();
		this.idAdministrativo = idAdministrativo;
		this.rutAdministrativo = rutAdministrativo;
		this.area = area;
		this.experiencia = experiencia;
		IdUsuario = idUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.usuario = usuario;
		this.rol = rol;
		this.password = password;
	}

	public String getIdAdministrativo() {
		return idAdministrativo;
	}

	public void setIdAdministrativo(String idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
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

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	

	
}
