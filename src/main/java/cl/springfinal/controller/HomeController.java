package cl.springfinal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {

	

	
	
    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     * 
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView mostrarLogin() {
        return new ModelAndView("login");
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
    	
    	return new ModelAndView("login");
    			
    }
    
    
    @RequestMapping(path = "/inicio", method = RequestMethod.GET)
    public ModelAndView mostrarInicio() {
        return new ModelAndView("inicio");
    }
    
        
    
    @RequestMapping(value = "/error")
    public ModelAndView errorLogin() {
    	
    	return new ModelAndView("login","error","true");
    			
    }
    
    
    @RequestMapping(value = "/logout")
    public ModelAndView logout() {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	
    	if (auth!=null) {
    		
    	
    		SecurityContextHolder.getContext().setAuthentication(null);
    			
    	}
    	
    	return new ModelAndView("redirect:/login?logout");
    			
    }
    
    
  
    
    @RequestMapping(value="/403", method={RequestMethod.GET,RequestMethod.POST})
    public String error403() {
      return "errors/403";
    }
    
}
