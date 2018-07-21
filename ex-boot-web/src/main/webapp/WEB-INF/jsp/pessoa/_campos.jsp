<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="nome"> Nome: </label>
<input type="text" name="nome" id="nome" value="${pessoa.nome}">
<form:errors path="pessoa.nome" />
<label for="cpf"> CPF: </label>
<input type="text" name="cpf" id="cpf" value="${pessoa.cpf}">
<form:errors path="pessoa.cpf" />

<label for="naturalidade">Naturalidade</label>
<select id="naturalidade" name="naturalidade.codigo">
	<c:forEach items="${cidades}" var="cidade">
		<c:set var="selecionado" value="" />
		<c:if test="${cidade.codigo eq pessoa.naturalidade.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${cidade.codigo}" ${selecionado}>${cidade.nome}
	</c:forEach>
</select>