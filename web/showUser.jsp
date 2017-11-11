<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 28/10/2017
  Time: 08:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Information</title>
</head>
<body>
<h1>About User</h1>
    <p>User Id: <c:out value="${user.id}"/> </p>
    <p>User Name: <c:out value="${user.name}"/> </p>
    <p>User Password <c:out value="${user.password}"/></p>
    <p>User Description <c:out value="${user.description}"/></p>
    <p>User Score<c:out value="${user.score}"/></p>
    <p><a href="users?action=index">Users List</a> </p>
</body>
</html>
