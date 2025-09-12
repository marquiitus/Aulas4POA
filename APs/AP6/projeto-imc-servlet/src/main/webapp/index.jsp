<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <title>Calculadora de IMC</title>
</head>
<body>
    <div class="head">
        <h1>Bem vindo a Calculadora de IMC</h1>
    </div>
    
    <div class="container">
        <div class="branco">
        <h2>Insira seu peso e altura para calcular</h2>

        <form action="calcular-imc" method="post">
            <div>
                <label for="peso">Peso (kg):</label><br>
                <input type="number" id="peso" name="peso" step="0.1" required placeholder="Ex: 70.5">
            </div>
            <div>
                <label for="altura">Altura (m):</label><br>
                <input type="number" id="altura" name="altura" step="0.01" required placeholder="Ex: 1.75">
            </div>
            <button type="submit">Calcular</button>
        </form>
</div>
    </div>
</body>
</html>