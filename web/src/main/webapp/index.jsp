<%--
  Created by IntelliJ IDEA.
  User: Mirek
  Date: 09.04.2019
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                <h1>Bootstrap Tutorial</h1>
                <p>Bootstrap is the most popular HTML, CSS, and JS framework for developing
                    responsive, mobile-first projects on the web.
                </p>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <h2>Striped Rows</h2>
            <form method="post" action="doItWithBook">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Tytuł</th>
                        <th>Autor</th>
                        <th>ISBN</th>
                        <th>Kategoria</th>
                        <th>Issue</th>
                        <th>Czyta</th>
                        <th>Akcja</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th>1</th>
                        <td>John</td>
                        <td>Doe</td>
                        <td>john@example.com</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td><input type="radio" class="form-check-input" name="optradio" value="1"></td>
                    </tr>
                    <tr>
                        <th>2</th>
                        <td>Mary</td>
                        <td>Moe</td>
                        <td>mary@example.com</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td><input type="radio" class="form-check-input" name="optradio" value="2"></td>
                    </tr>
                    <tr>
                        <th>3</th>
                        <td>July</td>
                        <td>Dooley</td>
                        <td>july@example.com</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td><input type="radio" class="form-check-input" name="optradio" value="3"></td>
                    </tr>
                    </tbody>
                </table>
                <div>
                    <button name="command" value="add" type="submit" class="btn btn-outline-primary btn-wide">Add</button>
                    <button name="command" value="edit" type="submit" class="btn btn-outline-primary btn-wide">Edit</button>
                    <button name="command" value="delete" type="submit" class="btn btn-outline-primary btn-wide">Delete</button>
                    <button name="command" value="show" type="submit" class="btn btn-outline-primary btn-wide">Show</button>
                </div>
                </form>
        </div>
    </div>
</div>
<footer>
</footer>
</body>
</html>
