<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sB" uri="/struts-bootstrap-tags"%>

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
            <a href="Contactus.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-envelope"></span>&nbsp;Contactanos</a>
            <a class="btn navbar-btn ml-2 text-white btn-secondary"><i class="fa d-inline fa-lg fa-user-circle-o"></i>&nbsp;Login</a>
        </div>
    </div>
</nav>
<div class="py-5" style="background-image: url(images/background-slide-inv.jpg);">
    <div class="container">
        <div class="row">
            <div class="align-self-center col-md-6 text-white">
                <h2 class="text-center" contenteditable="true">Conecta con músicos, managers y empresas!</h2>
                <h4 class="text-center" contenteditable="true"><p>Podras crear una convocatoria abierta para artistas nacionales, invitándolos a participar del proceso de evaluación. La plataforma te permitira hacer una selección responsable de forma agil, rapida, sencilla y amable, y conectar con los perfiles de cada una de las bandas. </p></h4>
            </div>
            <div class="col-md-6" id="book">
                <div class="card">
                    <div class="card text-white p-5 bg-dark">
                        <div class="card-body">
                            <h2 class="mb-4" contenteditable="true">Registro contratista</h2>
                            <s:form action="registrar" cssClass="bs-example form-horizontal" theme="bootstrap">
                                <img class="img-fluid d-block mx-auto" src="images/person.png" width="20%" height="20%">
                                <br>
                                <br>
                            <fieldset>
                                    <s:textfield label="Nickname" cssClass="col-lg-12" name="user.name"  placeholder="ID login"/>

                                    <s:textfield label="Nombre" cssClass="col-lg-12" name="user.firstName" placeholder="Ingrese su nombre"/>

                                    <s:textfield label="Apellidos" cssClass="col-lg-12" name="user.lastName" placeholder="Ingrese sus apellidos"/>

                                    <s:textfield label="Password" cssClass="col-lg-12" name="user.password" placeholder="Ingrese su clave"/>

                                    <s:textfield label="Descripcion" cssClass="col-lg-12" name="user.description" placeholder="120 caracteres como maximo"/>

                                    <s:textfield label="Video Url" cssClass="col-lg-12" name="user.video" placeholder="Direcion de videoUrl"/>
                                <div class="text-right">
                                    <input type="reset" Class="btn btn-default" value="Borrar información">
                                    <s:submit cssClass="btn btn-primary" value="Registrarme" data-toggle="modal" data-target="#themodal" />
                                </div>
                            </fieldset>
                            </s:form>
                        </div>
                    </div>
                </div>
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