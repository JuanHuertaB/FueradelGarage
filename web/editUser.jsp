
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Edit User</title>
</head>
<body>
<h1>Edit User</h1>
<h1 class="page-header">USER</h1>
<div class="responsive">
    <table class="table">
        <thead>
        <tr>
            <th class="text-center">ID</th>
            <th class="text-center">Name</th>
            <th class="text-center">Password</th>
            <th class="text-center">Description</th>

            <th class="text-center">Created By</th>
            <th class="text-center">Updated At</th>
            <th class="text-center">Updated By</th>
            <th class="text-center" colspan="2">Opciones</th>
        </tr>
        </thead>
        <jsp:useBean id="service" class="pe.com.fueradelgarage.models.GbService"/>
        <c:forEach var="user" items="${service.findUserById(user.id)}">
            <tbody>
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.pas}"/></td>
                <td><c:out value="${user.description}"/></td>

                <td class="text-center"><a class="btn btn-primary" href="<s:url action="editRole"><s:param name="id"><c:out value="${role.id}"/></s:param> </s:url>">Editar</a></td>
                <td class="text-center"><a class="btn btn-danger" href="#">Eliminar</a></td>
            </tr>
            </tbody>
        </c:forEach>
        <tfoot>
        <tr>
            <td colspan="9"><a class="btn btn-success" href="newRole.jsp">Agregar</a></td>
        </tr>
        </tfoot>
    </table>
</div>
</body>
</html>
