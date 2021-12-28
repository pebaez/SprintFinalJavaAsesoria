package cl.springfinal.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
	
	
public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

private static final long serialVersionUID = 5863623831881360866L;
	
	@Id
	@Column(name="rutUsuario")
	protected String rutUsuario;

	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="IdUsuario")
	protected int IdUsuario;
	
	@Column(name="nombres")
	protected String nombres; 
	
	@Column(name="apellidos")
	protected String apellidos;
	
	@Column(name="fechaNacimiento")
	protected String fechaNacimiento;
		
	@Column(name="usuario")
	protected String usuario;
	
	@Column(name="rol")
	protected String rol;
	
	@Column(name="password")
	protected String password;
	
	
	
	public Usuarios() {
		super();
	}

	

	public Usuarios(String rutUsuario, int idUsuario, String nombres, String apellidos, String fechaNacimiento,
			String usuario, String rol, String password) {
		super();
		this.rutUsuario = rutUsuario;
		IdUsuario = idUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.usuario = usuario;
		this.rol = rol;
		this.password = password;
	}

	public String getRutUsuario() {
		return rutUsuario;
	}

	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
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
