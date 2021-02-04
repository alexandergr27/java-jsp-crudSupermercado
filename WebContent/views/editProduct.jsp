<%@page import="com.agrmarket.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% Product product = (Product)session.getAttribute("product");%>
<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<title>AgrMarket - Editar producto</title>
	</head>
	<body>
		<div class="container">
			<h1 class="mt-3 text-center">Editar producto:</h1>
			<div class="col-md-6">
				<form action="product?option=editar&code=${product.code }" method="post"><br>
					<input class="form-control" type="text" name="editcode" value="${product.code }" size="50" placeholder="Código"><br>
					<input class="form-control" type="text" name="editdescription" value="${product.description }" size="50" placeholder="Descripción"><br>
					<input class="form-control" type="text" name="editbrand" size="50" value="${product.brand }" placeholder="Marca"><br>
					<input class="form-control" type="text" name="editpresentation" value="${product.presentation }" size="50" placeholder="Presentación"><br>
					<input class="form-control" type="text" name="editprice" value="${product.price }" size="50" placeholder="Precio"><br>
					<input class="form-control" type="text" name="editlocation" value="${product.location }" size="50" placeholder="Codigo de Ubicación"><br><br>
					<input class="btn btn-success" type="submit" value="Actualizar">
				</form>
			</div>
		</div>
	</body>
</html>