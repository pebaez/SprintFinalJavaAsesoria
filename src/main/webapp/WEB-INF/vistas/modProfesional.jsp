<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>
<head>
    <meta charset="UTF-8">
    <title>Modificacion Datos de Profesionales</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

<c:forEach var="c" items="${usuarioprofesional}">	

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

    <form action="modificarProfesional" method="post">
    
    	<input type="hidden"
											name="idCliente" class="form-control" id="idCliente" value="${c.getIdProfesional()}">
								<input type="hidden"
											name="idUsuario" class="form-control" id="idUsuario" value="${c.getIdUsuario()}">
    
      	<div class="form-row">
            <div class="form-group col-md-3">
                <label for="rut">Rut Profesional</label>
                <input type="text" name="rut" class="form-control" id="rut" readonly value="${c.getRutProfesional()}" required>
            </div>
            <div class="form-group col-md-3">
                <label for="inputPassword4">Nombres Profesional</label> 
                <input type="text" name="nombres" class="form-control" id="nombres" value="${c.getNombres()}" required>
            </div>
            <div class="form-group col-md-3">
                <label for="inputPassword4">Apellidos Profesional</label>
                <input type="text" name="apellidos" class="form-control" id="apellidos" value="${c.getApellidos()}" required>
            </div>
            
            <div class="form-group col-md-3">
                <label for="fechaNacimiento">Fecha de Nacimiento</label>
                <input type="date" name="fechaNacimiento" class="form-control" id="fechaNacimiento" value="${c.getFechaNacimiento()}" required>
            </div>
        </div>
        
        
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="titulo">Titulo</label>
                <input type="text" name="titulo" class="form-control" id="titulo" value="${c.getTitulo()}">
            </div>
            
			<div class="form-group col-md-3">
			    <label for="fechaNacimiento">Fecha de Ingreso</label>
			    <input type="date" name="fechaIngreso" class="form-control" id="fechaIngreso" value="${c.getFechaIngreso()}">
			</div>
       </div>     
           
        
       
      
        <div class="form-group">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="gridCheck">
                <label class="form-check-label" for="gridCheck" required>
                    Acepto t??rminos y condiciones
                </label>
            </div>
        </div>
        <button href="modProfesional" type="submit" class="btn btn-primary" >Modificar Profesional</button>

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

</c:forEach>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>