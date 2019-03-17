<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.03.2019
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Калькулятор</title>
  </head>
  <body>
  <h3>Формула:</h3>
  <p><img src="pictures/math.png" alt="Математическая формула"></p>
  <h3>Введите параметры:</h3>
  <form action="/servlet">
    <input type="text" name="a">
    <input type="text" name="b">
    <input type="text" name="c">
    <input type="text" name="d">
    <input type="submit">
    <p><img src="pictures/hard.jpg" alt="Слоожно"></p>
  </form>
  </body>
</html>
