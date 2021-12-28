<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
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
			<h3>Ingreso de Profesionales</h3>
		</div>

		<div class="row ">
			<div class="col-sm-12 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">
						<div class="container">

					<form action="crearProfesional" method="post">
						<div class="form-row">
							<div class="form-group col-md-3">
								<label for="rut">Rut Profesional</label> <input type="text"
									name="rut" class="form-control" id="rut" required placeholder="11.111.111-1" maxlength="12" maxlength="11">
							</div>
							<div class="form-group col-md-3">
								<label for="inputPassword4">Nombres Profesional</label> <input
									type="text" name="nombres" class="form-control" id="nombres" required>
							</div>
							<div class="form-group col-md-3">
								<label for="inputPassword4">Apellidos Profesional</label> <input
									type="text" name="apellidos" class="form-control"
									id="apellidos" required>
							</div>

							<div class="form-group col-md-3">
								<label for="fechaNacimiento">Fecha de Nacimiento</label> <input
									type="date" name="fechaNacimiento" class="form-control"
									id="fechaNacimiento" required>
							</div>
						</div>


						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="titulo">Titulo</label> <input type="text"
									name="titulo" class="form-control" id="titulo" required>
							</div>

							<div class="form-group col-md-3">
								<label for="fechaNacimiento">Fecha de Ingreso</label> <input
									type="date" name="fechaIngreso" class="form-control"
									id="fechaIngreso" required>
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
									Profesional</button>
									
						<button type="reset" class="btn btn-primary">Limpiar
									</button>			


					</form>
				</div>
			</div>
		</div>
		<!-- /.8 -->
	</div>
	<!-- /.row-->
		</div>
		<!-- /.8 -->
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