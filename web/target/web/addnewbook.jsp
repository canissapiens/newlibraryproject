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
    <title>Library - book details</title>
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
            <h2>Add new book</h2>
            <form method="post" action="doItWithBook">
                <input type="hidden" name="newbookform" value="yes">
                <div class="form-group">
                    <label for="title">Title:</label>
                    <input type="text" name="title" value="<c:out value="${requestScope.bookDTO.title}"/>" class="form-control"
                           id="title">
                </div>

                <div class="form-group">
                    <label for="author">Author:</label>
                    <select name="optradio" class="custom-select" id="author">
                        <option value="X" selected>-- Select one --</option>

                        <c:forEach var="author" items="${requestScope.bookDTO.authors}" varStatus="loop">
                            <option value="${author.id_author}" ${requestScope.authorsselections.get(loop.count-1)}>${loop.count}. ${author.firstName} ${author.lastName}</option>
                        </c:forEach>

                    </select>
                </div>

                <div class="form-group">
                    <label for="year">Rok wydania:</label>
                    <input type="text" name="year" value="" class="form-control"
                           id="year">
                </div>

                <div class="form-group">
                    <label for="isbn">ISBN:</label>
                    <input type="text" name="isbn" value="" class="form-control"
                           id="isbn">
                </div>

                <div class="form-group">
                    <label for="pages">Pages:</label>
                    <input type="text" name="pages" value="" class="form-control"
                           id="pages">
                </div>

                <div class="form-group">
                    <label for="aid">Cathegory:</label>
                    <input type="text" name="cathegory" value="" class="form-control"
                           id="aid">
                </div>

                <div>
                    <button name="command" value="WRITEBOOK" type="submit" class="btn btn-outline-primary btn-wide">
                        Write
                    </button>

                    <button name="command" value="HOME" type="submit" class="btn btn-outline-primary btn-wide">
                        Home
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>
<footer>
</footer>
</body>
</html>