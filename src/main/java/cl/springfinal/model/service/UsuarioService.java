package cl.springfinal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.springfinal.model.bean.Cliente;
import cl.springfinal.model.bean.Usuarios;
import cl.springfinal.model.dao.impl.UsuarioDAOImpl;





@Service
public class UsuarioService {
	
	
	@Autowired
	UsuarioDAOImpl cDAO;
	
	
	
	public UsuarioService() {
		super();
	}
	

	@Transactional
	public boolean createUsuarios(Usuarios u){
		
		return cDAO.createUsuarios(u);
		
	}


	public void eliminarUsuarios(int idCliente, int idUsuario) {
		// TODO Auto-generated method stub
		
	}


	public Object modificarUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub
		
		return cDAO.modificarUsuario(usuario);
		
	}

	

}
