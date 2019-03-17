<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.03.2019
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>LabaNaLyam2</title>
  <style>
    body{
      background: gold;
      color: blue;
    }
  </style>
</head>
<body>
<h2>y = pow((4*ch(sqrt(abs(a/b))+3*arccos(d), c) </h2>
<form action="/servlet" method="get">
  <label>Input a:</label>
  <input type="text" name="a" />
  <br/>
  <label>Input b:</label>
  <input type="text" name="b" />
  <br/>
  <label>Input c:</label>
  <input type="text" name="c" />
  <br/>
  <label>Input d:</label>
  <input type="text" name="d" />
  <br/>
  <input type="submit" value="Сalculate" />
</form>
</body>
</html>
