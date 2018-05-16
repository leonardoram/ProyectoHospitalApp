<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="css/bootstrap-grid.css"/>
	<link rel="stylesheet" href="css/bootstrap.css"/>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Bienvenido</title>
</head>
<body >
	<div class="media-right">
 		<img id="logo" src="media/images.jpg" alt="logo" class="media-object">
 	</div>
	<h1>El hospitalito </h1>
	
		<div class= "btn-group col-md-6 " > 
			<a href="index.jsp"><button type="button" class="btn btn-outline-dark "> Inicio</button></a>
		<div class="btn-group">
			<button type="button" class="btn btn-outline-dark dropdown-toggle" data-toggle="dropdown"> Registrar </button>
				<ul class="dropdown-menu" role="menu">
      				<li><a href="BuscarPaciente.jsp">Busqueda</a></li>
      				<li><a href="RegistroPaciente.jsp">Registro</a></li>
      				<li><a href="BajaPaciente.jsp">Baja</a></li>
      				<li><a href="ModificarPaciente.jsp">Modificacion</a></li>
    			</ul>
    	</div>
			<button type="button" class="btn btn-outline-dark"> Contacto</button>
			<button type="button" class="btn btn-outline-dark"> FAQ </button>
			<button type="button" class="btn btn-outline-dark" > Ingresar</button>
		</div>
	
	<br/><div class="container " id="margen">
			<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna
	 aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
	 Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
	 Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
	  		</p>
	</div>
</body>
	<script src="js/jquery.js"></script>
	<script  src="js/bootstrap.min.js"></script>
	<script  src="js/bootstrap.js"></script>
<!-- 	<script src="js/popper.min.js"></script> -->
	<script type="text/javascript" src="js/script.js"></script>
</html>