<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/resources/css/detalle.css"/>">
</head>
<body>
	<h1>Titulo: ${titulo}</h1>
	<h1>Duracion: ${duracion}</h1>
	<h1>Precio: ${precio}</h1>
	<h1>Fecha: ${fecha}</h1>
</body>
</html>