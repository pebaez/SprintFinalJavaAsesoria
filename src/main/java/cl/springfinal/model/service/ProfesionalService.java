package cl.springfinal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.springfinal.model.bean.Administrativo;
import cl.springfinal.model.bean.Profesional;
import cl.springfinal.model.bean.UsuarioProfesional;
import cl.springfinal.model.dao.impl.AdministrativoDAOImpl;
import cl.springfinal.model.dao.impl.ProfesionalDAOImpl;



@Service
public class ProfesionalService {
	
	
	@Autowired
	ProfesionalDAOImpl cDAO;
	
	
	
	public ProfesionalService() {
		super();
	}
	


	@Transactional
	public List<Profesional> getAll(){
		
		return cDAO.readAllProfesional();
		
	}
	
	@Transactional
	public List<UsuarioProfesional> getAllUsuarioProfesional(){
		
		return cDAO.readAllUsuarioProfesional();
		
	}
	
	
	@Transactional
	public boolean createProfesional(Profesional p){
		
		return cDAO.createProfesional(p);
		
	}



	public List<UsuarioProfesional> readOneProfesionalUsuario(int idProfesional, int idUsuario) {
		// TODO Auto-generated method stub
				
		return cDAO.readAllProfesionalUsuario(idProfesional, idUsuario);
	}



	public Object modificarUsuarioProfesional(Profesional profesional) {
		// TODO Auto-generated method stub
		
		return cDAO.modificarUsuarioProfesional(profesional);
		
		
	}



	public void eliminarProfesional(int idProfesional, int idUsuario) {
		// TODO Auto-generated method stub
		
	}
	

	

}
