<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="witdh=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Creacion de Noticias</title>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot"></spring:url>
<spring:url value="/noticias/save" var="urlForm"></spring:url>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
</head>
<body>
	<jsp:include page="../includes/menu.jsp"></jsp:include>
	<div class="container theme-showcase" role="main">
		<h3 class="blog-tittle">
			<span class="label label-succes">Datos de la Noticia</span>
		</h3>
		<spring:url value="/noticias/save" var="urlForm"></spring:url>
		<form action="${urlForm}" method="post">
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label for="titulo">Titulo</label> <input type="text"
							class="form-control" name="titulo" id="titulo"
							required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="estatus">Estatus</label> <select id="estatus"
							name="estatus" class="form-control">
							<option value="Activa">Activa</option>
							<option value="Inactiva">Inactiva</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<div class="form-group">
						<label for="detalle">Detalles</label>
						<textarea class="form-control" name="detalle" id="detalle"
							rows="10"></textarea>
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-danger">Guardar</button>
		</form>
		<hr class="featurette-divider">
		<!-- FOOTER -->
		<jsp:include page="../includes/footer.jsp"></jsp:include>
	</div> <!-- /CONTAINER -->
	<!-- TINY MCE -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
	 <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
  <script>tinymce.init({
	  selector:'#detalle',
	  plugins:"texcolor,table lists code",
	  toolbar:"undo redo |bold italic alignleft aligncenter alignright alignjustify \n\
	  | bullist numlist outdent indent | forecolor backcolor table code"
  });
  </script>
</body>
</html>