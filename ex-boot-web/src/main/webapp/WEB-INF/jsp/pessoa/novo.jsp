<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro pessoa</title>
</head>
<body>
<form action="/pessoa/salvar" method="post">
	<c:import url="_campos.jsp"></c:import>
	
	<button type="submit">Salvar</button>
	<a href="/pessoa/listar">Cancelar</a>

</form>
</body>
</html>