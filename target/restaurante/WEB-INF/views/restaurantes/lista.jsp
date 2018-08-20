<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset=UTF-8>
	    <title>Restaurante</title>
	</head>
	<body>
	    <h1>Lista de Restaurantes</h1>
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
	</body>
</html>