<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="main" class="container">
    		<h3 class="page-header">Alterar Cardapio #${cardapio.idProduto }</h3>
            <form action="manter" method="post">
               	<div class="row">
                  	<input type="hidden" name="idProduto" value="${cardapio.id }" />
                    	<div class="form-group col-md-6">
                        	<label for="nomeProduto">Titulo</label>
                            <input type="text" class="form-control" name="nomeProduto" id="nomeProduto" required maxlength="20" placeholder="nome do produto" value="${cardapio.titulo }">
                        </div>
                	
                		<div class="form-group col-md-6">
                        	<label for="descricao">Descricao</label>
                            <input type="text" class="form-control" name="descricao" id="descricao" required maxlength="20" placeholder="descricao do produto" value="${cardapio.descricao }">
                        </div>
           			</div>
            	
            		<div class="row">
                		<div class="form-group col-md-6">
                        	<label for="valor">Valor</label>
                            <input type="text" class="form-control" name="valor" id="valor" required maxlength="20" placeholder="valor do produto" value="${cardapio.valor }">
                        </div>
     				</div>
     				
     				<hr />
                    
                    <div id="actions" class="row">
                    	<div class="col-md-12">
                        	<button type="submit" class="btn btn-primary" name="acao" value="Alterar">Salvar</button>
                            <a href="ListarCardapio.jsp" class="btn btn-default">Cancelar</a>
                    	</div>
                    </div>
            </form>
		</div>
            
        <script src="js/jquery.min.js"></script>
    	<script src="js/bootstrap.min.js"></script>

</body>
</html>