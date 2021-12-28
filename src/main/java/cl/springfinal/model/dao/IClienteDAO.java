package cl.springfinal.model.dao;

import java.util.List;


import cl.springfinal.model.bean.Cliente;
import cl.springfinal.model.bean.UsuarioCliente;

public interface IClienteDAO {
	
	public boolean createCliente(Cliente c);
		
	public List<UsuarioCliente> readAll();
	
	public List<UsuarioCliente> readOneUsuarioCliente(int idCliente, int idUsuario);
	
	public Cliente readOne(int id);
	
	public boolean update(Cliente c);
	
	public int delete(int id);
	
	public int modificarCliente(Cliente cliente);

}
