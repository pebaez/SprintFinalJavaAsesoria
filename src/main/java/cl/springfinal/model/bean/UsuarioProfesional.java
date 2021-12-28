package cl.springfinal.model.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class UsuarioProfesional {
	
	@Column(name="idProfesional")
	private String idProfesional;
		
	@Column(name="rutProfesional")
	private String rutProfesional;
	
	@Column(name="fechaIngreso")
	private String fechaIngreso;
	
	@Column(name="titulo")
	private String titulo;
	
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

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
