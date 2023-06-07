<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>
    <header>
        <h1 class="box-animation">Login</h1>
    </header>

    <main class="container">
        <form action="#" method="POST">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" placeholder="Digite seu username">
            </div>

            <div class="form-group">
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" placeholder="Digite sua senha">
            </div>

            <button type="submit" class="button">Entrar</button>
        </form>

        <p>Nao tem uma conta? <a href="./agro.jsp">Cadastre-se</a></p>
    </main>
</body>

</html>