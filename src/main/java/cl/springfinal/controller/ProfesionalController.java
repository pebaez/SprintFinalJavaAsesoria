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

import cl.springfinal.model.bean.Profesional;

import cl.springfinal.model.bean.UsuarioProfesional;
import cl.springfinal.model.bean.Usuarios;
import cl.springfinal.model.service.ProfesionalService;
import cl.springfinal.model.service.UsuarioService;


@Controller
public class ProfesionalController {
	
	@Autowired
	private ProfesionalService servicioProfesional;
	
	@Autowired
	private UsuarioService servicioUsuarios;
	
	 @RequestMapping(value = "/Profesional", method = RequestMethod.GET)
	    public ModelAndView viewFormAdministrativo() {
	    		    	
	        return new ModelAndView("crearProfesional");
	        
	    }
	 
	 @RequestMapping(value = "/crearProfesional", method=RequestMethod.POST)
	  public String crearProfesional(Model model, @RequestParam Map<String, Object> paramMap){
		 
		 
		 	String rut = paramMap.get("rut").toString();
		 	String nombres = paramMap.get("nombres").toString();
		 	String apellidos = paramMap.get("apellidos").toString();
		 	String fechaNacimiento = paramMap.get("fechaNacimiento").toString();
		 	
		 	String titulo = paramMap.get("titulo").toString();
		 	String fechaIngreso = paramMap.get("fechaIngreso").toString();
		 	
		 
		 	Profesional profesional = new Profesional();
		 			 			 	
			 	profesional.setRutProfesional(rut);
				 	
			 	profesional.setTitulo(titulo);
			 					 	
			 	profesional.setFechaIngreso(fechaIngreso);
			 		
		 	
		 	servicioProfesional.createProfesional(profesional);
		 	
		 	Usuarios usuario = new Usuarios();
		 	
		 		usuario.setRutUsuario(rut);
		 	
		 		usuario.setNombres(nombres);
		 	
		 		usuario.setApellidos(apellidos);
		 		
		 		usuario.setRol("Profesional");
		 		
		 		usuario.setFechaNacimiento(fechaNacimiento);
		 		
		 		usuario.setUsuario(rut);
		 		
		 		usuario.setPassword("$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu");
		 		
		 		
		 	
		 	servicioUsuarios.createUsuarios(usuario);	
		 	
		 	
		 	return "redirect:/listarProfesional"; 
    
	 }
	 
	 
	 @RequestMapping(value = "/listarProfesional", method = RequestMethod.GET)
	    public ModelAndView listarCapacitacion() {
	    	
		 List<UsuarioProfesional> usuarioProfesional = servicioProfesional.getAllUsuarioProfesional();
	    		    	
	     return new ModelAndView("listarProfesional","profesional", usuarioProfesional);
	        
	      	        
	    }
	 
		@RequestMapping(value = "/verDatosProfesional", method = RequestMethod.GET)
	    public ModelAndView verDatosCliente(@RequestParam("idProfesional") int idProfesional, @RequestParam("idUsuario") int idUsuario ) {
	    	
			 List<UsuarioProfesional> usuarioprofesional = servicioProfesional.readOneProfesionalUsuario(idProfesional, idUsuario);
			 			 
			 ModelAndView modelAndView = new ModelAndView();
			 
			 modelAndView.addObject("usuarioprofesional", usuarioprofesional);
			 
			 modelAndView.setViewName("modProfesional");
			 
			 return modelAndView;
	      	        
	    }
		
		
		@RequestMapping(value = "/modificarProfesional", method=RequestMethod.POST)
		  public String modProfesional(Model model, @RequestParam Map<String, Object> paramMap){
			 
			 
			 	String rut = paramMap.get("rut").toString();
			 	String nombres = paramMap.get("nombres").toString();
			 	String apellidos = paramMap.get("apellidos").toString();
			 	String fechaNacimiento = paramMap.get("fechaNacimiento").toString();
			 	
			 	String titulo = paramMap.get("titulo").toString();
			 	String fechaIngreso = paramMap.get("fechaIngreso").toString();
			 	
			 
			 	Profesional profesional = new Profesional();
			 			 			 	
				 	profesional.setRutProfesional(rut);
					 	
				 	profesional.setTitulo(titulo);
				 					 	
				 	profesional.setFechaIngreso(fechaIngreso);
				 		
			 	
			 	servicioProfesional.modificarUsuarioProfesional(profesional);
			 	
			 	Usuarios usuario = new Usuarios();
			 	
			 		usuario.setRutUsuario(rut);
			 	
			 		usuario.setNombres(nombres);
			 	
			 		usuario.setApellidos(apellidos);
			 		
			 		usuario.setRol("Profesional");
			 		
			 		usuario.setFechaNacimiento(fechaNacimiento);
			 		
			 		usuario.setUsuario(rut);
			 		
			 		usuario.setPassword("$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu");
			 		
			 		
			 	
			 	servicioUsuarios.modificarUsuario(usuario);	
			 	
			 	
			 	return "redirect:/listarProfesional"; 
	    
		 }
		
		 @RequestMapping(value="/EliminarProfesional/{idProfesional}",method = RequestMethod.GET)    
		    public String eliminarClienteUsuario(@PathVariable int idProfesional, @PathVariable int idUsuario){    
		        
		    	servicioProfesional.eliminarProfesional(idProfesional ,  idUsuario);
		    	
		    	servicioUsuarios.eliminarUsuarios(idProfesional, idUsuario);
		    	
		        return "redirect:/listarClientes";    
		    }
	

}
