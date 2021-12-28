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
			<h3>Ingreso de Pagos de Capacitaciones</h3>
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
											<input type="text" name="nombreEmpresa" class="form-control" id="nombreEmpresa" required placeholder="Empresa Nombre" maxlength="12" maxlength="11" readonly>
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
											<label for="rut">Rut Cliente</label> <input type="text"
												name="rut" class="form-control" id="rut" required placeholder="11.111.111-1" maxlength="12" maxlength="11">
										</div>
									
										<div class="form-group col-md-4">
	
											<label for="afp">A.F.P</label> <select name="afp" id="afp"
												required class="form-control" required>
												<option value="Pago Contado">Contado</option>
												<option value="Pago Cuotas">Cuotas</option>
												<option value="Cheque">Cheque</option>
												<option value="Transferencia">Transferencia</option>
	
												<option value="T.Debito">T.Debito</option>
	
												<option value="T.Credito a Cuotas">T.Credito a Cuotas</option>
	
												<option value="T. Credito Contado">T. Credito Contado</option>
												
											</select>
									
										</div>
										
										<div class="form-group col-md-4">
											<label for="cuotas">Cantidad de Cuotas/Documentos</label> <input type="number"
											name="cuotas" class="form-control" id="cuotas" min="0" max="12">
										</div>
									
									</div>
									
									<div class="form-row">
										<div class="form-group col-md-4">
											<label for="montoPago">Monto Pago</label> <input type="text"
											name="montoPago" class="form-control" id="montoPago" required placeholder="$ 00.000.000-" maxlength="12" maxlength="11">
										</div>
										
										<div class="form-group col-md-4">
											<label for="descuento">Descuento</label> <input type="text"
											name="descuento" class="form-control" id="descuento" required placeholder="$ 00.000.000-" maxlength="12" maxlength="11">
										</div>
										
										<div class="form-group col-md-4">
											<label for="pagoFinal">Total Final</label> <input type="text"
											name="pagoFinal" class="form-control" id="pagoFinal" required placeholder="$ 00.000.000-" maxlength="12" maxlength="11">
										</div>
										
									</div>
									
									<div class="form-row">
									
									
										<div class="form-group col-md-4">
											<label for="inputPassword4">.</br></label>
											<button type="submit" class="btn btn-danger">+ Realizar Pago</button>
										</div>
										
										<div class="form-group col-md-4">
											<label for="inputPassword4">.</br></label>
											<button type="reset" class="btn btn-success">+ Limpiar Formulario Pago</button>
										</div>
		
									
									</div>
								
								</div>	
								
							
								
							</form>	

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