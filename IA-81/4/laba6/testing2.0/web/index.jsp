<%--
  Created by IntelliJ IDEA.
  User: Петя
  Date: 24.03.2019
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static java.lang.Math.pow" %>
<%@ page import="static java.lang.Math.sinh" %>
<%@ page import="static java.lang.StrictMath.log10" %>
<%!double a;
   double b;
   double c;
   double d;
%>
<%
  String a1 = request.getParameter("a");
  String b1 = request.getParameter("b");
  String c1 = request.getParameter("c");
  String d1 = request.getParameter("d");
  if(a1 == null){a = 1;}else a = Double.parseDouble(a1);
  if(b1 == null){b = 1;}else b = Double.parseDouble(b1);
  if(c1 == null){c = 1;}else c = Double.parseDouble(c1);
  if(d1 == null){d = 1;}else d = Double.parseDouble(d1);
  if(c == 0){
    response.sendError(422, "c != 0 exception" );
  }
  else if (b==0){
    response.sendError(422,"b != 0 exception");
  }
  else if (d == 0){
    response.sendError(422, "d != 0 exception");
  }
  else if (a == 0){
    response.sendError(422, "a != 0 exception");
  }
%>
<html>
  <head>
    <title>Calculating</title>
    <style>
      body{
      background: antiquewhite;
    }</style>
  </head>
  <body>
  <img src="https://rangerrick.org/wp-content/uploads/2018/04/RR-Red-Panda-Aug-2016.jpg" height="200" width="400">
  <h2>pow(a,b)/sinh(Math.abs(b))) + 4* (log10(c)/ pow(d,(1.0/4)</h2>
  <form method ="post" action="index.jsp">
    Choose a  <input type="Number" name ="a" required value=<%=a%> ><br/><br/>
    Choose b  <input type="Number" name ="b" required value=<%=b%>><br/><br/>
    Choose c  <input type="Number" name ="c" required value=<%=c%>><br/><br/>
    Choose d  <input type="Number" name ="d" required value=<%=d%>><br/><br/>
    <input type ="submit" value="calculating">
  </form>
  <hr>
  <form>
    <table border="1" width="15%" cellpadding="5">
      <tr>
        <th>a</th>
        <th>b</th>
        <th>c</th>
        <th>d</th>
        <th>result</th>
      </tr>
      <tr>
        <td> <% out.print(a); %></td>
        <td> <% out.print(b); %></td>
        <td> <% out.print(c); %></td>
        <td> <% out.print(d); %></td>
        <td> <%out.print((pow(a,b)/sinh(Math.abs(b))) + 4 * (log10(c)/ pow(d,(1.0/4))));%></td>
      </tr>
    </table>
  </form>
  </body>
</html>