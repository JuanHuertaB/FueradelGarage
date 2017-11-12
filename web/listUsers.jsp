<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 14/10/2017
  Time: 09:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>GB Services - Users List</title>
</head>
<body>
    <h1>Regions List</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Password</th>
            <th>Description</th>
            <th>Score</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.password}"/></td>
                <td><c:out value="${user.description}"/></td>
                <td><c:out value="${user.score}"/></td>
                <td>
                    <a href="users?action=show&id=${user.id}">Show</a>
                    <a href="users?action=edit&id=${user.id}">Edit</a>
                    <a href="users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>

        </c:forEach>

    </table>
    <a href="users?action=new">New User</a>
</body>
</html>
