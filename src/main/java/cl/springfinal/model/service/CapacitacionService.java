package cl.springfinal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.springfinal.model.bean.Capacitacion;
import cl.springfinal.model.dao.impl.CapacitacionDAOImpl;



@Service
public class CapacitacionService {
	
	
	@Autowired
	CapacitacionDAOImpl cDAO;
	
	
	
	public CapacitacionService() {
		super();
	}
	


	@Transactional
	public List<Capacitacion> getAll(){
		
		return cDAO.readAll();
		
	}
	
	@Transactional
	public List<Capacitacion> getOne(int id){
		
		return cDAO.readOne(id);
		
	}
	
	
	
	
	@Transactional
	public boolean create(Capacitacion c){
		
		return cDAO.create(c);
		
	}
	
	@Transactional
	public int delete(int id){
		
		return cDAO.delete(id);
		
	}
	
	
	
	

}
