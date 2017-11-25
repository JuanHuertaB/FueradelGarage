
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

                        <s:form action="updateEvent" method="update">
                            <fieldset>
                                <input type="hidden" name="action" value="editEvent"/>
                                <input type="text" name="event.id" value="${event.id}"/>
                                <input type="text" name="event.idUser" value="${event.idUser}"/>

                                <label for="event.nameEvent">Nombre evento</label>
                                <input type="text" name="event.nameEvent" id="event.nameEvent" value="${event.nameEvent}"/>

                                <label for="event.start">Inicio</label>
                                <input type="text" name="event.start" id="event.start" value="${event.start}"/>

                                <label for="event.end">Fin</label>
                                <input type="text" name="event.end" id="event.end" value="${event.end}"/>

                                <label for="event.place">Lugar</label>
                                <input type="text" name="event.place" id="event.place" value="${event.place}"/>

                                <label for="event.description">Description</label>
                                <input type="text" name="event.description" id="event.description" value="${event.description}"/>

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
