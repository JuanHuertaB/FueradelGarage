<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jean
  Date: 07/11/2017
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Services - Regions List</title>
</head>
<body>
<h1>Users List</h1>
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
                <a href="regions?action=show&id=${region.id}">Show</a>
                <a href="regions?action=edit&id=${region.id}">Edit</a>
            </td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
