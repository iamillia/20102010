<%--
  Created by IntelliJ IDEA.
  User: sobaka
  Date: 2019-03-16
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Lab5</title>
  </head>
  <body>
  <br><img src="math.jpg">
  <form action="math" method="get">

    Enter parametr a:<br>
    <input type="number" name="a" value = "<%= session.getAttribute("a") %>" required><br>
    Enter parametr b:<br>
    <input type="number" name="b" value = "<%= session.getAttribute("b") %>" required><br>
    Enter parametr c:<br>
    <input type="number" name="c" value = "<%= session.getAttribute("c") %>" required><br>
    Enter parametr d:<br>
    <input type="number" name="d" value = "<%= session.getAttribute("d") %>" required><br>
    <button type="submit" value="Submit" style="height: 25px; width: 100px">Submit</button>
  </form>
  </body>
</html>
