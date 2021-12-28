package cl.springfinal.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;







@Entity
@Table(name="cliente")
public class Cliente implements Serializable  {
	/**
	 * 
	 * 
	 */
	
	private static final long serialVersionUID = 5863623831881360866L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="IdCliente")
	private int IdCliente;
	
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
	
	@OneToOne
	@JoinColumn(name = "rutUsuario", updatable = false, nullable = false)
	public Usuarios usuarios;
	
	
	
	public Cliente() { 
		super();
	}




	public Cliente(String rutUsuario, int idUsuario, String nombres, String apellidos, String fechaNacimiento,
			String usuario, String rol, String password, int idCliente, String rutCliente, String telefono, String afp,
			String sistemaSalud, String direccion, String comuna, String edad, Usuarios usuarios) {
		
		IdCliente = idCliente;
		this.rutCliente = rutCliente;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.usuarios = usuarios;
	}







	public int getIdCliente() {
		return IdCliente;
	}



	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}



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

	
}
