<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario Produtos</title>
</head>
<body>
<h1>Cadastre um produto!</h1>
<form action="produto-servlet" method="post">
    <label for="id-nome">Nome:</label>
    <input type="text" id="id-nome" name="nome" required><br><br>

    <label for="id-preco">Preço:</label>
    <input type="number" id="id-preco" name="preco" step="0.01" required><br><br>

    <label for="id-qtd">Quantidade:</label>
    <input type="number" id="id-qtd" name="quantidade" required><br><br>

    <input type="submit" value="Cadastrar">
</form>
</body>
</html>