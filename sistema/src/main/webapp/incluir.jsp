<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<c:import url="Menu.jsp"/>
    	
    	<div id="main" class="container">
        	<h3 class="page-header">Incluir Cardapio</h3>
        	<form action="manter" method="post">
	            <div class="row">
    	            <div class="form-group col-md-6">
        	            <label for="titulo">Titulo</label>
           		        <input type="text" class="form-control" name="titulo" id="titulo" required maxlength="100" placeholder="nome do produto">
                	</div>
                	
                	<div class="form-group col-md-6">
                    	<label for="descricao">Descricao</label>
                    	<input type="text" class="form-control" name="descricao" id="descricao" maxlength="100" placeholder="descricao do produto">
                	</div>
           		</div>
            	
            	<div class="row">
                	<div class="form-group col-md-6">
                    	<label for="valor">Valor</label>
                    	<input type="text" class="form-control" name="valor" id="valor" required maxlength="10" placeholder="0,00">
                	</div>
                	
            	</div>
           
        	</form>
    	</div>
    
    	<script src="js/jquery.min.js"></script>
    	<script src="js/bootstrap.min.js"></script>	
</html>