<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cardapio</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">
            Restaurante
          </a>
        </div>
      </div>
    </nav>

    <div class="container">
      <form method="post" action="manter">
      <div class="row">
            
              <div class="form-group col-md-6">
                <label>ID do Produto</label>
                <input type="text" class="form-control" id="id" data-toggle="tooltip" data-placement="top" title=" Preencha um Id válido">
              </div>
              <div class="form-group col-md-6">
                <label>Nome do Produto</label>
                <input type="text" class="form-control" id="nome" data-toggle="tooltip" data-placement="top" title="Preencha um Nome válido">
              </div>
            
          
        </div>
      

      <div class="row">
            
              <div class="form-group col-md-6">
                <label>Descrição</label>
                <input type="text" class="form-control" id="descricao" data-toggle="tooltip" data-placement="top" title="Preencha uma Descrição válida">
              </div>
              <div class="form-group col-md-6">
                <label>Valor Unitário</label>
                <input type="text" class="form-control" id="valor" data-toggle="tooltip" data-placement="top" title="Preencha um Valor válido">
              </div>
            
      </div>

      <div class="row">
            
              <div class="form-group col-md-3">
                <button onclick="validaFormulario()" type="submit" value="inserir" class="btn btn-success ">Inserir</button>
              </div>

              <div class="form-group col-md-3">
                <button onclick="validaFormulario()" type="submit" value="alterar" class="btn btn-warning ">Alterar</button>
              </div>

              <div class="form-group col-md-3">
                <button onclick="validaFormulario()" type="submit" value"excluir" class="btn btn-danger ">Excluir</button>
              </div>

              <div class="form-group col-md-3">
                <button onclick="validaFormulario()" type="submit" value="listar" class="btn btn-info ">Listar</button>
              </div>
           </div>
		<table class="table table-bordered">
           <thead>
              <tr>
                <th>Id</th>
                <th>Nome do Produto</th>
                <th>Descrição</th>
                <th>Valor </th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
              <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
              <tr>
               <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
              <tr>
               <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
            </tbody>

                   </table>
      </form>
    </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/validacao.js"></script>
    <script type="text/javascript" ></script>
	
               
       
</body>
</html>