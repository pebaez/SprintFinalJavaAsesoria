<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	
<html>
<head>
<meta charset="UTF-8">
<title>Clientes</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
</head>
<body>

<c:forEach var="c" items="${usuariocliente}">			

	<div class="container">

		<header>

			<%@ include file='menu.jsp'%>

		</header>

		<div class=" text-center mt-5 ">
			<h1>Modificacion de Clientes</h1>
		</div>

		<div class="row ">
			<div class="col-lg-12 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">

							<form action="modificarDatosCliente" method="POST">
							
								<input type="hidden"
											name="idCliente" class="form-control" id="idCliente" value="${c.getIdCliente()}">
								<input type="hidden"
											name="idUsuario" class="form-control" id="idUsuario" value="${c.getIdUsuario()}">
							
								
								<div class="form-row">
									<div class="form-group col-md-3">
										<label for="rut">Rut Cliente</label> <input type="text"
											name="rut" class="form-control" id="rut" value="${c.getRutCliente()}" readonly>
									</div>
									<div class="form-group col-md-3">
										<label for="inputPassword4">Nombres Cliente</label> <input
											type="text" name="nombres" class="form-control" id="nombres" value="${c.getNombres()}">
									</div>
									<div class="form-group col-md-3">
										<label for="inputPassword4">Apellidos Cliente</label> <input
											type="text" name="apellidos" class="form-control"
											id="apellidos" value="${c.getApellidos()}">
									</div>

									<div class="form-group col-md-3">
										<label for="fechaNacimiento">Fecha de Nacimiento</label> <input
											type="date" name="fechaNacimiento" class="form-control"
											id="fechaNacimiento" value="${c.getFechaNacimiento()}">
									</div>
								</div>


								<div class="form-row">

									<div class="form-group col-md-4">

										<label for="inputAddress">Dirección</label> <input type="text"
											name="direccion" class="form-control" id="inputAddress" value="${c.getDireccion()}">

									</div>

									<div class="form-group col-md-4">

										<label for="inputAddress">Comuna</label> <input type="text"
											name="comuna" class="form-control" id="inputAddress" value="${c.getComuna()}">

									</div>

									<div class="form-group col-md-4">


										<label for="telefono">Teléfono</label> <input type="tel"
											id="telefono" name="telefono" pattern="[0-9]{9}"
											class="form-control" value="${c.getTelefono()}">

									</div>

								</div>

								<div class="form-row">

									<div class="form-group col-md-4">

										<label for="afp">A.F.P</label> <select name="afp" id="afp"
											required class="form-control" value="${c.getAfp()}">
											<option value="AFP Capital">AFP Capital</option>
											<option value="AFP Cuprum">AFP Cuprum</option>
											<option value="AFP Habitat">AFP Habitat</option>
											<option value="AFP Modelo">AFP Modelo</option>

											<option value="AFP Planvital">AFP Planvital</option>

											<option value="AFP Provida">AFP Provida</option>

											<option value="AFP Uno">AFP Uno</option>
										</select>



									</div>

									<div class="form-group col-md-4">

										<label for="sistemaSalud">Sistema de Salud</label> <select
											name="sistemaSalud" id="sistemaSalud" required
											class="form-control" value="${c.getSistemaSalud()}">
											<option value="1.- Fonasa">1.- Fonasa</option>
											<option value="2.- Isapre">2.- Isapre</option>

										</select>

									</div>

								</div>


								<div class="form-row">

									<div class="form-group col-md-4">

										<label for="edad">Edad</label> <input type="number"
											name="edad" class="form-control" id="edad" min="0" max="120" value="${c.getEdad()}">

									</div>



								</div>




								<div class="form-group">
									<div class="form-check">
										<input class="form-check-input" type="checkbox" id="gridCheck">
										<label class="form-check-label" for="gridCheck">
											Acepto términos y condiciones </label>
									</div>
								</div>
								<button type="submit" class="btn btn-primary">Modificar Datos del 
									Cliente</button>

							</form>
						</div>
					</div>
				</div>
				<!-- /.8 -->
			</div>
			<!-- /.row-->
		</div>
	</div>

</c:forEach>
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