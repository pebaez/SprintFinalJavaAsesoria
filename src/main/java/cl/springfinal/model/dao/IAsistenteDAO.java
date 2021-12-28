package cl.springfinal.model.dao;

import java.util.List;

import cl.springfinal.model.bean.Asistentes;


public interface IAsistenteDAO {
	
	public boolean createAsistente(Asistentes a);
	
	public List<Asistentes> readAllAsistente();
	
	public Asistentes readOneAsistentes(int id);
	
	public boolean updateAsistentes(Asistentes a);
	
	public int deleteAsistentes(int id);

	List<Asistentes> readAllAsistenteCapacitacion(int idCapacitacion);



	
	

}
