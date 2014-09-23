<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	

		<table>
			<tr>
				<th>Código</th>
				<th>Descriçao</th>
				<th>Valor</th>
				<th>Tipo</th>
				<th>Pago ?</th>
				<th>Data de Pagamento</th>
			</tr>
			<tr>	
				<c:forEach items="${todasContas}" var="conta">
					<td>"${conta.id}"</td>
					<td>"${conta.descricao}"</td>
					<td>"${conta.valor}"</td>
					<td>"${conta.tipo}"</td>
					<td>
						<c:if test="${conta.pago}">
							Pago
						</c:if>
						<c:if test="${not conta.pago}">
							Não Pago
						</c:if>		
					</td>
					<td>
						<fmt:formatDate value = "${conta.dataPagamento.time}" pattern="dd/MM/yyyy" /> 
					</td>
				</c:forEach>
			</tr>
		</table>	
</body>
</html>