<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/20/2021
  Time: 12:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Contract Detail</title>
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
        <h1>Add new Contract Detail</h1>
<%--        <h2>--%>
<%--            <a href="contractDetail?action=contractDetail"> Back to List All Contract Detail</a>--%>
<%--        </h2>--%>

    </div>
    <div class="content" style="text-align: center">
        <form method="post">
            <table class="table">

                <tr>
                    <th>ID Contract:</th>
                    <td>
                        <input type="text" name="contractId" id="contractId" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>ID Attach Service:</th>
                    <td>
                        <input type="text" name="attachServiceId" id="attachServiceId" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Quantity:</th>
                    <td>
                        <input type="text" name="quantity" id="quantity" size="45"/>
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
