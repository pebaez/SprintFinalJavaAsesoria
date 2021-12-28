package cl.springfinal.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

//Esta debe ser el tipo de importacion para rowmapper
// https://stackoverflow.com/questions/13819995/spring-3-1-2-rowmapper-parameterization

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cl.springfinal.model.bean.Asistentes;
import cl.springfinal.model.dao.IAsistenteDAO;


@SuppressWarnings("deprecation")
@Repository
public class AsistenteDAOImpl implements IAsistenteDAO {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	
	
	@Override
	public boolean createAsistente(Asistentes a) {
		// TODO Auto-generated method stub
		try
		{
			
			boolean resultado = false;

			String sql = "Insert into Asistente (idEmpresa, rutAsistente, nombres, apellidos )";

			sql += "values (?, ?, ?, ? );";
			
			int estado = template.update(sql, new Object[] { a.getIdEmpresa(), a.getRutAsistente(), a.getNombresAsistentes(), a.getApellidosAsistentes() });
		
				if (estado > 0 )
				{
					
					resultado = true;
					
				}
				else
				{
					
					resultado =false;
					
				}
				
				return resultado;
		}
		catch (InvalidResultSetAccessException e) 
		{
		    throw new RuntimeException(e);
		   
		} 
		catch (DataAccessException e)
		{
		    throw new RuntimeException(e);
		    
		   
		}
	}

	@Override
	public List<Asistentes> readAllAsistente() {
		// TODO Auto-generated method stub
		String sql = " SELECT * "
				+ " FROM asistentes ;";
		
		return template.query(sql, new AsistenteRowMapper());
		
	}
	
	@Override
	public List<Asistentes> readAllAsistenteCapacitacion(int idCapacitacion) {
		// TODO Auto-generated method stub
		String sql = " SELECT * "
				+ " FROM asistentes "
				+ " WHERE idCapacitacion = " + idCapacitacion ;
		
		return template.query(sql, new AsistenteRowMapper());
		
	}


	@Override
	public Asistentes readOneAsistentes(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAsistentes(Asistentes a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteAsistentes(int id) {
		// TODO Auto-generated method stub
	
		String sql = " DELETE * from ASISTENTES Where idAsistente= " + id; 
	
		return template.update(sql);
		
	}
	
	
	


	
	
	/***
	 *	Clase automapper que permite mapear la SQL con la BD. 
	 * @author Pedro Báez Araya
	 *
	 */
	
		
	class AsistenteRowMapper implements RowMapper<Asistentes>
	{
		
		public Asistentes mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			Asistentes asistentes = new Asistentes();
			
			asistentes.setIdAsistente(rs.getString("idAsistente"));
			
			asistentes.setIdEmpresa(rs.getString("idEmpresa"));
				
			asistentes.setRutAsistente(rs.getString("rutAsistente"));
				
			asistentes.setNombresAsistentes(rs.getString("nombres"));
			
			asistentes.setApellidosAsistentes(rs.getString("apellidos"));
		
			
			return asistentes;
		
		}
	}


	



}	


