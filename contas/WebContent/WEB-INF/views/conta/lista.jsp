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
				<th>Ações</th>
				
			</tr>
			<c:forEach items="${contas}" var="conta">
			<tr>	
					<td>"${conta.id}"</td>
					<td>"${conta.descricao}"</td>
					<td>"${conta.valor}"</td>
					<td>"${conta.id}"></td>
					<td>
            			<c:if test="${conta.paga eq false}">
           					Não paga
            			</c:if>
            			<c:if test="${conta.paga eq true }">
            				Paga!
            			</c:if>
            		</td>
            <td><fmt:formatDate value="${conta.dataPagamento.time}" pattern="dd/MM/yyyy"/></td>
            <td>
            	<a href="removeConta?id=${conta.id}"> Remover </a>
            </td>
        </tr>        
        </c:forEach>
		</table>	
</body>
</html>