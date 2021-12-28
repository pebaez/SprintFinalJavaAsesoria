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

import cl.springfinal.model.bean.Cliente;
import cl.springfinal.model.bean.UsuarioCliente;
import cl.springfinal.model.dao.IClienteDAO;

@Repository
public class ClienteDAOImpl implements IClienteDAO {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean createCliente(Cliente c) {
		// TODO Auto-generated method stub

		try {

			boolean resultado = false;

			String sql = "Insert into cliente (rutCliente, telefono, afp, sistemaSalud, direccion, comuna, edad )";

			sql += "values (?, ?, ?, ?, ?, ?, ? );";

			int estado = template.update(sql, new Object[] { c.getRutCliente(), c.getTelefono(), c.getAfp(),
					c.getSistemaSalud(), c.getDireccion(), c.getComuna(), c.getEdad() });

			if (estado > 0) {

				resultado = true;

			} else {

				resultado = false;

			}

			return resultado;
			
		} catch (InvalidResultSetAccessException e) {
			throw new RuntimeException(e);

		} catch (DataAccessException e) {
			throw new RuntimeException(e);

		}

	}

	@Override
	public List<UsuarioCliente> readAll() {
		// TODO Auto-generated method stub

		String sql = " SELECT c.idCliente, u.idUsuario, c.rutCliente, u.rutUsuario, c.afp, c.telefono, c.sistemaSalud, c.direccion, "
				+ "           c.comuna, c.edad, u.nombres, u.apellidos, u.IdUsuario, c.edad, u.fechaNacimiento , u.rol " 
				+ "FROM cliente c LEFT JOIN  usuarios u ON  c.rutCliente=u.rutUsuario "
				+ "AND u.rol=\"Cliente\" ;";
		
		System.out.println(sql);
	

		return template.query(sql, new ClienteRowMapper());



	}

	@Override
	public Cliente readOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Cliente c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	/***
	 * Clase automapper que permite mapear la SQL con la BD.
	 * 
	 * @author Pedro Báez Araya
	 *
	 */

	class ClienteRowMapper implements RowMapper<UsuarioCliente> {

		public UsuarioCliente mapRow(ResultSet rs, int rowNum) throws SQLException {

			UsuarioCliente uC = new UsuarioCliente();

			uC.setIdCliente(rs.getString("idCliente"));

			uC.setRutCliente(rs.getString("RutCliente"));

			uC.setAfp(rs.getString("afp"));

			uC.setTelefono(rs.getString("telefono"));

			uC.setSistemaSalud(rs.getString("sistemaSalud"));

			uC.setDireccion(rs.getString("direccion"));

			uC.setComuna(rs.getString("comuna"));

			uC.setNombres(rs.getString("nombres"));

			uC.setApellidos(rs.getString("apellidos"));

			uC.setIdUsuario(rs.getInt("idUsuario"));
			
			uC.setFechaNacimiento(rs.getString("fechaNacimiento"));
			
			uC.setEdad(rs.getString("edad"));

			return uC;

		}
	}

	public Object deleteCliente(int idCliente, int idUsuario) {
		// TODO Auto-generated method stub

		String sql1 = "DELETE FROM cliente where idCliente=" + idCliente + " ;";

		template.update(sql1);

		String sql2 = "DELETE FROM usuarios where idUsuario=" + idUsuario + ";";

		template.update(sql2);

		return template.update(sql1);

	}

	@Override
	public List<UsuarioCliente> readOneUsuarioCliente(int idCliente, int idUsuario) {
		// TODO Auto-generated method stub
		String sql = " SELECT c.idCliente, u.idUsuario, c.rutCliente, u.rutUsuario, c.afp, c.telefono, c.sistemaSalud, c.direccion, "
				+ "           c.comuna, c.edad, u.nombres, u.apellidos, u.IdUsuario,  u.fechaNacimiento " 
				+ " FROM usuarios u, cliente c " + " WHERE c.rutCliente=u.rutUsuario " + " AND c.IdCliente= "
				+ idCliente + " AND u.IdUsuario= " + idUsuario + ";";

		return template.query(sql, new ClienteRowMapper());
	}

	public int modificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
		String sql = " UPDATE cliente"
				+ "	   SET	  afp ='" + cliente.getAfp() + "'"
				+ "			 , telefono ='" + cliente.getTelefono() + "'"
				+ "			 , sistemaSalud ='" + cliente.getSistemaSalud() + "'"
				+ "			 , direccion ='" + cliente.getDireccion() + "'"
				+ "          , comuna = '" + cliente.getComuna() + "'"
				+ "			 , edad  = '" + cliente.getEdad() + "' "
				+ "   WHERE   IdCliente= " + cliente.getIdCliente()  
				+ "   AND     rutCliente='" + cliente.getRutCliente() + "';";
		
		System.out.println(sql);
		
		return template.update(sql);
	}

}
