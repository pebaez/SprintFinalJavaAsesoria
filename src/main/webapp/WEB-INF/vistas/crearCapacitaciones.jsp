<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
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
			<h3>Ingreso de Capacitaciones</h3>
		</div>

		<div class="row ">
			<div class="col-lg-10 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">

							<form action="IngresarCapacitacion" method="post">
								<div class="form-row">
									<div class="form-group col-md-6">
										<label for="inputEmail1">Rut Cliente</label> <input
											type="text" name="rutCliente" class="form-control"
											id="inputEmail1">
									</div>
									<div class="form-group col-md-6">
										<label for="inputPassword4">Nombre Empresa</label> <input
											type="text" name="empresa" class="form-control"
											id="inputPassword4">
									</div>
								</div>
								<div class="form-group">
									<label for="inputAddress">Dirección</label> <input type="text"
										name="direccion" class="form-control" id="inputAddress">
								</div>
								<div class="form-row">
									<div class="form-group col-md-4">
										<label for="inputDate">Fecha de la capacitación</label> <input
											type="date" name="fecha" class="form-control" id="inputDate">
									</div>
									<div class="form-group col-md-4">
										<label for="inputHour">Horario</label> <input type="time"
											name="hora" class="form-control" id="inputHour">
									</div>
									<div class="form-group col-md-4">
										<label for="inputDuracion">Duracion</label> <input type="time"
											name="duracion" class="form-control" id="inputDuracion">
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-md-3">
										<label for="inputCantidad">Cantidad de Asistentes</label> <input
											type="number" name="cantAsistentes" class="form-control"
											id="inputCantidad">
									</div>
									<div class="form-group col-md-7">
										<label for="inputZip">Comentarios</label> <input type="text"
											name="comentCap" class="form-control" id="inputZip">
									</div>
								</div>
								<div class="form-group">
									<div class="form-check">
										<input class="form-check-input" type="checkbox" id="gridCheck">
										<label class="form-check-label" for="gridCheck">
											Acepto términos y condiciones </label>
									</div>
								</div>
								<button type="submit"
									class="btn btn-primary">Registrar Capacitación</button>

							</form>
						</div>
					</div>
				</div>
				<!-- /.8 -->
			</div>
			<!-- /.row-->
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