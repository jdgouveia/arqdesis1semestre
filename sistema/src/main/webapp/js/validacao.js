
function validaFormulario(table){
  let id = $('#idProduto').val();
  let nome = $('#nomeProduto').val();
  let descricao = $('#descricao').val();
  let valor = $('#valor').val();
  
if(id == ''){
    $('#idProduto').focus();
    $('#idProduto').tooltip('show');
    setTimeout(function () {
      $('#idProduto').tooltip('destroy');
    }, 3000);
    return;
  }

  if(nome == ''){
    $('#nomeProduto').focus();
    $('#nomeProduto').tooltip('show');
    setTimeout(function () {
      $('#nomeProduto').tooltip('destroy');
    }, 3000);
    return;
  }
  
  if(descricao == ''){
    $('#descricao').focus();
    $('#descricao').tooltip('show');
    setTimeout(function () {
      $('#descricao').tooltip('destroy');
    }, 3000);
    return;
  }
  if(valor == ''){
    $('#valor').focus();
    $('#valor').tooltip('show');
    setTimeout(function () {
      $('#valor').tooltip('destroy');
    }, 3000);
    return;
  }
  

  console.log(nome,id,descricao,valor);
}

