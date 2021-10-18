<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/18/2021
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Management Application</title>
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
        <h1>Customer Management</h1>
        <h2>
            <a href="/customer?action=create">Add New Customer</a>
        </h2>
    </div>
    <div class="content" style="text-align: center">

        <caption><h2>List of Customers</h2></caption>
        <table class="table">
            <tr>
                <th>ID</th>
                <th>TypeID</th>
                <th>Name</th>
                <th>Birthday</th>
                <th>Gender</th>
                <th>IdCard</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Address</th>
            </tr>
            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td><c:out value="${customer.customerID}"/></td>
                    <td><c:out value="${customer.customerTypeID}"/></td>
                    <td><c:out value="${customer.customerName}"/></td>
                    <td><c:out value="${customer.birthday}"/></td>
                    <td><c:out value="${customer.gender}"/></td>
                    <td><c:out value="${customer.idCard}"/></td>
                    <td><c:out value="${customer.phone}"/></td>
                    <td><c:out value="${customer.email}"/></td>
                    <td><c:out value="${customer.address}"/></td>
                    <td>
                        <a href="/customer?action=edit&id=${customer.customerID}">Edit</a>
                        <a href="/customer?action=delete&id=${customer.customerID}">Delete</a>

                    </td>
                </tr>
            </c:forEach>
        </table>

        <h3>
            <a href="/customer?action=search" style="color: red">Search Customer by Name</a>
        </h3>


    </div>
</div>
</body>
</html>
