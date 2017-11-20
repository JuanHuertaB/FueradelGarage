
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<h1>Edit User</h1>
<h1 class="page-header">USER</h1>
<div class="responsive">
    <b:container>
        <div style="padding-bottom: 100px">
            <div cssClass="row">
                <br>
                <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                    <img class="featurette-image img-responsive center-block" src="img/ahorro.jpg" style="padding-top: 35px; padding-bottom: 35px">
                </div>
                <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                    <div cssClass="container col-md-8">

                        <s:form action="updateUser" method="update">
                            <fieldset>
                                <input type="hidden" name="action" value="edit"/>
                                <input type="hidden" name="user.id" value="${user.id}"/>

                                <label for="name">Nickname</label>
                                <input type="text" name="user.name" id="name" value="${user.name}"/>

                                <label for="name">Nombres</label>
                                <input type="text" name="user.firstName" id="user.firstName" value="${user.firstName}"/>

                                <label for="name">Apellidos</label>
                                <input type="text" name="user.lastName" id="user.lastName" value="${user.lastName}"/>

                                <label for="name">Password</label>
                                <input type="text" name="user.password" id="user.password" value="${user.password}"/>

                                <label for="name">Description</label>
                                <input type="text" name="user.description" id="user.description" value="${user.description}"/>

                                <label for="name">Video Url</label>
                                <input type="text" name="user.video" id="user.video" value="${user.video}"/>

                                <input type="submit"/>

                            </fieldset>
                        </s:form>
                    </div>
                </div>
            </div>
        </div>
    </b:container>
</div>
</body>
</html>
