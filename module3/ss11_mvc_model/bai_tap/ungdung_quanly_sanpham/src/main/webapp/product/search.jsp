<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/13/2021
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
<h1>Search product by name</h1>
<p>
  <a href="/product">Back to product list</a>
</p>
<form method="post">
  <div class="row mt-2">
    <div class="col-4">
      <h4 style="color: green">Please enter the name of the product you are looking for: </h4>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-4">
      <input type="text" class="form-control" name="nameforsearch">
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-2">
      <input type="submit" class="form-control" value="Search product">
    </div>
  </div>
</form>
</body>
</html>