<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/14/2021
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
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
<h1>Search User by Country</h1>
<c:if test="${empty userSearch}">
    <h3 style="color: red">No results were found</h3>
    <a href="user?action=user">Back to List All Users</a>
</c:if>
<c:if test="${not empty userSearch}">
    <h3>
        <c:if test='${requestScope["message"] != null}'>
            <span style="color: coral" class="message">${requestScope["message"]}</span>
        </c:if>
    </h3>
    <h3>
        <a href="user?action=user">Back to List All Users</a>
    </h3>


    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Country</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope['userSearch']}" var="userSearch">
            <tr>
                <td>${userSearch.getId()}</td>
                <td>${userSearch.getName()}</td>
                <td>${userSearch.getEmail()}</td>
                <td>${userSearch.getCountry()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</c:if>
</body>
</html>
