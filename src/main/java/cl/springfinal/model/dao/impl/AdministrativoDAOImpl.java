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

import cl.springfinal.model.bean.Administrativo;
import cl.springfinal.model.bean.UsuarioAdministrativo;
import cl.springfinal.model.dao.IAdministrativoDAO;


@Repository
public class AdministrativoDAOImpl implements IAdministrativoDAO {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	@Override
	public boolean createAdministrativo(Administrativo a) {
		// TODO Auto-generated method stub
		
		try
		{
			
			boolean resultado = false;

			String sql = "Insert into Administrativo (rutAdministrativo, area, experienciaprevia )";

			sql += "values (?, ?, ? );";
			
			int estado = template.update(sql, new Object[] { a.rutAdministrativo, a.getArea(), a.getExperiencia() });
		
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
	public List<Administrativo> readAllAdministrativo() {
		// TODO Auto-generated method stub
				
		

			String sql = " SELECT idadministrativo, rutAdministrativo, area, experienciaprevia "
					+ " FROM administrativo, usuarios "
					+ " WHERE administrativo.rutAdministrativo = usuarios.rutUsuario; ;";
			
			
		
			return template.query(sql, new AdministrativoRowMapper());
			
			//System.out.println(sql);
				
			
	}
	
	
	/***
	 *	Clase automapper que permite mapear la SQL con la BD. 
	 * @author Pedro Báez Araya
	 *
	 */
	
	
	class AdministrativoRowMapper implements RowMapper<Administrativo>
	{
		
		public Administrativo mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			Administrativo Administrativo = new Administrativo();
			
			Administrativo.setIdAdministrativo(rs.getString(1));
			
			Administrativo.setRutAdministrativo(rs.getString(2));
				
			Administrativo.setExperiencia(rs.getString(3));
				
			Administrativo.setArea(rs.getString(4));
			
			return Administrativo;
		
		}
	}
	

	@Override
	public Administrativo readOneAdministrativo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAdministrativo(Administrativo a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteAdministrativo(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<UsuarioAdministrativo> readOneUsuarioAdministrativo(int idAdministrativo, int idUsuario) {
		// TODO Auto-generated method stub
		String sql = " SELECT p.idAdministrativo, a.rutAdministrativo, a.area, a.experiencia , u.IdUsuario, u.rutUsuario, u.nombres, u.apellidos, u.fechaNacimiento "
				+ " FROM usuarios u, administrativo a  "
				+ " WHERE 	a.rutAdministrativo=u.rutUsuario "
				+ " AND 	a.idAdministrativo ="+ idAdministrativo 
				+ " AND 	u.idUsuario ="+ idUsuario 
				+ " AND 	u.rol='Administrativo' ; " ;
				
	
		return template.query(sql, new UsuarioAdministrativoRowMapper());
	}
	
	
	
	
	

	
	
	
	
	
	

	public Object modificarUsuarioProfesional(Administrativo administrativo) {
		// TODO Auto-generated method stub
		
		
		String sql = " UPDATE  profesional"
				+ "	   SET	   area ='" + administrativo.getArea() + "'"
				+ "			   experiencia   ='" + administrativo.getExperiencia() + "'"
				+ "    WHERE   idAdministrativo  = " + administrativo.getIdAdministrativo()    
				+ "    AND     rutAdministrativo ='" + administrativo.getRutAdministrativo() + "';";
		
		return template.query(sql, new AdministrativoRowMapper());
		
	}
	
	@Override
	public List<UsuarioAdministrativo> readAllUsuarioAdministrativo() {
		// TODO Auto-generated method stub
		String sql = " SELECT idAdministrativo ,  rutAdministrativo , experienciaprevia , area , u.IdUsuario, u.rutUsuario, u.nombres, u.apellidos,  u.fechaNacimiento, u.rol "
				+ " FROM administrativo a LEFT JOIN  usuarios u ON  a.rutAdministrativo=u.rutUsuario "
				+ " AND u.rol=\"Administrativo\" ;";
		
		
		return template.query(sql, new UsuarioAdministrativoRowMapper());
	}

	
	class UsuarioAdministrativoRowMapper implements RowMapper<UsuarioAdministrativo>
	{
		
		public UsuarioAdministrativo mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			UsuarioAdministrativo usuarioadministrativo = new UsuarioAdministrativo();
			
			usuarioadministrativo.setIdAdministrativo(rs.getString("idAdministrativo"));
			
			usuarioadministrativo.setRutAdministrativo(rs.getString("rutAdministrativo"));
				
			usuarioadministrativo.setExperiencia(rs.getString("experienciaprevia"));
				
			usuarioadministrativo.setArea(rs.getString("area"));
		
			
			usuarioadministrativo.setNombres(rs.getString("nombres"));

			usuarioadministrativo.setApellidos(rs.getString("apellidos"));

			usuarioadministrativo.setIdUsuario(rs.getInt("idUsuario"));
			
			usuarioadministrativo.setFechaNacimiento(rs.getString("fechaNacimiento"));
			
			return usuarioadministrativo;
		
		}
	}



}	


