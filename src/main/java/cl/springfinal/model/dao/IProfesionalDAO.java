package cl.springfinal.model.dao;

import java.util.List;

import cl.springfinal.model.bean.Profesional;
import cl.springfinal.model.bean.UsuarioProfesional;

public interface IProfesionalDAO {

	boolean createProfesional(Profesional p);

	List<Profesional> readAllProfesional();

	Profesional readOneProfesional(int id);

	boolean updateProfesional(Profesional p);

	int deleteProfesional(int id);
	
	List<UsuarioProfesional> readAllUsuarioProfesional();
	
	public Object modificarUsuarioProfesional(Profesional profesional);

}
