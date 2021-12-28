<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Crear Capacitación</title>
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
			<h3>Listado de Capacitaciones</h3>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="card bg-light">

					<div class="card-header">
						
						<a href="crearCapacitacion"
							class="btn btn-primary btn-sm text-center" role="button">+
							Ingresar Nueva Capacitacion</a>
							
							
					</div>

					<div class="card-body bg-light">
						<table
							class="table table-striped table-hover table-bordered table-responsive">
							<thead class="bg-primary">
								<tr>
									<th scope="col">N#</th>
									<th scope="col">Rut</th>
									<th scope="col">Empresa</th>
									<th scope="col">Direccion</th>
									<th scope="col">Fecha</th>
									<th scope="col">Horario</th>
									<th scope="col">Duracion</th>
									<th scope="col">Asistentes</th>
									<th scope="col">Comentarios</th>
									<th scope="col"></th>
									<th scope="col"></th>
									<th scope="col"></th>
									<th scope="col"></th>


								</tr>
							</thead>
							<tbody>

								<c:forEach var="c" items="${capacitaciones}">

									<tr>
										<td><c:out value="${c.getId()}"></c:out></td>
										<td><c:out value="${c.getRut()}"></c:out></td>
										<td><c:out value="${c.getNombres()}"></c:out></td>
										<td><c:out value="${c.getDireccion()}"></c:out></td>
										<td><c:out value="${c.getFechaCapacitacion()}"></c:out></td>
										<td><c:out value="${c.getHorario()}"></c:out></td>
										<td><c:out value="${c.getDuracion()}"></c:out></td>
										<td><c:out value="${c.getCantidadAsistentes()}"></c:out></td>
										<td><c:out value="${c.getComentarios()}"></c:out></td>

										<td>
											<div class="input-group-append">

												<%-- <a href="verDatosCapacitacion?idCapacitacion=${c.getId()}"
													class="btn btn-info btn-sm" role="button">Modificar</a>
 --%>
											</div>
										</td>

										<td>
											<div class="input-group-append">

												<a
													href="verAsistenteCapacitacion?idCapacitacion=${c.getId()}"
													class="btn btn-info btn-sm" role="button">+Asistente</a>

											</div>
										</td>

										<td>
											<div class="input-group-append">

												<a href="verPago?idCapacitacion=${c.getId()}"
													class="btn btn-info btn-sm" role="button">Pago $$$</a>

											</div>
										</td>


										<td>
											<div class="input-group-append">
												<a href="Eliminar/${c.getId()}"
													class="btn btn-danger btn-sm" role="button">Eliminar</a>
											</div>
										</td>

									</tr>


								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>

			</div>


		</div>





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