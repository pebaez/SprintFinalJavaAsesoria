package cl.springfinal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.springfinal.model.bean.Capacitacion;
import cl.springfinal.model.bean.Cliente;
import cl.springfinal.model.bean.UsuarioCliente;
import cl.springfinal.model.dao.impl.ClienteDAOImpl;



@Service
public class ClienteService {
	
	
	@Autowired
	ClienteDAOImpl cDAO;
	
	
	
	public ClienteService() {
		super();
	}
	


	@Transactional
	public List<UsuarioCliente> getAll(){
		
		return cDAO.readAll();
		
	}
	
	
	@Transactional
	public boolean createCliente(Cliente c){
		
		return cDAO.createCliente(c);
		
	}



	public Object eliminarCliente(int idCliente, int idUsuario) {
		// TODO Auto-generated method stub
		return cDAO.deleteCliente(idCliente, idUsuario);
				
	}



	public List<UsuarioCliente> read() {
		// TODO Auto-generated method stub
		return cDAO.readAll();
	}
	
	public List<UsuarioCliente> readOneClienteUsuario(int idCliente, int idUsuario) {
		// TODO Auto-generated method stub
		return cDAO.readOneUsuarioCliente(idCliente, idUsuario);
	}



	public int modificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return cDAO.modificarCliente(cliente);
		
	}
	

	

}
