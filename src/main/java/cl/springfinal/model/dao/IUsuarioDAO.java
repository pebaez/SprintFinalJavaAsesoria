package cl.springfinal.model.dao;

import java.util.List;

import cl.springfinal.model.bean.Usuarios;

public interface IUsuarioDAO {
	
	public boolean createUsuarios(Usuarios u);
		
	public List<Usuarios> readAllUsuario();
	
	public Usuarios readOneUsuario(int id);
	
	public boolean updateUsuario(Usuarios u);
	
	public int deleteUsuario(int id);

	

}
