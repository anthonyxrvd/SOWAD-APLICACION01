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
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>aea</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<!-- script -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<spring:url value="/resources" var="urlPublic" />
</head>
<body>
	<!--  <h1>3ed</h1> -->

	<!--  <h1>LISTA DE PELICULAS</h1>-->
	<!--<ul> 
<c:forEach items="${Vpeliculas}" var="dato">
     <li>${dato}</li>
  </c:forEach>
</ul>-->
	<div class="card">
		<div class="card-header">LISTA DE PELICULAS</div>
		<div class="card-body">
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
										<span class="alert alert-success">Activa</span>
									</c:when>
									<c:otherwise>
										<span class="alert alert-danger">Inactiva</span>
									</c:otherwise>
								</c:choose>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>