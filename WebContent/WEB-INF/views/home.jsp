<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!-- FORMATO DE FECHAS -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Pelis</title>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot"></spring:url>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<!-- script -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>

</head>
<body>
	<!--  <h1>3ed</h1> -->

	<!--  <h1>LISTA DE PELICULAS</h1>-->
	<!--<ul> 
<c:forEach items="${Vpeliculas}" var="dato">
     <li>${dato}</li>
  </c:forEach>
</ul>-->

	<jsp:include page="includes/menu.jsp"></jsp:include>
	<div class="container theme-showcase" role="main">

		<div class="card">
			<div class="card-header border-0 text-center">
				<h4 class="display-4">LISTA DE PELICULAS</h4>
			</div>
			<div class="card-body">
				<div class="row page-header">
					<form class="form-inline" action="${urlRoot}search" method="post">
						<div class="form-group">
							<label for="fecha">Fecha:</label> <select id="fecha" name="fecha"
								class="form-control">
								<c:forEach items="${fechas}" var="fecha">
									<option value="${fecha}">${fecha}</option>
								</c:forEach>
							</select>
						</div>
						<button type="submit" class="btn btn-primary">Filtrar</button>
					</form>
				</div>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Titulo</th>
							<th scope="col">Duracion</th>
							<th scope="col">Clasificacion</th>
							<th scope="col">Genero</th>
							<th scope="col">Imagen</th>
							<th scope="col">Fecha</th>
							<th scope="col">Estatus</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${Vpeliculas}" var="dato">
							<tr>
								<td>${dato.id}</td>
								<td>${dato.titulo}</td>
								<td>${dato.duracion}</td>
								<td>${dato.clasificacion}</td>
								<td>${dato.genero}</td>
								<td><img alt="" width="45"
									src="${urlPublic}/images/${dato.imagen}"></td>
								<td><fmt:formatDate value="${dato.fechaEstreno}"
										pattern="dd-MM-YYY" /></td>
								<td><c:choose>
										<c:when test="${dato.estatus=='Activa'}">
											<p class="p-3 bg-primary text-center alert alert-success">Activa</p>
										</c:when>
										<c:otherwise>
											<p class="p-3 bg-block text-center alert alert-danger">Inactiva</p>
										</c:otherwise>
									</c:choose><a class="btn btn-sm btn-primary"
									href="detail/${dato.id}/${fechaBusqueda}" role="button">
										Ver Detalle Horario </a> <!--  <a class="btn btn-sm btn-primary"
									href="detail?id=${dato.id}&fecha=${fechaBuqueda}" role="button"> Ver
										Detalle Horario </a>--></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<jsp:include page="includes/footer.jsp"></jsp:include>
	</div>
	<div class="opciones">
			<ul>
				<li><a href="noticias/noti">abrir noticia</a></li>
				<li><a href="acceso">SALIR</a></li>
			</ul>
		</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>

</body>
</html>