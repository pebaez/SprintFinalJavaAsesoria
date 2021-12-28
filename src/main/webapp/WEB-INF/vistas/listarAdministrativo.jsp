<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
  <meta charset="UTF-8">
  <title>Crear Capacitación</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>


<div class="container">

		<header>

			<%@ include file='menu.jsp'%>

		</header>

		<div class=" text-center mt-5 ">
			<h3>Listado de Administrativos</h3>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="card bg-light">

					<div class="card-header">
						<a href="Administrativo" class="btn btn-primary btn-sm text-center"
							role="button">+ Ingresar Nuevo Administrativo</a>
					</div>

					<div class="card-body bg-light">
									<table
							class="table table-striped table-hover table-condensed table-bordered">
		  <thead class="thead-dark">
		    <tr>
		      <th scope="col">N#</th>
		      <th scope="col">Rut</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Apellidos</th>
		      <th scope="col">Area</th>
		      <th scope="col">Experiencia</th>
		      
		      
		    </tr>
		  </thead>
		  <tbody>
		   
			<t:forEach var="t" items="${listadoadministrativo}">
			
			<tr>
				
				
				<td><t:out value="${t.getArea}"></t:out></td>
				<td><t:out value="${t.getExperiencia}"></t:out></td>
				
				
				
				
				<td>
					<div class="input-group-append">
					

						
					</div>
				</td>
				<td>
					<div class="input-group-append">
						<a href="EliminarAdministrativo/${t.getIdAdministrativo()}" class="btn btn-danger btn-sm" role="button">Eliminar</a>
					</div>
				</td>
			
			</tr>
			
			
			</t:forEach>		   
		    
		  </tbody>
		</table>
	</div>
	
		</div>
							</div>
							
						</div>


					</div>
		




<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>