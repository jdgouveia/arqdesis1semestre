function tabela_produto() {
	var novaTabela = document.createElement("table");
	document.getElementById("test").appendChild(novaTabela);

	var tabela = document.createElement("table");
	var cabecalho = document.createElement("thead");
	var corpo = document.createElement("tbody");

	tabela.appendChild(cabecalho);
	tabela.appendChild(corpo);

	document.getElementById("test").appendChild(tabela);
}