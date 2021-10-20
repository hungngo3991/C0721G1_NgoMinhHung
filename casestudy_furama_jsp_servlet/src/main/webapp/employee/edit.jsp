<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/20/2021
  Time: 3:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>
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
        <h1>Edit Employee</h1>
        <h2>
            <a href="employee?action=employee"> Back to List All Employees</a>
        </h2>

    </div>
    <div class="content" style="text-align: center">


        <form method="post">
            <fieldset>
                <legend>Employee information</legend>
                <div class="row justify-content-center">
                    <div class="col-auto">
                        <table class="table table-responsive">
                            <c:if test="${existingEmployee != null}">
                                <input type="hidden" name="id" value="<c:out value='${existingEmployee.employeeId}' />"/>
                            </c:if>

                            <tr>
                                <th>Employee Name:</th>
                                <td>
                                    <input type="text" name="name" value="<c:out value='${existingEmployee.employeeName}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Position Id:</th>
                                <td>
                                    <input type="text" name="positionId" value="<c:out value='${existingEmployee.positionId}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Education Degree Id:</th>
                                <td>
                                    <input type="text" name="educationDegreeId" value="<c:out value='${existingEmployee.educationDegreeId}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Division Id:</th>
                                <td>
                                    <input type="text" name="divisionId" value="<c:out value='${existingEmployee.divisionId}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Birthday:</th>
                                <td>
                                    <input type="text" name="birthday" value="<c:out value='${existingEmployee.birthday}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Id Card:</th>
                                <td>
                                    <input type="text" name="idCard" value="<c:out value='${existingEmployee.idCard}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Salary:</th>
                                <td>
                                    <input type="text" name="salary" value="<c:out value='${existingEmployee.salary}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Phone:</th>
                                <td>
                                    <input type="text" name="phone" value="<c:out value='${existingEmployee.phone}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Email:</th>
                                <td>
                                    <input type="text" name="email" value="<c:out value='${existingEmployee.email}' />"
                                    />
                                </td>
                            </tr>
                            <tr>
                                <th>Address:</th>
                                <td>
                                    <input type="text" name="address" value="<c:out value='${existingEmployee.address}' />"
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
