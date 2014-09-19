<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		Bem vindo  ao nosso gerenciador de empresas!<br/>
		<c:if test= "${not empty usuarioLogado}">
			Logado com login: ${usuarioLogado.email}
		</c:if>
		
		<form action="executa?tarefa=NovaEmpresa" method ="post">
			<input type="text" name="nome" />
			<input type= "submit" value="Enviar"/>
		</form>
			
		<form action="executa?tarefa=Login" method= "post"> 
			E-mail	<input type="text" name="email" />
			Senha 	<input type="password" name="senha" />
					<input type = "submit" value= "Login" />
		</form>
		<form action="executa?tarefa=Logout" method="post">
			<input type="submit" value="Deslogar" />
		</form>
	</body>
</html>