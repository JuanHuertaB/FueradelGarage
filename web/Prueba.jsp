<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Fuera del Garage</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1>Lista de usuarios</h1>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>

<div class="container">
    <div class="row">


        <div class="col-md-12">
            <h4>Tabla de registros</h4>
            <div class="table-responsive">


                <table id="mytable" class="table table-bordred table-striped">

                    <thead>

                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Password</th>
                    <th>Descripción</th>
                    <th>Score</th>
                    <th>Edit</th>
                    <th>Delete</th>
                    </thead>
                    <tbody>

                    <jsp:useBean id="service" class="pe.com.fueradelgarage.models.GbService"/>
                    <c:forEach var="user" items="${service.findAllUsers()}">

                    <tbody>
                    <tr>
                        <td><c:out value="${user.id}"/></td>
                        <td><c:out value="${user.name}"/></td>
                        <td><c:out value="${user.password}"/></td>
                        <td><c:out value="${user.description}"/></td>
                        <td><c:out value="${user.score}"/></td>

                        <td><a href="<s:url action="edit"><s:param name="user.id"><c:out value="${user.id}"/></s:param></s:url>" class="btn btn-primary btn-xs">Editar</a></td>
                        <td><a href="delete.action?user.id=<c:out value="${user.id}"/>"><button class="btn btn-danger btn-xs">Delete</button></a></td>

                    </tr>
                    </tbody>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>