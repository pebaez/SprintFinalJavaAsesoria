<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Listado de Clientes</title>
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
			<h3>Listado de Clientes</h3>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="card bg-light">

					<div class="card-header">
						<a href="Cliente" class="btn btn-primary btn-sm text-center"
							role="button">+ Ingresar Nuevo Cliente</a>
							
						<a href="excelClientes" class="btn btn-success btn-sm text-center"
							role="button">+ Exportar a Excel</a>
							
						<a href="pdfClientes" class="btn btn-danger btn-sm text-center"
							role="button">+ Exportar PDF</a>		
					</div>

					<div class="card-body bg-light">
						<table class="table table-striped table-hover table-bordered table-responsive">
							<thead class="bg-primary">
								<tr>
									<th scope="col">N#</th>
									<th scope="col">Rut Cliente</th>
									<th scope="col">Nombres</th>
									<th scope="col">Apellidos</th>
									<th scope="col">afp</th>
									<th scope="col">Sistema Salud</th>
									<th scope="col">Comuna</th>
									<th scope="col">Direccion</th>
									<th scope="col"></th>
									<th scope="col"></th>


								</tr>
							</thead>
							<tbody>

								<c:forEach var="c" items="${usuariocliente}">

									<tr>

										<td><c:out value="${c.getIdCliente()}"></c:out></td>
										<td><c:out value="${c.getRutCliente()}"></c:out></td>
										<td><c:out value="${c.getNombres()}"></c:out></td>
										<td><c:out value="${c.getApellidos()}"></c:out></td>
										<td><c:out value="${c.getAfp()}"></c:out></td>
										<td><c:out value="${c.getSistemaSalud()}"></c:out></td>
										<td><c:out value="${c.getComuna()}"></c:out></td>
										<td><c:out value="${c.getDireccion()}"></c:out></td>

										<td>
											<div>
												<a
													href="verDatosCliente?idCliente=${c.getIdCliente()}&idUsuario=${c.getIdUsuario()}"
													class="btn btn-info btn-sm" role="button">Modificar</a>

											</div>
										</td>
										<td>
											<div>
												<a
													href="EliminarCliente/${c.getIdCliente()}/${c.getIdUsuario()}"
													class="btn btn-info btn-sm" role="button">Eliminar</a>
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