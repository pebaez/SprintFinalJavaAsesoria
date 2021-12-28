package cl.springfinal.model.bean;

public class Contacto {
	
	private String nombres;
	
	private String apellidos;
	
	private String empresa;
	
	private String formaContacto;
	
	private String email;
	
	private String telefono;
	
	
	public Contacto() {}


	public Contacto(String nombres, String apellidos, String empresa, String formaContacto, String email,
			String telefono) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.empresa = empresa;
		this.formaContacto = formaContacto;
		this.email = email;
		this.telefono = telefono;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}


	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	/**
	 * @return the formaContacto
	 */
	public String getFormaContacto() {
		return formaContacto;
	}


	/**
	 * @param formaContacto the formaContacto to set
	 */
	public void setFormaContacto(String formaContacto) {
		this.formaContacto = formaContacto;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	};
	
	
	
	
	
	
	
	

}
