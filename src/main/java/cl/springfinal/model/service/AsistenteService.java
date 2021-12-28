package cl.springfinal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.springfinal.model.bean.Asistentes;
import cl.springfinal.model.dao.impl.AsistenteDAOImpl;



@Service
public class AsistenteService {
	
	
	@Autowired
	AsistenteDAOImpl cDAO;
	
	
	
	public AsistenteService() {
		super();
	}
	




	@Transactional
	public List<Asistentes> getAllAsistentesCapacitacion(int idCapacitacion) {
		// TODO Auto-generated method stub
		return cDAO.readAllAsistenteCapacitacion(idCapacitacion);
		
	}
	
	
	
	

	

}
