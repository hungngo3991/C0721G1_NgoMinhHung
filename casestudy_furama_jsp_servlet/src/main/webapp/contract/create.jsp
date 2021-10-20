<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/20/2021
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Contract</title>
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
        <h1>Add new Contract</h1>
        <h2>
            <a href="contract?action=contract"> Back to List All Contracts</a>
        </h2>

    </div>
    <div class="content" style="text-align: center">
        <form method="post">
            <table class="table">

                <tr>
                    <th>ID Employee:</th>
                    <td>
                        <input type="text" name="employeeId" id="employeeId" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>ID Customer:</th>
                    <td>
                        <input type="text" name="customerId" id="customerId" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>ID Service:</th>
                    <td>
                        <input type="text" name="serviceId" id="serviceId" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Contract Start Date:</th>
                    <td>
                        <input type="text" name="contractStartDate" id="contractStartDate" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Contract End Date:</th>
                    <td>
                        <input type="text" name="contractEndDate" id="contractEndDate" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Deposit:</th>
                    <td>
                        <input type="text" name="deposit" id="deposit" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Total Money:</th>
                    <td>
                        <input type="text" name="totalMoney" id="totalMoney" size="15"/>
                    </td>
                </tr>

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" value="Save"/>
                    </td>
                </tr>
            </table>
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
