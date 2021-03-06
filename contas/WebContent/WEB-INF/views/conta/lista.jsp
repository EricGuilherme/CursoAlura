<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<script src="resources/js/jquery.js"></script>
<script type= "text/javascript">

function deuCerto(dadosDaResposta) {
	  alert("Conta paga com sucesso!");
	}
	function pagaAgora(id) {
	  $.get("pagaConta?id="+id, deuCerto);
	}
	
</script>

</head>
<body>
		<table>
			<tr>
				<th>C�digo</th>
				<th>Descri�ao</th>
				<th>Valor</th>
				<th>Tipo</th>
				<th>Pago ?</th>
				<th>Data de Pagamento</th>
				<th>A��es</th>
								
			</tr>
			<c:forEach items="${contas}" var="conta">
			<tr>	
					<td>${conta.id}</td>
					<td>${conta.descricao}</td>
					<td>${conta.valor}</td>
					<td>${conta.tipo}</td>
					<td id="#conta_" + ${conta.id}>
            			<c:if test="${conta.paga eq false}">
           					N�o paga
            			</c:if>
            			<c:if test="${conta.paga eq true }">
            				Paga!
            			</c:if>
            		</td>
            <td><fmt:formatDate value="${conta.dataPagamento.time}" pattern="dd/MM/yyyy"/></td>
            <td>
            	<a href="removeConta?id=${conta.id}"> Remover </a> | 
            	<a href="mostraConta?id=${conta.id}">Alterar</a>  |
            <c:if test="${conta.paga eq false}">
    				<a href="#" onclick="pagaAgora(${conta.id});">Pagar</a>        
            </c:if>
            </td>
        </tr>        
        </c:forEach>
		</table>	
</body>
</html>