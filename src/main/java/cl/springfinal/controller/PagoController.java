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

import cl.springfinal.model.bean.Capacitacion;
import cl.springfinal.model.service.CapacitacionService;

@Controller
public class PagoController {
	
	
	@Autowired
	private CapacitacionService servicioCapacitacion;
	
	@RequestMapping(value = "/verPago", method = RequestMethod.GET)
    public ModelAndView verDatosCliente(@RequestParam("idCapacitacion") int idCapacitacion) {
		
		//Capacitacion capacitacion = new Capacitacion();
		
		List<Capacitacion> capacitacion = servicioCapacitacion.getOne(idCapacitacion);
    		    	
        return new ModelAndView("crearPago","capacitacion",capacitacion);
        
    }

}
