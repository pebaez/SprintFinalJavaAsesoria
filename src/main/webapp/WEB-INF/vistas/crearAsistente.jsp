<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Profesionales</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<header>

			<%@ include file='menu.jsp'%>

		</header>

		<div class=" text-center mt-5 ">
			<h3>Ingreso de Asistentes</h3>
		</div>

		<div class="row ">
			<div class="col-sm-12 mx-auto">
				<div class="card bg-light">
				<div class="card-header">
						<a href="crearCapacitacion"
							class="btn btn-primary btn-sm text-center" role="button">+
							Ingresar Nueva Capacitacion</a>
							
							
						<a href="listarCapacitaciones"
							class="btn btn-success btn-sm text-center" role="button">+
							Listado de Capacitaciones</a>
								
					</div>
					<div class="card-body bg-light">
						
							<form action="crearProfesional" method="post">
								
								
								
								
								
								<c:forEach var="c" items="${capacitacion}">
									
									<div class="row col-md-12">
										
										<div class="form-group col-md-3">
											<label for="codigoCap">Codigo Capacitacion</label> <input type="text"
												name="codigoCap" class="form-control" id="codigoCap" required placeholder="000000001" maxlength="12" maxlength="11" readonly value="${c.getId()}">
										</div>
										
										<div class="form-group col-md-4">
											<label for="nombreEmpresa">Empresa</label> 
											<input type="text" name="nombreEmpresa" class="form-control" id="nombreEmpresa" required placeholder="Empresa Nombre" readonly value="${c.getNombres()}">
										</div>
									</div>
										
									<div class="row col-md-12">
										
										<div class="form-group col-md-10"><label> Informacion Capacitacion</label> 
											<textarea rows="3" cols="225" name="comentarios" class="form-control" id="comentarios" required 
											 readonly> Informacion de Capacitacion "${c.getComentarios()}"	Cantidad de Asistentes "${c.getCantidadAsistentes()}" Hora = "${c.getHorario()}"	Duracion= "${c.getDuracion()}"	
											</textarea>
										</div>
									</div>	
								
								</c:forEach>
								
									<div class="form-row">
									
									<div class="form-group col-md-2">
										<label for="rut">Rut Asistente</label> <input type="text"
											name="rut" class="form-control" id="rut" required placeholder="11.111.111-1" maxlength="12" maxlength="11">
									</div>
									<div class="form-group col-md-4">
										<label for="inputPassword4">Nombres Asistente</label> <input
											type="text" name="nombres" class="form-control" id="nombres" required>
									</div>
									<div class="form-group col-md-4">
										<label for="inputPassword4">Apellidos Asistente</label> <input
											type="text" name="apellidos" class="form-control"
											id="apellidos" required>
									</div>
									
									<div class="form-group col-md-2">
										<label for="inputPassword4">.</br></label>
										<button type="submit" class="btn btn-danger">+ Asistente</button>
									</div>
		
									
								</div>
								
								</div>	
								
							
								
							</form>	

						</div>
						
						
						<!-- Div donde se posiciona la tabla -->
						
						<div>
						
						
						
						</div>

						
						
						


				
				</div>
			</div>
		</div>
		<!-- /.8 -->
	




	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
		crossorigin="anonymous"></script>
</body>
</html>