<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<title>AgrMarket - Ingresar Nuevo producto</title>
	</head>
	<body>
		<div class="container">
			<h1 class="mt-3 text-center">Nuevo producto:</h1>
			<div class="col-md-6">
				<form action="product?option=save" method="post"><br>
					<input class="form-control" type="text" name="code" size="50" placeholder="Código"><br>
					<input class="form-control" type="text" name="description" size="50" placeholder="Descripción"><br>
					<input class="form-control" type="text" name="brand" size="50" placeholder="Marca"><br>
					<input class="form-control" type="text" name="presentation" size="50" placeholder="Presentación"><br>
					<input class="form-control" type="text" name="price" size="50" placeholder="Precio"><br>
					<input class="form-control" type="text" name="location" size="50" placeholder="Codigo de Ubicación"><br><br>
					<input class="btn btn-success" type="submit" value="Ingresar Producto">
				</form>
			</div>
		</div>
	</body>
</html>