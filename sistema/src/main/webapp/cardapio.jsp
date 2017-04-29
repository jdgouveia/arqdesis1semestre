<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cardapio</title>
</head>
<body>
	<form method="post" action="manter">
		<label>ID produto</label>
		<input id="idProduto" name="idProduto" type="text"/>
		<br/>
		<label>Nome Produto:</label>
		<input id="nomeProduto" name="nomeProduto" type="text"/>
		<br/>
		<label>Descrição produto</label>
		<input id="descricao" name="descricao"/>
		<br/>
		<label>Valor Unitario</label>
		<input id="valor" name="valor"/>
		
		<button type="submit" value ="manter"  id="btn" name ="btn">Inserir</button>
		<button type="submit" value ="alterar" id="btn" name ="btn">Alterar</button>
		<button type="submit" value ="excluir" id="btn" name ="btn">Excluir</button>
		<button type="submit" value ="listar"  id="btn" name ="btn">Listar</button>
	</form>	
</body>
</html>