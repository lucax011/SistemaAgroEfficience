<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>
    <header>
        <h1 class="box-animation">Cadastro</h1>
    </header>

    <main class="container">
        <form action="#" method="POST">
            <div class="form-group">
                <label for="username">Usuário:</label>
                <input type="text" id="username" name="username" placeholder="Digite seu usuário">
            </div>

            <div class="form-group">
                <label for="email">E-mail:</label>
                <input type="email" id="email" name="email" placeholder="Digite seu e-mail">
            </div>

            <div class="form-group">
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" placeholder="Digite sua senha">
            </div>

            <button type="submit" class="button">Cadastrar</button>
        </form>

        <p>Já possui uma conta? <a href="login.html">Faça login</a></p>
    </main>
</body>

</html>