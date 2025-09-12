<!-- resultado.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Resultado do IMC</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
    <div class="head">
        <h1>Calculadora de IMC</h1>
    </div>
    <div class="container">
        <h2 class="resultado">Seu Resultado</h2>
        <p class="classificacao">
            IMC: <strong>${imc}</strong><br>
            Classificação: <strong>${classificacao}</strong>
        </p>
        <a href="index.jsp"><button class="Novamente">Calcular Novamente</button></a>
    </div>
</body>
</html>