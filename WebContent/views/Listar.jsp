<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<% List productlist = (List)session.getAttribute("productlist");%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<h1 class="mt-3 text-center">Listar productos</h1>
			<table class="table table-striped">
				<thead><tr><td> Codigo </td> <td>Descripción</td><td>Marca</td> <td>Presentación</td> <td>Precio</td> <td>Pasillo</td> </tr></thead>
				<c:forEach items="${productlist}" var="product">
		    	<tr>
		        <td><c:out value="${product.code}"/></td>
		        <td><c:out value="${product.description}"/></td>
		        <td><c:out value="${product.brand}"/></td>
		        <td><c:out value="${product.presentation}"/></td>
		        <td><c:out value="${product.price}"/></td>
		        <td><c:out value="${product.location}"/></td>  
		    	</tr>
				</c:forEach>
			</table>
		</div>
		
	</body>
</html>