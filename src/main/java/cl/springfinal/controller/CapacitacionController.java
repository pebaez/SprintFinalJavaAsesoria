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

import cl.springfinal.model.bean.Capacitacion;
import cl.springfinal.model.service.CapacitacionService;

@Controller
public class CapacitacionController {
	
		
		 /**
	     * Maneja las solicitudes que se le hacen a la raíz del sitio
	     * 
	     * @return un objeto {@link ModelAndView} con la respuesta al cliente
	     */
	
		@Autowired
		private CapacitacionService servicioCapacitacion;
		
		@RequestMapping(value = "/crearCapacitacion", method = RequestMethod.GET)
	    public ModelAndView viewFormCrearCapacitacion() {
	    		    	
	        return new ModelAndView("crearCapacitaciones");
	        
	    }
	
	    @RequestMapping(value = "/listarCapacitaciones", method = RequestMethod.GET)
	    public ModelAndView listarCapacitacion(@RequestParam(value="Accion", required=false) String Accion) {
	    	
	    	List<Capacitacion> capacitaciones = servicioCapacitacion.getAll();
	    	
	        return new ModelAndView("listarCapacitaciones", "capacitaciones", capacitaciones);
	        
	    }
	    
	    
	        
	    @RequestMapping(value="/Eliminar/{id}",method = RequestMethod.GET)    
	    public String eliminarCapacitacion(@PathVariable int id){    
	        
	    	servicioCapacitacion.delete(id);
	    	
	        return "redirect:/listarCapacitaciones";    
	    }
	    
	    
	    @RequestMapping(value="/Modificar/{id}",method = RequestMethod.GET)    
	    public ModelAndView modificarCapacitacion(@PathVariable int id){    
	        
	    //	servicioCapacitacion.delete(id);
	    	
	        //return "redirect:/ListarCapacitaciones";
	    	
	    	
	    	List<Capacitacion> capacitaciones = servicioCapacitacion.getAll();
	    	
	    	return new ModelAndView("modificarCapacitacion","capacitaciones", capacitaciones);
	    	
	    	//return "redirect:/modificarCapacitacion"; 
	    	
	       // return new ModelAndView("modificarCapacitacion", "capacitaciones", capacitaciones);
	    	
	    	
	    }
	    
	    @RequestMapping(value="/IngresarCapacitacion",method = RequestMethod.POST)    
	    public String ingresarCapacitacion(Model model, @RequestParam Map<String, Object> paramMap){
	    	
	    	
	    	Capacitacion cap = new Capacitacion();
	    	
		 	String rutCliente = paramMap.get("rutCliente").toString();
		 	
		 	String nombreEmpresa = paramMap.get("empresa").toString();
		 	
		 	String direccion = paramMap.get("direccion").toString();
		 	
		 	String hora = paramMap.get("hora").toString();
		 	
		 	String fecha = paramMap.get("fecha").toString();
		 	
		 	String duracion = paramMap.get("duracion").toString();
		 	
		 	String cantAsistentes = paramMap.get("cantAsistentes").toString();
		 	
		 	String comentCap = paramMap.get("comentCap").toString();
		 	
		 	cap.setRut(rutCliente);
		 	
		 	cap.setNombres(nombreEmpresa);
		 	
		 	cap.setDireccion(direccion);
		 	
		 	cap.setHorario(hora);
		 	
		 	cap.setDuracion(duracion);
		 	
		 	cap.setFechaCapacitacion(fecha);
		 	
		 	cap.setCantidadAsistentes(cantAsistentes);
		 	
		 	cap.setComentarios(comentCap);
		 	
	  
	    	servicioCapacitacion.create(cap);
	    	
	        return "redirect:/listarCapacitaciones";    
	    }     
	

}
