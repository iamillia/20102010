<%--
  Created by IntelliJ IDEA.
  User: vicwa
  Date: 23.03.2019
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Cookie[] arr = request.getCookies();
  String a = "0", b = "0", c = "0", d = "0";
  for(Cookie i : arr)
    switch (i.getName()){
      case "a":
        a = i.getValue();
        break;
      case "b":
        b = i.getValue();
        break;
      case "c":
        c = i.getValue();
        break;
      case "d":
        d = i.getValue();
    }
%>
<html>
<head>
  <title>Calculator.com</title>
</head>
<body>
<h1>Calculator</h1>
<form method="get" action='Servlet'>
  <p align="center" class="text">Параметр а: <input name="a", value=<%=a%>></p>
  <p align="center" class="text">Параметр b: <input name="b", value=<%=b%>></p>
  <p align="center" class="text">Параметр c: <input name="c", value=<%=c%>></p>
  <p align="center" class="text">Параметр d: <input name="d", value=<%=d%>></p>
  <p align="center"><input value="Посчитать" type="submit"></p>
</form>
</body>
</html>
