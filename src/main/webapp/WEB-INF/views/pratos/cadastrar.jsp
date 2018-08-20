<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Pratos</title>
	</head>
	<body>
	    <table>
	        <tr>
	            <td>ID</td>
	            <td>Nome do Restaurante</td>
	        </tr>
	        <c:forEach items="${restaurantes}" var="restaurante">
	            <tr>
	                <td>${restaurante.id}</td>
	                <td>${restaurante.nome}</td>
	            </tr>
	        </c:forEach>
	    </table>
	    <form action="/restaurante/pratos" method="POST">
	        <div>
	            <label>Nome do Restaurante</label>
	            <input type="text" name="restaurante" />
	        </div>
	        <div>
	            <label>Nome do Prato</label>
	            <input type="text" name="nome" />
	        </div>
	        <div>
	            <label>Valor</label>
	            <input type="text" name="valor" />
	        </div>
	        <button type="submit">Cadastrar</button>
	    </form>
	</body>
</html>