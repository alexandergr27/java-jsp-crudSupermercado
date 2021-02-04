<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualiza un producto</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 class="mt-3 text-center">AgrMarket - Eliminar producto</h1><br>
		<div class="col-md-6 mt-3">
			<form action="FindProduct" method="post">
				<input class="form-control" type="text" name="deletecode" id="deletecode" placeholder="Digite el codigo del producto">
				<input class="btn btn-danger mt-3" type="submit" value="Eliminar producto">
				
			</form>
		</div>
	</div>
	
</body>
</html>