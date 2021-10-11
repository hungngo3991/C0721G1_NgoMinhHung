<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/11/2021
  Time: 9:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator App</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
<h1>Simple Calculator</h1>
<form method="post" action="/calculate">
    <fieldset>
        <legend>Calculator</legend>
        <div class="row">
            <div class="col-3">
                <div class="row">
                    <div class="col-3">
                        <label class="col-form-label">First operand: </label>
                    </div>
                    <div class="col-9">
                        <input type="text" class="form-control" name="firstN">
                    </div>
                </div>

                <div class="row">
                    <div class="col-3">
                        <label class="col-form-label">Operator: </label>
                    </div>
                    <div class="col-9">
                        <select class="form-select" name="operator">
                            <option value="+">Addition</option>
                            <option value="-">Subtraction</option>
                            <option value="*">Multiplication</option>
                            <option value="/">Division</option>
                        </select>
                    </div>
                </div>

                <div class="row">
                    <div class="col-3">
                        <label class="col-form-label">Second operand: </label>
                    </div>
                    <div class="col-9">
                        <input type="text" class="form-control" name="secondN">
                    </div>
                </div>

                <div class="row">
                    <div class="col-4">
                    </div>
                    <div class="col-4">
                        <input type="submit" class="form-control" value="calculate" style="border-radius: 5em">
                    </div>
                    <div class="col-4">
                    </div>
                </div>
            </div>
        </div>
    </fieldset>

</form>
</body>
</html>
