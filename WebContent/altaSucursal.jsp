<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Ingrese datos jugador</h1><br><br>
				
				<form action="irCargarSucursal" method="POST">
					<input type="number" name="nrosucursal" placeholder="ingrese el nro de sucursal" /><br /> 
					<input type="text" name="provincia" 	placeholder="ingrese la provincia" /> <br />  
					<input type="text" name="localidad" placeholder="ingrese la localidad"> <br /> 
					<input type="text"	name="nombre" placeholder="ingrese el nombre" /> <br> 
					<input type="text" name="direccion" placeholder="ingrese la direccion" /> <br />
				    <input type="submit" value="ingresar jugador" /> 
				    <input type="reset" value="Borrar">
				</form>

</body>
</html>