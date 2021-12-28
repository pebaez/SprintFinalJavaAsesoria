package cl.springfinal.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cl.springfinal.model.bean.Profesional;
import cl.springfinal.model.bean.UsuarioProfesional;
import cl.springfinal.model.dao.IProfesionalDAO;

@Repository
public class ProfesionalDAOImpl implements IProfesionalDAO {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean createProfesional(Profesional p) {
		// TODO Auto-generated method stub
		
		try
		{
			
			boolean resultado = false;

			String sql = "Insert into profesional (rutProfesional, titulo, fechaIngreso)";

			sql += "values (?, ?, ? );";
			
			int estado = template.update(sql, new Object[] {p.getRutProfesional(), p.getTitulo(), p.getFechaIngreso()});
		
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
	public List<Profesional> readAllProfesional() {
		// TODO Auto-generated method stub
				
		

			String sql = " SELECT * "
					+ " FROM  profesional p "
					+ " ;";
			
			
		
			return template.query(sql, new ProfesionalRowMapper());
			
			//System.out.println(sql);
				
			
	}
	
	@Override
	public Profesional readOneProfesional(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProfesional(Profesional p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteProfesional(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	/***
	 *	Clase automapper que permite mapear la SQL con la BD. 
	 * @author Pedro Báez Araya
	 *
	 */
	
	
	class ProfesionalRowMapper implements RowMapper<Profesional>
	{
		
		public Profesional mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			Profesional profesional = new Profesional();
			
			profesional.setIdProfesional(rs.getString(1));
			
			profesional.setRutProfesional(rs.getString(2));
			
			profesional.setTitulo(rs.getString(3));
			
			profesional.setFechaIngreso(rs.getString(4));
			
			
			return profesional;
			
		
		
		}
	}
	
	
	




	@Override
	public List<UsuarioProfesional> readAllUsuarioProfesional() {
		// TODO Auto-generated method stub
		
		String sql = " SELECT p.idProfesional, p.rutProfesional, p.titulo, p.fechaIngreso , u.IdUsuario, u.rutUsuario, u.nombres, u.apellidos,  u.fechaNacimiento, u.rol "
					+ "FROM profesional p LEFT JOIN  usuarios u ON  p.rutProfesional=u.rutUsuario "
					+ "AND u.rol=\"Profesional\" ;";
		
		
		return template.query(sql, new UsuarioProfesionalRowMapper());
		
	}
	
	class UsuarioProfesionalRowMapper implements RowMapper<UsuarioProfesional>
	{
		
		public UsuarioProfesional mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			UsuarioProfesional up = new UsuarioProfesional();
			
			up.setIdProfesional(rs.getString("idProfesional"));
			
			up.setRutProfesional(rs.getString("rutProfesional"));
			
			up.setTitulo(rs.getString("titulo"));
			
			up.setFechaIngreso(rs.getString("fechaIngreso"));

			up.setNombres(rs.getString("nombres"));

			up.setApellidos(rs.getString("apellidos"));

			up.setIdUsuario(rs.getInt("idUsuario"));
			
			up.setFechaNacimiento(rs.getString("fechaNacimiento"));
			
			return up;
			
		
		
		}
	}







	public List<UsuarioProfesional> readAllProfesionalUsuario(int idProfesional, int idUsuario) {
		// TODO Auto-generated method stub
		String sql = " SELECT p.idProfesional, p.rutProfesional, p.titulo, p.fechaIngreso , u.IdUsuario, u.rutUsuario, u.nombres, u.apellidos, u.fechaNacimiento "
				+ " FROM usuarios u, profesional p  "
				+ " WHERE p.rutProfesional=u.rutUsuario "
				+ " AND p.idProfesional ="+ idProfesional 
				+ " AND u.idUsuario ="+ idUsuario 
				+ " AND u.rol='Profesional' ; " ;
				
	
		return template.query(sql, new UsuarioProfesionalRowMapper());
		
	}

	public Object modificarUsuarioProfesional(Profesional profesional) {
		// TODO Auto-generated method stub
		
		
		String sql = " UPDATE profesional"
				+ "	   SET	  titulo ='" + profesional.getTitulo() + "'"
				+ "			 , fechaIngreso   ='" + profesional.getFechaIngreso() + "'"
				+ "    WHERE   idProfesional  = " + profesional.getIdProfesional()    
				+ "    AND     rutProfesional ='" + profesional.getRutProfesional() + "';";
		
		return template.query(sql, new UsuarioProfesionalRowMapper());
		
	}



}	