<%-- 
    Document   : mainPage
    Created on : 30.03.2019, 20:05:26
    Author     : Даниил
--%>

<%@page import="lab_6.Iteration"%> 
<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.HashMap"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
   Cookie[] cookies = null;
   HashMap<String, String> cookiesTable = new HashMap<>();
   
   cookies = request.getCookies();

   if( cookies != null ) {
      for(Cookie c : cookies)
      {
          cookiesTable.put(c.getName(), c.getValue());
      }
   }
%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
        <link rel ="icon" href ="images/cat.jpg"
              type = "image/gif/jpg">
    </head>
    <body>
        <img src="images/formula.PNG" width="267" height="29" alt="formula"/>
        <hr align="center"/>
        <form action="CountServlet" method="get">
            <p>a: from
            <input type="text" name="fromA" value="<%= cookiesTable.getOrDefault("fromA", "0") %>">
            to 
            <input type="text" name="toA" value="<%= cookiesTable.getOrDefault("toA", "1") %>">
            step
            <input type="text" name="stepA" value="<%= cookiesTable.getOrDefault("stepA", "1") %>">
            </p>
            <p>
            b: from
            <input type="text" name="fromB" value="<%= cookiesTable.getOrDefault("fromB", "0") %>">
            to 
            <input type="text" name="toB" value="<%= cookiesTable.getOrDefault("toB", "1") %>">
            step
            <input type="text" name="stepB" value="<%= cookiesTable.getOrDefault("stepB", "1") %>">
            </p>
            <p>
            c: from
            <input type="text" name="fromC" value="<%= cookiesTable.getOrDefault("fromC", "0") %>">
            to 
            <input type="text" name="toC" value="<%= cookiesTable.getOrDefault("toC", "1") %>">
            step
            <input type="text" name="stepC" value="<%= cookiesTable.getOrDefault("stepC", "1") %>">
            </p>
            d: from
            <input type="text" name="fromD" value="<%= cookiesTable.getOrDefault("fromD", "0") %>">
            to 
            <input type="text" name="toD" value="<%= cookiesTable.getOrDefault("toD", "1") %>">
            step
            <input type="text" name="stepD" value="<%= cookiesTable.getOrDefault("stepD", "1") %>">
            <p><input type="submit" value="result"></p>
        </form>
        <hr align="center"/>
        <style>
            table {
                width: 50%; /* Ширина таблицы */
                background: white; /* Цвет фона таблицы */
                border-spacing: 1px; /* Расстояние между ячейками */
            }
            td, th {
                padding: 5px; /* Поля вокруг текста */
            }
        </style>
        <table border="1">
            <tr>
                <th>  a  </th>
                <th>  b  </th>
                <th>  c  </th>
                <th>  d  </th>
                <th>  y  </th>
            </tr>
                
            <%ArrayList<Iteration> std
                            = (ArrayList<Iteration>) session.getAttribute("Result");
            if(std != null)
                    for (Iteration s : std) {%> 
                <tr>
                    <th> <%=s.a%> </th>
                    <th> <%=s.b%> </th>
                    <th> <%=s.c%> </th>
                    <th> <%=s.d%> </th>
                    <th> <%=s.y%> </th>
                </tr>
            <%}%>
    </body>
</html>
