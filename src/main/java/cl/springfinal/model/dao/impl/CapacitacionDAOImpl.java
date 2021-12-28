package cl.springfinal.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import cl.springfinal.model.bean.Capacitacion;
import cl.springfinal.model.dao.ICapacitacionDAO;

//Esta debe ser el tipo de importacion para rowmapper
// https://stackoverflow.com/questions/13819995/spring-3-1-2-rowmapper-parameterization

import org.springframework.jdbc.core.RowMapper;


@Repository
public class CapacitacionDAOImpl implements ICapacitacionDAO {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean create(Capacitacion c) {
		// TODO Auto-generated method stub
		
		try
		{
			
			boolean resultado = false;

			String sql = "Insert into capacitacion (rut, nombres, direccion, fechaCapacitacion, horario, duracion, cantidadAsistentes, comentarios)";

			sql += "values (?, ?, ?, ?, ?, ?, ?, ? );";
			
			int estado = template.update(sql, new Object[] { c.getRut(), c.getNombres(), c.getDireccion(), c.getFechaCapacitacion(),
				c.getHorario(), c.getDuracion(), c.getCantidadAsistentes(), c.getComentarios() });
		
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
	public List<Capacitacion> readAll() {
		// TODO Auto-generated method stub
				
		

			String sql = "SELECT * from capacitacion;";
			
			return template.query(sql, new CapacitactionRowMapper());
			
			//System.out.println(sql);
				
			
	}
	
	

	
	@Override
	public List<Capacitacion> readOne(int id) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM capacitacion where idcapacitacion="+ id;
		
		return template.query(sql, new CapacitactionRowMapper());    
		
	
	}

	@Override
	public boolean update(Capacitacion c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		
		
		String sql = "DELETE FROM capacitacion where idcapacitacion="+ id;
		
		return template.update(sql);
		
		
	}
	
	
	
	/***
	 *	Clase automapper que permite mapear la SQL con la BD. 
	 * @author Pedro Báez Araya
	 *
	 */
	
	
	class CapacitactionRowMapper implements RowMapper<Capacitacion>
	{
		
		public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			return new Capacitacion(
					rs.getString("idcapacitacion"),
					rs.getString("rut") , 
					rs.getString("nombres"),  
					rs.getString("direccion"),  
					rs.getString("fechaCapacitacion"),  
					rs.getString("horario"),  
					rs.getString("duracion"),  
					rs.getString("cantidadAsistentes"),  
					rs.getString("comentarios"));
		
		}
	}
}	


