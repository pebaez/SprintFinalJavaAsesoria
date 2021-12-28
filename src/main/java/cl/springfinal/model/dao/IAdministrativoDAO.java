package cl.springfinal.model.dao;

import java.util.List;

import cl.springfinal.model.bean.Administrativo;
import cl.springfinal.model.bean.UsuarioAdministrativo;


public interface IAdministrativoDAO {
	
	public boolean createAdministrativo(Administrativo a);
		
	public List<Administrativo> readAllAdministrativo();
	
	public Administrativo readOneAdministrativo(int id);
	
	public boolean updateAdministrativo(Administrativo a);
	
	public int deleteAdministrativo(int id);

	//public List<UsuarioAdministrativo> getAllUsuarioAdministrador();

	List<UsuarioAdministrativo> readAllUsuarioAdministrativo();

	

}
