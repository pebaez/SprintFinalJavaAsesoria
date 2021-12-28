package cl.springfinal.model.dao;

import java.util.List;

import cl.springfinal.model.bean.Capacitacion;

public interface ICapacitacionDAO {
	
	
	public boolean create(Capacitacion c);
	
	public List<Capacitacion> readAll();
	
	public List<Capacitacion> readOne(int id);
	
	public boolean update(Capacitacion c);
	
	public int delete(int id);
	

}
