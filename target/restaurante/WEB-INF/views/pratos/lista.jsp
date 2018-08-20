<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset=UTF-8>
	    <title>Pratos</title>
	</head>
	<body>
	    <h1>Lista de Pratos</h1>
	    <table>
	        <thead>
	        	<tr>
		            <th>ID</th>
		            <th>Nome</th>
		            <th>Valor</th>
	        	</tr>
	        </thead>
	        <tbody>
	        	<c:forEach items="${pratos}" var="prato">
		            <tr>
		                <td>${prato.id}</td>
		                <td>${restaurante.nome}</td>
		            </tr>
	        	</c:forEach>
	        </tbody>
	    </table>
	</body>
</html>