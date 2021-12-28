package cl.springfinal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.springfinal.model.bean.Cliente;
import cl.springfinal.model.bean.UsuarioCliente;
import cl.springfinal.model.bean.Usuarios;
import cl.springfinal.model.service.ClienteService;
import cl.springfinal.model.service.UsuarioService;



@Controller
public class ClienteController {
	

		
	@Autowired
	private ClienteService servicioCliente;
	
	@Autowired
	private UsuarioService servicioUsuarios;
	
	
	 @RequestMapping(value = "/Cliente", method = RequestMethod.GET)
	    public ModelAndView viewFormCrearCapacitacion() {
	    		    	
	        return new ModelAndView("crearCliente");
	        
	    }
	
	 @RequestMapping(value = "/CrearCliente", method=RequestMethod.POST)
	  public String crearCliente(Model model, @RequestParam Map<String, Object> paramMap){
		 
		 
		 	String rut = paramMap.get("rut").toString();
		 	String nombres = paramMap.get("nombres").toString();
		 	String apellidos = paramMap.get("apellidos").toString();
		 	String edad = paramMap.get("edad").toString();
		 	String direccion = paramMap.get("direccion").toString();
		 	String comuna = paramMap.get("comuna").toString();
		 	String afp = paramMap.get("afp").toString();
		 	String sistemaSalud = paramMap.get("sistemaSalud").toString();
		 	String telefono = paramMap.get("telefono").toString();
		 	String fechaNacimiento = paramMap.get("fechaNacimiento").toString();
		 
		 	Cliente cliente = new Cliente();
		 			 			 	
			 	cliente.setRutCliente(rut);
			 	
			 	cliente.setEdad(edad);
			 	
			 	cliente.setAfp(afp);
			 	
			 	cliente.setComuna(comuna);
			 	
			 	cliente.setSistemaSalud(sistemaSalud);
			 	
			 	cliente.setTelefono(telefono);
			 	
			 	cliente.setDireccion(direccion);
		 	
		 	servicioCliente.createCliente(cliente);
		 	
		 	Usuarios usuario = new Usuarios();
		 	
		 		usuario.setRutUsuario(rut);
		 	
		 		usuario.setNombres(nombres);
		 	
		 		usuario.setApellidos(apellidos);
		 		
		 		usuario.setRol("Cliente");
		 		
		 		usuario.setFechaNacimiento(fechaNacimiento);
		 		
		 		usuario.setUsuario(rut);
		 		
		 		usuario.setPassword("$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu");
		 		
		 	
			servicioUsuarios.createUsuarios(usuario);	
		 	
		 	
		 	return "redirect:/listarClientes"; 
     
	 }
	 
	 
	 
	 
	 
	 
	 @RequestMapping(value = "/listarClientes", method = RequestMethod.GET)
	    public ModelAndView listarClientes() {
	    	
		 List<UsuarioCliente> usuariocliente = servicioCliente.read();
		 		    	
	     return new ModelAndView("listarClientes","usuariocliente", usuariocliente);
	        
	      	        
	    }
	 
	 
//	 	@RequestMapping(value = "/verDatosCliente/{idCliente}/{idUsuario}", method = RequestMethod.GET)
//	    public ModelAndView verDatosCliente(@PathVariable int idCliente, @PathVariable int idUsuario) {
//	    	
//			 List<UsuarioCliente> usuariocliente = servicioCliente.readOneClienteUsuario(idCliente, idUsuario);
//			 			 
//			 ModelAndView modelAndView = new ModelAndView();
//			 
//			 modelAndView.addObject("usuariocliente", usuariocliente);
//			 
//			 modelAndView.setViewName("modCliente");
//			 
//			return modelAndView;
//	      	        
//	    }
//	 	
	 	
	 	@RequestMapping(value = "/verDatosCliente", method = RequestMethod.GET)
	    public ModelAndView verDatosCliente(@RequestParam("idCliente") int idCliente, @RequestParam("idUsuario") int idUsuario ) {
	    	
			 List<UsuarioCliente> usuariocliente = servicioCliente.readOneClienteUsuario(idCliente, idUsuario);
			 			 
			 ModelAndView modelAndView = new ModelAndView();
			 
			 modelAndView.addObject("usuariocliente", usuariocliente);
			 
			 modelAndView.setViewName("modCliente");
			 
			 return modelAndView;
	      	        
	    }
	 	
	 	 @RequestMapping(value = "/modificarDatosCliente", method=RequestMethod.POST)
		  public String modCliente(Model model, @RequestParam Map<String, Object> paramMap){
			 
			 
	 		 	String idCliente = paramMap.get("idCliente").toString();
	 			String idUsuario = paramMap.get("idUsuario").toString();
			 	String rut = paramMap.get("rut").toString();
			 	String nombres = paramMap.get("nombres").toString();
			 	String apellidos = paramMap.get("apellidos").toString();
			 	String edad = paramMap.get("edad").toString();
			 	String direccion = paramMap.get("direccion").toString();
			 	String comuna = paramMap.get("comuna").toString();
			 	String afp = paramMap.get("afp").toString();
			 	String sistemaSalud = paramMap.get("sistemaSalud").toString();
			 	String telefono = paramMap.get("telefono").toString();
			 	String fechaNacimiento = paramMap.get("fechaNacimiento").toString();
			 
			 	Cliente cliente = new Cliente();
			 	
			 		cliente.setIdCliente(Integer.valueOf(idCliente) );
			 			 			 	
				 	cliente.setRutCliente(rut);
				 	
				 	cliente.setEdad(edad);
				 	
				 	cliente.setAfp(afp);
				 	
				 	cliente.setComuna(comuna);
				 	
				 	cliente.setSistemaSalud(sistemaSalud);
				 	
				 	cliente.setTelefono(telefono);
				 	
				 	cliente.setDireccion(direccion);
				 	
				 	
			 	
			 	servicioCliente.modificarCliente(cliente);
			 	
			 	Usuarios usuario = new Usuarios();
			 	
			 		usuario.setIdUsuario(Integer.valueOf(idUsuario));
			 	
			 		usuario.setRutUsuario(rut);
			 	
			 		usuario.setNombres(nombres);
			 	
			 		usuario.setApellidos(apellidos);
			 		
			 		usuario.setRol("Cliente");
			 		
			 		usuario.setFechaNacimiento(fechaNacimiento);
			 		
			 	
			 	servicioUsuarios.modificarUsuario(usuario);	
			 	
			 	
			 	return "redirect:/listarClientes"; 
	     
		 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  @RequestMapping(value="/EliminarCliente/{idCliente}/{idUsuario}",method = RequestMethod.GET)    
	    public String eliminarClienteUsuario(@PathVariable int idCliente, @PathVariable int idUsuario){    
	        
	    	servicioCliente.eliminarCliente(idCliente ,  idUsuario);
	    	
	    	servicioUsuarios.eliminarUsuarios(idCliente, idUsuario);
	    	
	        return "redirect:/listarClientes";    
	    }
	


}
