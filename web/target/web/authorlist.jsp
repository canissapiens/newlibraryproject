<%--
  Created by IntelliJ IDEA.
  User: Mirek
  Date: 09.04.2019
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Library - book list</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/custom.css">
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col">
            <div class="jumbotron">
                <h1>Smart Library</h1>
                <p>Chronimy twoją prywatność i nie przetwarzamy nadmiernie danych osobowych,
                    czyli jakoś przejmujemy się RODO.
                </p>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <h2></h2>
            <form method="post" action="doItWithBook">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>L.p</th>
                        <th>Name</th>
                        <th>From</th>
                        <th>V</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="author" items="${requestScope.authorlist}" varStatus="loop">
                        <tr>
                            <th>${loop.count}</th>
                            <td>${author.firstName} ${author.lastName}</td>
                            <td>${author.birthPlace}</td>
                            <td><input type="radio" class="form-check-input" name="optradio" value="${author.id_author}"></td>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                <div>
                    <button name="command" value="ADDAUTHOR" type="submit" class="btn btn-outline-primary btn-wide">Add
                    </button>
                    <button name="command" value="EDITAUTHOR" type="submit" class="btn btn-outline-primary btn-wide">Edit
                    </button>
                    <button name="command" value="SHOWAUTHOR" type="submit" class="btn btn-outline-primary btn-wide">Show
                    </button>
                    <button name="command" value="HOME" type="submit" class="btn btn-outline-primary btn-wide">Home
                    </button>

                </div>
            </form>
        </div>
    </div>
</div>
<footer>
    <div>&nbsp;</div>
</footer>
</body>
</html>
