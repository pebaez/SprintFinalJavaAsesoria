package cl.springfinal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.springfinal.model.bean.Administrativo;
import cl.springfinal.model.bean.UsuarioAdministrativo;
import cl.springfinal.model.dao.impl.AdministrativoDAOImpl;



@Service
public class AdministrativoService {
	
	
	@Autowired
	AdministrativoDAOImpl cDAO;
	
	
	
	public AdministrativoService() {
		super();
	}
	


	@Transactional
	public List<Administrativo> getAll(){
		
		return cDAO.readAllAdministrativo();
		
	}
	
	
	@Transactional
	public boolean createAdministrativo(Administrativo a){
		
		return cDAO.createAdministrativo(a);
		
	}



	public List<UsuarioAdministrativo> getAllUsuarioAdministrador() {
		// TODO Auto-generated method stub
		return cDAO.readAllUsuarioAdministrativo();
	}
	

	

}
