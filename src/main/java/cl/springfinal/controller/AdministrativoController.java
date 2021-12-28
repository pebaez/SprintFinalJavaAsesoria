package cl.springfinal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.springfinal.model.bean.Administrativo;
import cl.springfinal.model.bean.UsuarioAdministrativo;
import cl.springfinal.model.bean.Usuarios;
import cl.springfinal.model.service.AdministrativoService;
import cl.springfinal.model.service.UsuarioService;


@Controller
public class AdministrativoController {
	
	
	@Autowired
	private AdministrativoService servicioAdministrativo;
	
	@Autowired
	private UsuarioService servicioUsuarios;
	
	
	 @RequestMapping(value = "/Administrativo", method = RequestMethod.GET)
	    public ModelAndView viewFormAdministrativo() {
	    		    	
	        return new ModelAndView("crearAdministrativo");
	        
	    }
	 
	 
	 
	 
	 @RequestMapping(value = "/crearAdministrativo", method=RequestMethod.POST)
	  public String crearAdministrativo(Model model, @RequestParam Map<String, Object> paramMap){
		 
		 
		 	String rut = paramMap.get("rut").toString();
		 	String nombres = paramMap.get("nombres").toString();
		 	String apellidos = paramMap.get("apellidos").toString();
		 	String fechaNacimiento = paramMap.get("fechaNacimiento").toString();
		 	
		 	String area = paramMap.get("area").toString();
		 	
		 	String experiencia = paramMap.get("experiencia").toString();
		 	
		 
		 	Administrativo administrativo = new Administrativo();
		 			 			 	
			 	administrativo.setRutAdministrativo(rut);
				 		
			 	administrativo.setArea(area);
				 	
			 	administrativo.setExperiencia(experiencia);
			
		 	servicioAdministrativo.createAdministrativo(administrativo);
		 	
		 	Usuarios usuario = new Usuarios();
		 	
		 		usuario.setRutUsuario(rut);
		 	
		 		usuario.setNombres(nombres);
		 	
		 		usuario.setApellidos(apellidos);
		 		
		 		usuario.setRol("Administrativo");
		 		
		 		usuario.setFechaNacimiento(fechaNacimiento);
		 		
		 		usuario.setUsuario(rut);
		 		
		 		usuario.setPassword("$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu");
		 		
		 		
		 	
		 	servicioUsuarios.createUsuarios(usuario);	
		 	
		 	
		 	return "redirect:/listarAdministrativo"; 
    
	 }
	 
	 @RequestMapping(value = "/listarAdministrativo", method = RequestMethod.GET)
	    public ModelAndView listadoAdministrativo() {
	    	
		 List<UsuarioAdministrativo> usuarioAdministrativo = servicioAdministrativo.getAllUsuarioAdministrador();
	    		    	
	     return new ModelAndView("listarAdministrativo","usuarioadministrativo", usuarioAdministrativo);
	        
	      	        
	    }
	 
	 
	 
	 

}
