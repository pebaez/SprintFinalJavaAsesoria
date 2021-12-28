package cl.springfinal.model.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class UsuarioCliente {
	
	@Column(name="idCliente")
	private String idCliente;
	
	
	@Column(name="rutCliente")
	private String rutCliente;
			
	@Column(name="telefono")
	private String telefono;
		
	@Column(name="afp")
	private String afp;
	
	@Column(name="sistemaSalud")
	private String sistemaSalud;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="comuna")
	private String comuna;
	
	@Column(name="edad")
	private String edad;
	
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

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
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
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

}
