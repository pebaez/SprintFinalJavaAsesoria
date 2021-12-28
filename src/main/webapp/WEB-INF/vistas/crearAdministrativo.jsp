<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Administrativos</title>
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
			<h3>Ingreso de Administrativos</h3>
		</div>

		<div class="row ">
			<div class="col-sm-12 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">

							<form action="crearAdministrativo" method="post">
								<div class="form-row">
									<div class="form-group col-md-3">
										<label for="rut">Rut Cliente</label> <input type="text"
											name="rut" class="form-control" id="rut">
									</div>
									<div class="form-group col-md-3">
										<label for="nombres">Nombres Cliente</label> <input
											type="text" name="nombres" class="form-control" id="nombres">
									</div>
									<div class="form-group col-md-3">
										<label for="apellidos">Apellidos Cliente</label> <input
											type="text" name="apellidos" class="form-control"
											id="apellidos">
									</div>

									<div class="form-group col-md-3">
										<label for="fechaNacimiento">Fecha de Nacimiento</label> <input
											type="date" name="fechaNacimiento" class="form-control"
											id="fechaNacimiento">
									</div>
								</div>


								<div class="form-row">
									<div class="form-group col-md-3">
										<label for="area">Area</label> <input type="text" name="area"
											class="form-control" id="area">
									</div>

									<div class="form-group col-md-3">
										<label for="experiencia">Experiencia</label> <input
											type="text" name="experiencia" class="form-control"
											id="experiencia">
									</div>
								</div>




								<div class="form-group">
									<div class="form-check">
										<input class="form-check-input" type="checkbox" id="gridCheck">
										<label class="form-check-label" for="gridCheck" required>
											Acepto términos y condiciones </label>
									</div>
								</div>
								<button type="submit" class="btn btn-primary">Registrar
									Administrativo</button>

							</form>
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