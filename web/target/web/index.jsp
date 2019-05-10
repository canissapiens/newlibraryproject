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
                        <th>Title</th>
                        <th>Autor</th>
                        <th>ISBN</th>
                        <th>Kategoria</th>
                        <th>Issue</th>
                        <th>Czyta</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="book" items="${requestScope.booklist}" varStatus="loop">
                        <tr>
                            <th>${loop.count}</th>
                            <td>${book.title}</td>
                            <td>${book.author.firstName} ${book.author.lastName}</td>
                            <td>${book.isbn}</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td><input type="radio" class="form-check-input" name="optradio" value="${book.id_book}"></td>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                <div>
                    <button name="command" value="ADDBOOK" type="submit" class="btn btn-outline-primary btn-wide">Add
                    </button>
                    <button name="command" value="EDITBOOK" type="submit" class="btn btn-outline-primary btn-wide">Edit
                    </button>
                    <button name="command" value="DELETE" type="submit" class="btn btn-outline-primary btn-wide">
                        Delete
                    </button>
                    <button name="command" value="SHOWBOOK" type="submit" class="btn btn-outline-primary btn-wide">Show
                    </button>
                    <button name="command" value="ALLAUTHORS" type="submit" class="btn btn-outline-primary btn-wide">Authors
                    </button>
                    <button name="command" value="BORROWERS" type="submit" class="btn btn-outline-primary btn-wide">Borrowers
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
