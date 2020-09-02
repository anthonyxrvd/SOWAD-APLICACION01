<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>aea</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"> 
</head>
<body>
<!--  <h1>3ed</h1> -->

   <h1>LISTA DE PELICULAS</h1>
<!--<ul> 
<c:forEach items="${Vpeliculas}" var="dato">
     <li>${dato}</li>
  </c:forEach>
</ul>-->
<table align="center">
  <thead>
  <tr>
    <th>ID</th><th>Titulo</th><th>Duracion</th>
    <th>Clasificacion</th><th>Genero</th>
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
        </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>