<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eric Guilherme - Treinamento</title>
</head>
<body>

	<h3>Produto</h3>

	<form action="adicionaProduto" method = "post">
		Descricao: 
		<br/> 
		<input type="text" name = "descricao" />
		<br/>
		Valor:
		<input type="text" name = "valor" />
		<br/>
		Quantidade
		<input type="text" name = "quantidade" />
		<br/>
		Data de Entrada
		<input type="text" name = "dataEntrada" />
		<br/>
		
		<input type="submit" value = "Adicionar" />
	
	</form>
</body>
</html>