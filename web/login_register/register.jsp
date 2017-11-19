<%--
  Created by IntelliJ IDEA.
  User: juanc
  Date: 18/11/2017
  Time: 07:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>

<body>
<nav class="navbar navbar-expand-md bg-primary navbar-dark">
    <div class="container">
        <a class="navbar-brand text-white" href="#">Fuera del Garage</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
            <ul class="navbar-nav">
                <li class="nav-item bg-primary">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-bookmark-o"></i> Bookmarks</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-envelope-o"></i> Contacts</a>
                </li>
            </ul>
            <a class="btn navbar-btn btn-primary ml-2 text-white"><i class="fa d-inline fa-lg fa-user-circle-o"></i> Sign in</a>
        </div>
    </div>
</nav>
<div class="py-5 text-white w-100" style="background-image: url(&quot;C:/Users/juanc/Downloads/background-slide-1.jpg&quot;);">
    <div class="container h-50 col-md-10">
        <div class="p-1 w-100 h-75 align-self-center col-md-10 col-5 col-xl-5" style="transition: all 0.25s;">
            <h1 class="mb-4">Registrarse</h1>
            <form class="" method="post" action="https://formspree.io/">
                <div class="form-group text-left"> <label>Nombre de usuario</label>
                    <input type="email" name="email" class="form-control" placeholder="Usuario"> </div>
                <div class="form-group"> <label>Contraseña</label>
                    <input type="password" name="password" class="form-control" placeholder="Contraseña">
                    <div class="btn-group">
                        <a href="#" class="btn btn-primary">Músico</a>
                        <a href="#" class="btn btn-primary">Btn 2</a>
                        <a href="#" class="btn btn-primary">Btn 3</a>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Ingresar</button>
            </form>
        </div>
    </div>
</div>
<div class="py-5 text-center bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="">¿Eres músico?</h1>
                <h3 class="text-dark">Únete a la red de negocios de la industria musical</h3>
                <p class="lead">Se parte de la red online más grande de músicos en Latinoamerica.</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 p-4">
                <img class="img-fluid d-block rounded-circle mx-auto" src="C:/Users/juanc/Downloads/if_Technology_Mix_-_Final-16_998664.png">
                <p class="my-4" style="opacity: 0.5;"> </p>
                <p><b class="text-center">Conoce a más músicos</b>
                    <br> </p>
                <p class="my-4 lead">Unete a la comunidad y conoce a gente que comparte tu pasión por la música.</p>
            </div>
            <div class="col-md-4 p-4">
                <img class="img-fluid d-block rounded-circle mx-auto bg-light" src="C:/Users/juanc/Downloads/if_cards_contact_contacts_2714203.png">
                <p class="my-4"> </p>
                <p><b>Promociona tu Banda</b></p>
                <p class="my-4 lead">Completa la información de tu perfil y compartela con toda la comunidad.</p>
                <br> </div>
            <div class="col-md-4 p-4">
                <img class="img-fluid d-block rounded-circle mx-auto" src="C:/Users/juanc/Downloads/if_ad_416410(1).png">
                <p class="my-4"> </p>
                <p><b>Postula a ofertas</b></p>
                <p class="my-4 lead">Postula y consigue contratos los mejores contratos.</p>
                <br>
                <br> </div>
        </div>
    </div>
</div>
</body>

</html>