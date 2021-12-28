<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quiero que me contacten</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="container">
   <header>

		<%@ include file='menu.jsp'%>

	</header>

    <form class="needs-validation" novalidate action="Contacto" method="post">
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="validationCustom01">Nombres</label>
                <input type="text" name="nombres" class="form-control" id="validationCustom01" placeholder="Ingrese nombres" required>
            </div>
            <div class="col-md-6 mb-3">
                <label for="validationCustom02">Apellidos</label>
                <input type="text" name="apellidos" class="form-control" id="validationCustom02" placeholder="Ingrese apellidos" required>
            </div>
        </div>
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="validationCustom03">Empresa</label>
                <input type="text" name="empresa" class="form-control" id="validationCustom03" placeholder="Ingrese razón social" required>
            </div>
            <div class="col-md-3 mb-3">
                <label for="validationCustom04">Forma de Contacto</label>
                <select class="custom-select" id="validationCustom04" required>
                    <option selected disabled value="">Elige...</option>
                    <option> Correo electrónico </option>
                    <option> Teléfono </option>
                    <option> Mensaje de WhatsApp</option>
                </select>
            </div>
            <div class="col-md-3 mb-3">
                <label for="validationCustom05">Email o Teléfono</label>
                <input type="text" name="datoContacto" class="form-control" id="validationCustom05" required>
            </div>
        </div>
        <div class="form-group">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
                <label class="form-check-label" for="invalidCheck">
                    Acepto términos y condiciones
                </label>
            </div>
        </div>
        <button class="btn btn-primary" type="submit">Quiero que me contacten!</button>
    </form>

</div>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>
