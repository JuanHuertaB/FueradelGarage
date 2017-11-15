<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <sb:head includeScripts="false" includeScriptsValidation="false"/>
    <sj:head jqueryui="true" />
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/bootstrap-united.css" rel="stylesheet" />

    <title>GB Services - Users List</title>
</head>
<body>
    <h1>USER List</h1>
    <table>
        <tr>
            <th class="center-align">ID</th>
            <th class="center-align">Name</th>
            <th class="center-align">Password</th>
            <th class="center-align">Description</th>
            <th class="center-align" colspan="2">Opciones</th>
        </tr>

        <jsp:useBean id="service" class="pe.com.fueradelgarage.models.GbService"/>
        <c:forEach var="user" items="${service.findAllUsers()}">
    <!--c:forEach var="user" items="{service.findAllUsers()}">-->

            <tbody>
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.password}"/></td>
                <td><c:out value="${user.description}"/></td>
                <td><c:out value="${user.score}"/></td>

                <!--<td class="center-align"><a cssClass="btn btn-primary" href="<s:url action="editar"><s:param name="user.id"><c:out value="${user.id}"/></s:param> </s:url>">Editar</a></td>-->
                <td class="center-align"><a cssClass="btn btn-primary" href="editUser.jsp?user.id=<c:out value="${user.id}"/>"><button class="button-delete">Edit</button></a></td>
                <td class="center-align"><a cssClass="btn btn-primary" href="delete.action?user.id=<c:out value="${user.id}"/>"><button class="button-delete">Delete</button></a></td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</body>
</html>
