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

import cl.springfinal.model.bean.Usuarios;
import cl.springfinal.model.dao.IUsuarioDAO;


@Repository
public class UsuarioDAOImpl implements IUsuarioDAO{
	
	
	
	
	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean createUsuarios(Usuarios u) {
		// TODO Auto-generated method stub
		try
		{
			
			boolean resultado = false;

			String sql = "Insert into usuarios (rutUsuario, nombres, apellidos, fechaNacimiento, usuario, password, rol )";

			sql += "values (?, ?, ?, ?, ?, ? , ?);";
			
			int estado = template.update(sql, new Object[] {u.getRutUsuario(), u.getNombres(), u.getApellidos(), u.getFechaNacimiento(), u.getUsuario(), u.getPassword(), u.getRol() });
		
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

	
	
	class UsuarioRowMapper implements RowMapper<Usuarios>
	{
		
		public Usuarios mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
			Usuarios usuarios = new Usuarios();
			
			
			String sql = " SELECT c.rutCliente, u.rutUsuario, c.afp, c.telefono, c.sistemaSalud, c.direccion, c.comuna, c.edad, u.nombres, u.apellidos "
					+ " FROM usuarios u, cliente c "
					+ " WHERE c.rutCliente=u.rutUsuario ;";
			
			
				usuarios.setRutUsuario(rs.getString(1));
				
				usuarios.setNombres(rs.getString(2));
				
				usuarios.setApellidos(rs.getString(3));
				
				usuarios.setFechaNacimiento(rs.getString(4));
				
				usuarios.setRol(rs.getString(5));
				
				usuarios.setUsuario(rs.getString(6));
				
			
			return usuarios;
			
		
		
		}
	}



	@Override
	public List<Usuarios> readAllUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios readOneUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUsuario(Usuarios u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteUsuario(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object modificarUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub
		String sql = " UPDATE usuarios"
				+ "	   SET	  nombres ='" + usuario.getNombres() + "'"
				+ "			 , apellidos ='" + usuario.getApellidos() + "'"
				+ "			 , fechaNacimiento ='" + usuario.getFechaNacimiento() + "'"
				+ "    WHERE   idUsuario= " + usuario.getIdUsuario()    
				+ "    AND     rutUsuario='" + usuario.getRutUsuario() + "';";
		
		System.out.println(sql);
		
		return template.update(sql);
	}

}
