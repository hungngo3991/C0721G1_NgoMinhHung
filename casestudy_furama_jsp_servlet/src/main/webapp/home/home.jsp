<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 10/17/2021
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        li {
            margin-right: 110px;
        }
    </style>
</head>

<body style="background-color: black; background-size: cover">
<div class="container-fluid">
    <div class="header">

        <div class="row">
            <div class="col-3">
                <img style="width: 30%;padding: 5%"
                     src="/image/logo.jfif">

            </div>
            <div class="col-3"></div>
            <div class="col-3"></div>
            <div class="col-3" style="display: flex;align-items: center">
                <h4 style="color: #00FFFF">Ngô Minh Hùng</h4>
            </div>
        </div>

    </div>


    <div class="menu" style="background-color: #8FBC8F;height: 50px">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <ul style="list-style: none;display:flex ;padding-top: 12px">
                        <li><a href="/home/home.jsp">Home</a></li>
                        <li><a href="/employee">Employee</a></li>
                        <li><a href="/customer">Customer</a></li>
                        <li><a href="/service">Service</a></li>
                        <li><a href="/contract">Contract</a></li>
                        <li class="input-group" style="margin: -5px">
                            <input type="text" id="search" class="form-control" placeholder="Search">
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>

    <div>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-2" style="display: flex;flex-direction: column;margin-top: 40px">


                        <a href="/customer?action=create" class="btn btn-primary" data-toggle="modal"
                           style="margin: 1%"><i
                        ></i> <span>Add new Customer</span></a>
                        <a href="/service?action=create" class="btn btn-primary" data-toggle="modal" style="margin: 1%"><i
                        ></i> <span>Add new Service</span></a>
                        <a href="/employee?action=create" class="btn btn-primary" data-toggle="modal"
                           style="margin: 1%"><i
                        ></i> <span>Add new Employee</span></a>
                        <a href="/contract?action=create" class="btn btn-primary" data-toggle="modal"
                           style="margin: 1%"><i
                        ></i> <span>Add new Contract</span></a>
                        <a href="/contractDetail?action=create" class="btn btn-primary" data-toggle="modal"
                           style="margin: 1%"><i
                        ></i> <span>Add new Contract Detail</span></a>

                    </div>
                    <div class="col-10" style="margin-top: 30px">
                        <p style="color: #FFFACD">What is Lorem Ipsum?
                            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has
                            been the industry's standard dummy text ever since the 1500s, when an unknown printer took a
                            galley of type and scrambled it to make a type specimen book. It has survived not only five
                            centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
                            It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum
                            passages, and more recently with desktop publishing software like Aldus PageMaker including
                            versions of Lorem Ipsum.

                            Why do we use it?
                            It is a long established fact that a reader will be distracted by the readable content of a
                            page when looking at its layout. The point of using Lorem Ipsum is that it has a
                            more-or-less normal distribution of letters, as opposed to using 'Content here, content
                            here', making it look like readable English. Many desktop publishing packages and web page
                            editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will
                            uncover many web sites still in their infancy. Various versions have evolved over the years,
                            sometimes by accident, sometimes on purpose (injected humour and the like).


                            Where does it come from?
                            Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece
                            of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock,
                            a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure
                            Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the
                            word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from
                            sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and
                            Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very
                            popular during the Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor sit
                            amet..", comes from a line in section 1.10.32.

                            The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those
                            interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are
                            also reproduced in their exact original form, accompanied by English versions from the 1914
                            translation by H. Rackham.

                            Where can I get some?
                            There are many variations of passages of Lorem Ipsum available, but the majority have
                            suffered alteration in some form, by injected humour, or randomised words which don't look
                            even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be
                            sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum
                            generators on the Internet tend to repeat predefined chunks as necessary, making this the
                            first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined
                            with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable.
                            The generated Lorem Ipsum is therefore always free from repetition, injected humour, or
                            non-characteristic words etc.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="footer">
        <h2 style="text-align: center;color: #00FFFF">Let's make travel great again</h2>
    </div>

</div>
</body>


</html>


