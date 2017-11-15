
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="registrar">
    <div class="form-group">
        <s:textfield placeholder="Usuario" value="" name="user.name" cssClass="txt" cssStyle="margin-left: 8%;"/>
    </div>
    <div class="form-group">
        <s:password placeholder="Contraseña" value="" name="user.password" cssClass="txt"
                    cssStyle="margin-left: 8% !important;"/>
    </div>
    <div class="form-group">
        <s:textfield placeholder="Descripcion" value="" name="user.description" cssClass="txt"
                    cssStyle="margin-left: 8% !important;"/>
    </div>
    <s:submit value="Registrar" cssClass="btn btn-primary btn-lg btn-block"/>
</s:form>
</body>
</html>
