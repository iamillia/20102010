<%--
  Created by IntelliJ IDEA.
  User: Петя
  Date: 16.03.2019
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>startingPage</title>
    <style>
      body {
        background: antiquewhite;
      }
    </style>
  </head>
  <body>

  <form action="calculating" method="get">
    <input type="number" name="a1" required/><br>
    <input type="number" name="b1" required/><br>
    <input type="number" name="c1" required/><br>
    <input type="number" name="d1" required/><br>
    <input type="submit" name="calculate">
  </form>
  </body>
</html>
