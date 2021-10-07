<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/7/2021
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/display-discount">
    <label>Enter product description: </label>
    <input type="text" name="productdescription"><br>
    <label>Enter list price: </label>
    <input type="text" name="listprice"><br>
    <label>Enter discount percent(%): </label>
    <input type="text" name="discountpercent"><br>
    <input type="submit" value="display discount">
</form>
</body>
</html>
