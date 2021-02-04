<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>AgrMarket - Administración de tu tienda</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	</head>
	
	<body>
		<div class="container">
			<h1 class="mt-3 text-center">AgrMarket - Administración</h1>
			<h3 class="mt-3">Menú de opciones</h3>
			<a class="btn btn-primary" href="product?option=newProduct"> Ingresar nuevo producto </a>
			<a class="btn btn-primary" href="product?option=productList"> Listar todos los productos </a>
			<a class="btn btn-primary" href="product?option=productUpdate"> Actualizar un producto </a>
			<a class="btn btn-danger" href="product?option=productDelete"> Eliminar un producto </a>
		</div>
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
	</body>
</html>