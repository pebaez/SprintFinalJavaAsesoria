<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema de Registro de Acciones</title>

<link rel="stylesheet" href="estilo.css">

<link rel="stylesheet" href="./res/css/signin.css" >



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
	crossorigin="anonymous"></script>


<!-- <link rel="stylesheet" -->
<!-- 	href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" -->
<!-- 	integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" -->
<!-- 	crossorigin="anonymous"> -->

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
	


<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</head>

  <body class="text-center">
    <form class="form-signin" name="loginForm" method="POST" action="${pageContext.request.contextPath}/login">
      <img class="mb-4" src="https://res.cloudinary.com/bitcharge/image/upload/v1535940305/panda-avatar.png" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Por favor logeate!</h1>
      <label for="inputEmail" class="sr-only">Usuario:</label>
      <input type="text" name="username" class="form-control" placeholder="Username" required autofocus>
      <label for="inputPassword" class="sr-only">Password:</label>
      <input type="password" name="password" class="form-control" placeholder="Password" required>
      <label for="perfil" class="sr-only">Perfil:</label>
       <select
											name="perfil" id="perfil" required
											class="form-control">
											<option value="Profesional">Profesional</option>
											<option value="Cliente">Cliente</option>
											<option value="Administrativo">Administrativo</option>

										</select>

									</div>
      
      
      <%
      
      
      	String error = (String) request.getAttribute("error");
      
      	if (error != null && error.equals("true")){
      		
      		out.println("<h3 class='alert alert-danger'>Error de Autenticación</h3>");
      		
      	}
      
      
      %>
      
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Recuerdame
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Acceder</button>
      <p class="mt-5 mb-3 text-muted">&copy; ingtecno.cl/pbaez 2021</p>
    </form>
  </body>
</html>