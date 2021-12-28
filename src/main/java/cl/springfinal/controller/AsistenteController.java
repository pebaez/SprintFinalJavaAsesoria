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

import cl.springfinal.model.bean.Asistentes;
import cl.springfinal.model.bean.Capacitacion;
import cl.springfinal.model.service.AsistenteService;
import cl.springfinal.model.service.CapacitacionService;

@Controller
public class AsistenteController {
	
	
	@Autowired
	private CapacitacionService servicioCapacitacion;
	
	@Autowired
	private AsistenteService servicioAsistentes;
	
	@RequestMapping(value = "/verAsistenteCapacitacion", method = RequestMethod.GET)
    public ModelAndView verDatosCliente(@RequestParam("idCapacitacion") int idCapacitacion) {
		
		//Capacitacion capacitacion = new Capacitacion();
		
		List<Capacitacion> capacitacion = servicioCapacitacion.getOne(idCapacitacion);
		
		List<Asistentes> asistentes = servicioAsistentes.getAllAsistentesCapacitacion(idCapacitacion);
    		    	
        return new ModelAndView("crearAsistente","capacitacion",capacitacion);
        
    }

}
