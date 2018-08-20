<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Restaurante</title>
	</head>
	<body>
	    <form action="/restaurante/restaurantes" method="POST">
	        <div>
	            <label>Nome do Restaurante</label>
	            <input type="text" name="nome" />
	        </div>
	        <button type="submit">Cadastrar</button>
	    </form>
	</body>
</html>