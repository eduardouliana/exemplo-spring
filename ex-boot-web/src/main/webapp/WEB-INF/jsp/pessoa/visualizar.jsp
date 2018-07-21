<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar pessoa</title>
</head>
<body>
	<form action="/pessoa/alterar" method="post">
		<input type="hidden" name="codigo" value="${pessoa.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		
		<a href="/pessoa/listar">Cancelar</a> 
		<a href="/pessoa/deletar/${pessoa.codigo}">Deletar</a>

	</form>
</body>
</html>