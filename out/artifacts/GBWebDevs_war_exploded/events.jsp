<%--
  Created by IntelliJ IDEA.
  User: Jean
  Date: 18/11/2017
  Time: 07:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>

<body>
<nav class="navbar navbar-expand-md bg-primary navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#"><i class="fa d-inline fa-lg fa-cloud"></i><b>Fuera del Garage</b></a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false"
                aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-bookmark-o"></i>Ofertas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-bookmark-o"></i> Postulaciones</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-bookmark-o"></i>Eventos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-bookmark-o"></i>Rankin</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-envelope-o"></i>Perfil</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="py-5 text-white bg-secondary">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="display-1">Eventos</h1>
            </div>
        </div>
    </div>
</div>
<nav class="navbar navbar-expand-md bg-secondary navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Lugar&nbsp;</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <form class="form-inline m-0">
                <input class="form-control mr-2" type="text" placeholder="Text">
                <a class="navbar-brand" href="#">Fecha&nbsp;</a>
                <input class="form-control mr-2" placeholder="Text" type="text"> </form>
        </div>
        <a class="btn btn-primary" href="">BUSCAR </a>
    </div>
</nav>
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h1 class="text-center">Evento1</h1>
                <div class="row">
                    <div class="col-md-12">
                        <center>
                            <a class="btn btn-primary text-center" href="">Ver </a>
                        </center>
                    </div>
                </div>
                <div class="row">
                    <center>
                        <div class="col-md-12">
                            <img class="img-fluid d-block w-50" src="https://pingendo.com/assets/photos/wireframe/photo-1.jpg"> </div>
                    </center>
                </div>
            </div>
            <div class="col-md-6">
                <h1 class="text-center">Evento1</h1>
                <div class="row">
                    <div class="col-md-12">
                        <center>
                            <a class="btn btn-primary text-center" href="">Ver </a>
                        </center>
                    </div>
                </div>
                <div class="row">
                    <center>
                        <div class="col-md-12">
                            <img class="img-fluid d-block w-50" src="https://pingendo.com/assets/photos/wireframe/photo-1.jpg"> </div>
                    </center>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h1 class="text-center">Ver</h1>
                    <div class="row">
                        <div class="col-md-12">
                            <center>
                                <a class="btn btn-primary text-center" href="">Ver </a>
                            </center>
                        </div>
                    </div>
                    <div class="row">
                        <center>
                            <div class="col-md-12">
                                <img class="img-fluid d-block w-50" src="https://pingendo.com/assets/photos/wireframe/photo-1.jpg"> </div>
                        </center>
                    </div>
                </div>
                <div class="col-md-6">
                    <h1 class="text-center">Evento1</h1>
                    <div class="row">
                        <div class="col-md-12">
                            <center>
                                <a class="btn btn-primary text-center" href="">Button </a>
                            </center>
                        </div>
                    </div>
                    <div class="row">
                        <center>
                            <div class="col-md-12">
                                <img class="img-fluid d-block w-50" src="https://pingendo.com/assets/photos/wireframe/photo-1.jpg"> </div>
                        </center>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</div>
<div class="py-5 bg-dark text-white">
    <div class="container">
        <div class="row">
            <div class="col-4 col-md-1 align-self-center">
                <a href="https://www.facebook.com" target="_blank"><i class="fa fa-fw fa-facebook fa-3x text-white"></i></a>
            </div>
            <div class="col-4 col-md-1 align-self-center">
                <a href="https://twitter.com" target="_blank"><i class="fa fa-fw fa-twitter fa-3x text-white"></i></a>
            </div>
            <div class="col-4 col-md-1 align-self-center">
                <a href="https://www.instagram.com" target="_blank"><i class="fa fa-fw fa-instagram text-white fa-3x"></i></a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 mt-3 text-center">
                <p>Â© Copyright 2017 FueradelGarage - All rights reserved.</p>
            </div>
        </div>
    </div>
</div>
</body>

</html>
