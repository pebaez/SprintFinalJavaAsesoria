package cl.springfinal.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lowagie.text.DocumentException;

import cl.springfinal.funciones.ExportExcel;
import cl.springfinal.funciones.ExportPDF;
import cl.springfinal.model.bean.UsuarioCliente;
import cl.springfinal.model.service.ClienteService;


@Controller
public class ExportData {
	
		@Autowired
		private ClienteService servicioClientes;
	
		  @RequestMapping(value = "excelClientes", method=RequestMethod.GET)
		  public void exportToExcel(HttpServletResponse response) throws IOException 
		  {
				response.setContentType("application/octet-stream");
				DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
				String currentDateTime = dateFormatter.format(new Date());
				 
				String headerKey = "Content-Disposition";
				String headerValue = "attachment; filename=listadoClientes_" + currentDateTime + ".xlsx";
				response.setHeader(headerKey, headerValue);
				 
				List<UsuarioCliente> listUsers = servicioClientes.getAll();
				 
				ExportExcel excelExporter = new ExportExcel(listUsers);
				 
				excelExporter.export(response);    
		}  
	        
	        
		  @RequestMapping(value = "pdfClientes", method=RequestMethod.GET)
		  public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
		        response.setContentType("application/pdf");
		        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		        String currentDateTime = dateFormatter.format(new Date());
		         
		        String headerKey = "Content-Disposition";
		        String headerValue = "attachment; filename=listadoClientes" + currentDateTime + ".pdf";
		        response.setHeader(headerKey, headerValue);
		         
		        List<UsuarioCliente> listUsers = servicioClientes.getAll();
		         
		        ExportPDF exporter = new ExportPDF(listUsers);
		        exporter.export(response);
		         
		    }
	
	

}
