<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/contractor.css" type="text/css">
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/bootstrap-united.css" rel="stylesheet" />
    <title>FUERA DEL GARAGE</title>
</head>

<body style="background-color:#343a40;">
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#"><b>FUERA DEL GARAGE</b></a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse text-right justify-content-end" id="navbar2SupportedContent">
            <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>&nbsp;Inicio</a>
            <a href="contactus.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-envelope"></span>&nbsp;Contactanos</a>
        </div>
    </div>
</nav>
<div class="py-5 text-white opaque-overlay" style="background-image: url(images/background-slide-inv.jpg);">
    <div class="container">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <h1 class="text-gray-dark">Login</h1>
                <p class="lead mb-4">Ingrese sus credenciales para poder inicial sesion</p>
                <form class="" method="post" action="https://formspree.io/">
                    <div class="form-group"> <label>Nikname</label>
                        <input type="email" name="email" class="form-control" placeholder="Enter email"> </div>
                    <div class="form-group"> <label>Password</label>
                        <input type="password" name="password" class="form-control" placeholder="Password"> </div>
                    <button type="submit" class="btn btn-primary">Iniciar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="py-5 text-white" style="background-image: url(images/test_lily.jpg);">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <p class="lead"><i>"He estado usando Fuera del garage por un tiempo. No hay forma de que pueda dejarlo ahora o nunca. Y muchas personas estan haciendo lo mismo, realmente no entiendo como se genero esta idea, es genial."</i>
                    <br> </p>
                <p class="lead m-0"><b>Lily Jonhansen - Times</b></p>
            </div>
        </div>
    </div>
</div>
<div class="py-5 bg-dark text-white">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <form class="form-inline">
                    <div class="form-group"></div>
                </form>
            </div>
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
                <p>© Copyright 2017 Fuera del Garage - All rights reserved.</p>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>

</html>