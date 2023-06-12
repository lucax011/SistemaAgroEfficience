<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style.css">
    <title>Meu Jardim - Agricultura</title>
</head>

<body>
    <header class="header-page">
        <h1 class="header-title">Meu <span class="header-span">Jardim</span></h1>
    </header>

    <section class="hero">
        <h2 class="hero-title">Bem-vindo ao Meu Jardim</h2>
        <p class="hero-text">Aqui você encontra todas as informações necessárias para cultivar suas plantas com sucesso.
        </p>
        <a href="#" class="btn">Saiba mais</a>
    </section>

    <section class="contato">
        <div class="container">
            <form id="contact-form" class="contact-form">
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
                    <label for="estacao">Estação do Ano:</label>
                    <select id="estacao" name="estacao">
                        <option value="1">Primavera</option>
                        <option value="2">Estação 2</option>
                        <option value="3">Estação 3</option>
                    </select>
                </div>

                <button type="submit" class="btn-submit">Obter dados</button>
            </form>
        </div>
    </section>

    <section class="recursos">
        <div class="container">
            <h2 class="section-title">Recursos</h2>

            <div class="card-item">
                <h3 class="card-title">Regadura:</h3>
                <img src="./img/124361.png" alt="Imagem 1">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </div>

            <div class="card-item">
                <h3 class="card-title">Cuidados:</h3>
                <img src="./img/Cuidados-con-los-aceros-inoxidables.png" alt="Imagem 2">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </div>

            <div class="card-item">
                <h3 class="card-title">Benefícios:</h3>
                <img src="./img/5430664.png" alt="Imagem 3">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </div>

            <div class="card-item">
                <h3 class="card-title">Desvantagens:</h3>
                <img src="./img/8712072.png" alt="Imagem 4">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2023 Meu Jardim. Todos os direitos reservados.</p>
    </footer>
</body>

</html>
