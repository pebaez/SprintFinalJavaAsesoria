
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bienvenido a Asesorías</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="container">
    

	<header>

		<%@ include file='menu.jsp'%>

	</header>
 
 

    <div class="card-deck">
        <div class="card">
            <img  src="./res/img/i1.jpeg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Contáctanos</h5>
                <p class="card-text">Con gusto atenderemos tus requerimientos y los de tu empresa u organización!</p>
                <p class="card-text"><small class="text-muted">Last updated 2 days ago</small></p>
            </div>
        </div>
        <div class="card">
            <img src="./res/img/i2.jpeg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Capacitaciones</h5>
                <p class="card-text">Contamos con las mejores capacitaciones para tus colaboradores</p>
                <p class="card-text"><small class="text-muted">Last updated 1 day ago</small></p>
            </div>
        </div>
        <div class="card">
            <img src="./res/img/i3.jpeg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Ingresa</h5>
                <p class="card-text">Accede a nuestro sistema con tus credenciales</p>
                <p class="card-text"><small class="text-muted">Last updated 30 mins ago</small></p>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>