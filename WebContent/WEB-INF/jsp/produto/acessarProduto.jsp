<%@ include file="/base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!-- Busca Validacao -->
<div style="background-color: red; color: white">
<c:forEach var="error" items="${errors}">
    ${error.category} - ${error.message}<br />
</c:forEach>
</div>

 	<div class="div-body"> 
 		<div class="div-formulario">
 		
 		<form class='form-add-produto' action="<c:url value="/produto/salvar"/>" method="post" >	
	
		<div class="corMedia divFormulario" >
			<label class="label-formulario" >Item </label> 
			<input type="text" style="width: 70%;" name="produto.nome" >
		</div>
		<div>
			<label class="label-formulario" >Breve descrição do Item </label> 
			<input type="text" style="width: 60%;"  name="produto.breveDescricao" >
		</div>
		<div>
			<label class="label-formulario" >Valor inicial para Leilão</label> 
			<input type="text" style="width: 20%;"  name="produto.valorInicialLeilão" >
			<label>Estado do Item</label>
			<select>
			<option value="Exelente">Excelente</option>
			<option value="Exelente">Bom</option>
			</select>
		</div>
			<input type="submit" value="salvar">
	</form>
 		
 		</div> 
 	</div>