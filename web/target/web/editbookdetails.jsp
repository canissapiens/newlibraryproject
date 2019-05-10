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
    <title>Library - edit book</title>
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
            <h2>Book details</h2>
            <form method="get" action="doItWithBook">
                <div class="form-group">
                    <label for="title">Title:</label>
                    <input type="text" value="${requestScope.bookDTO.title}" class="form-control" id="title">
                </div>
                <div class="form-group">
                    <label for="author">Author:</label>
                    <input type="text" value="${requestScope.bookDTO.author}" class="form-control" id="author">
                </div>

                <div class="form-group">
                    <label for="year">Rok wydania:</label>
                    <input type="text" value="${requestScope.bookDTO.issueYear}" class="form-control" id="year"
                           readonly>
                </div>

                <div class="form-group">
                    <label for="isbn">ISBN:</label>
                    <input type="text" value="${requestScope.bookDTO.isbn}" class="form-control" id="isbn">
                </div>

                <div>
                    <button name="command" value="add" type="submit" class="btn btn-outline-primary btn-wide">Add
                    </button>
                    <button name="command" value="edit" type="submit" class="btn btn-outline-primary btn-wide">Edit
                    </button>
                    <button name="command" value="delete" type="submit" class="btn btn-outline-primary btn-wide">Delete
                    </button>
                    <button name="command" value="show" type="submit" class="btn btn-outline-primary btn-wide">Show
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>
<footer>
    <footer>
</body>
</html>