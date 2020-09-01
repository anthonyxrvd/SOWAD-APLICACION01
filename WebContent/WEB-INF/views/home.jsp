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
<ul> 
<c:forEach items="${Vpeliculas}" var="dato">
     <li>${dato}</li>
  </c:forEach>
</ul>

</body>
</html>