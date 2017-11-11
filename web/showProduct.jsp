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
    <h1>Product Information</h1>
    <p>Product Name: <s:property value="name"/></p>
    <p>Product Description: <s:property value="description"/></p>
    <p>Product Price: <s:property value="price"/></p>
    <p>Supplier Email: <s:property value="supplierEmail"/> </p>
</body>
</html>
