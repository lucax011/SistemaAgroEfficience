<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tela de Cultivo</title>
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>
    <header>
        <h1>Tela de Cultivo</h1>
    </header>

    <main class="container">
        <form id="cultivo-form">
            <div class="form-group">
                <label for="cultura">Tipo de Cultura:</label>
                <select id="cultura" name="cultura">
                    <option value="1">Cultura 1</option>
                    <option value="2">Cultura 2</option>
                    <option value="3">Cultura 3</option>
                </select>
            </div>

            <div class="form-group">
                <label for="clima">Clima:</label>
                <select id="clima" name="clima">
                    <option value="1">Clima 1</option>
                    <option value="2">Clima 2</option>
                    <option value="3">Clima 3</option>
                </select>
            </div>

            <div class="form-group">
                <label for="temperatura">Temperatura:</label>
                <select id="temperatura" name="temperatura">
                    <option value="1">Temperatura 1</option>
                    <option value="2">Temperatura 2</option>
                    <option value="3">Temperatura 3</option>
                </select>
            </div>

            <div class="form-group">
                <label for="relevo">Relevo:</label>
                <select id="relevo" name="relevo">
                    <option value="1">Relevo 1</option>
                    <option value="2">Relevo 2</option>
                    <option value="3">Relevo 3</option>
                </select>
            </div>

            <div class="form-group">
                <label for="estacao">Estacao do Ano:</label>
                <select id="estacao" name="estacao">
                    <option value="1">Primavera</option>
                    <option value="2">Estação 2</option>
                    <option value="3">Estação 3</option>
                </select>
            </div>

            <button type="submit">Obter dados</button>
        </form>

         <h2>Melhorias</h2>
        <div id="informacoes-div" class="informacoes-container">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Regadura:</h3>
        </div>
        <div class="card-body">
            <img src="./img/124361.png" alt="Imagem 1">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
    </div>
    
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Cuidados:</h3>
        </div>
        <div class="card-body">
            <img src="./img/Cuidados-con-los-aceros-inoxidables.png" alt="Imagem 2">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
    </div>
    
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Beneficios:</h3>
        </div>
        <div class="card-body">
            <img src="./img/5430664.png" alt="Imagem 3">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
    </div>
    
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Desvantagens:</h3>
        </div>
        <div class="card-body">
            <img src="./img/8712072.png" alt="Imagem 4">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
    </div>


    </main>

    <script src="./js/script.js"></script>
</body>

</html>