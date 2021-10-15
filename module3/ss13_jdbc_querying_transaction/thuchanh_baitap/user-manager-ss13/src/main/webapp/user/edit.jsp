<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/14/2021
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="header" style="text-align: center;">
        <h1>Edit User</h1>
        <h2>
            <a href="user?action=user"> Back to List All Users</a>
        </h2>

    </div>
    <div class="content" style="text-align: center">


        <form method="post">
            <fieldset>
                <legend>User information</legend>
                <div class="row justify-content-center">
                    <div class="col-auto">
                        <table class="table table-responsive">
                            <c:if test="${user != null}">
                                <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>
                            </c:if>
                            <tr>
                                <th>User Name:</th>
                                <td>
                                    <input type="text" name="name" value="<c:out value='${user.name}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>User Email:</th>
                                <td>
                                    <input type="text" name="email" value="<c:out value='${user.email}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Country:</th>
                                <td>
                                    <input type="text" name="country" value="<c:out value='${user.country}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" value="Save"/>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </fieldset>
        </form>
        <h3>
            <c:if test='${requestScope["message"] != null}'>
                <span style="color: coral" class="message">${requestScope["message"]}</span>
            </c:if>
        </h3>

    </div>

</div>
</body>
</html>
