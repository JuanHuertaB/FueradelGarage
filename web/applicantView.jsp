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
        <a class="navbar-brand" href="#"><i class="fa d-inline fa-lg fa-cloud"></i><b>  Fuera del garage</b></a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false"
                aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link text-white" href="#"><i class="fa d-inline fa-lg fa-calendar"></i> Oferta</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-hand-o-right"></i> Postulaciones</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-music"></i> Eventos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-align-left"></i> Ranking</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa d-inline fa-lg fa-user"></i> Perfil </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="py-0 text-white bg-secondary">
    <div class="form-group" align="right">
        <button type="submit">Sign out</button>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="display-1" contenteditable="true">Postulaciones</h1>
            </div>
        </div>
    </div>
</div>
<nav class="navbar navbar-expand-md bg-secondary navbar-dark">
    <div class="container">
        <form class="form-inline m-0">
            <button type="submit" class="btn btn-primary">Lugar</button>
            <input type="lugar" name="lugar" class="form" placeholder=""> </form>
        <form class="form-inline m-0">
            <button class="btn btn-primary" type="submit">Fecha</button>
            <input type="palabra" name="palabra" class="form" placeholder=""> </form>
    </div>
    <form class="form-inline m-0" size="20"> <i class="fa d-inline fa-lg fa-search"></i> </form>
</nav>
<div class="py-5 bg-primary text-white">
    <div class="row">
        <div class="col-md-6">
            <h1 align="center" class="display-5" name="titulo de la oferta">Título</h1>
        </div>
        <div class="col-md-6"> <label>Estado:</label> <label for="estado"></label></div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <form style="opacity: 10;">
                    <div class="form-group"> <label for="InputName">Lugar:</label> </div>
                    <div> <label for="InputLugar"></label> </div>
                    <div class="form-group"> <label for="InputEmail1">Fecha:</label> </div>
                    <div><label for="InputFecha"></label> </div>
                </form>
            </div>
            <div class="col-md-6" align="center">
                <div class="form-group">
                    <button class="col-md-6" type="submit">Detalles</button>
                </div>
                <div class="form-group">
                    <button type="submit" class="col-md-6">Eliminar</button>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
    </div>
</div>
</body>

</html>