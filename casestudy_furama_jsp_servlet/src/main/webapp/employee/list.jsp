<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/20/2021
  Time: 3:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management Application</title>
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
<body style="background-color: lightblue">

<div class="container">
    <div class="header" style="text-align: center;">
        <h1>Employee Management</h1>
        <h2>
            <a href="/employee?action=create">Add New Employee</a>
        </h2>
    </div>
    <div class="content" style="text-align: center">

        <caption><h2>List of Employees</h2></caption>
        <table class="table">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Position ID</th>
                <th>Education Degree ID</th>
                <th>Division ID</th>
                <th>Birthday</th>
                <th>ID Card</th>
                <th>Salary</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Address</th>
            </tr>
            <c:forEach var="employee" items="${employeeList}">
                <tr>
                    <td><c:out value="${employee.employeeId}"/></td>
                    <td><c:out value="${employee.employeeName}"/></td>
                    <td><c:out value="${employee.positionId}"/></td>
                    <td><c:out value="${employee.educationDegreeId}"/></td>
                    <td><c:out value="${employee.divisionId}"/></td>
                    <td><c:out value="${employee.birthday}"/></td>
                    <td><c:out value="${employee.idCard}"/></td>
                    <td><c:out value="${employee.salary}"/></td>
                    <td><c:out value="${employee.phone}"/></td>
                    <td><c:out value="${employee.email}"/></td>
                    <td><c:out value="${employee.address}"/></td>
                    <td>
                        <a href="/employee?action=edit&id=${employee.employeeId}">Edit</a>
                        <a href="/employee?action=delete&id=${employee.employeeId}">Delete</a>

                    </td>
                </tr>
            </c:forEach>
        </table>

        <h3>
            <a href="/employee?action=search" style="color: red">Search Employee by Name</a>
        </h3>


    </div>
</div>

</body>
</html>
