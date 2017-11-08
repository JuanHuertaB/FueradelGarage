<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jean
  Date: 07/11/2017
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h1>About Region</h1>
<p>User Id: <c:out value="${user.id}"/> </p>
<p>User Name: <c:out value="${user.name}"/> </p>


<p><a href="users?action=index">Users List</a> </p>

</body>
</html>
