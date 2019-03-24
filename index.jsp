<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.03.2019
  Time: 7:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="true" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Мой калькулятор</title>
  </head>
  <body>
  <%!
    double a, b, c, d;
    List<Double> a_list = new ArrayList();
    List<Double> b_list = new ArrayList();
    List<Double> c_list = new ArrayList();
    List<Double> d_list = new ArrayList();
    List<Double> result_list = new ArrayList();

    public double getResult(double a, double b, double c, double d) {
      double result = Math.pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);
      return result;
    }
    public boolean isNum(String s) {
      try {
        Double.parseDouble(s);
      } catch(NumberFormatException e) {
        return false;
      } catch(NullPointerException e) {
        return false;
      }
      return true;
    }
  %>
  <%
    String a_tmp, b_tmp, c_tmp, d_tmp;
    if (request.getParameter("a") == null && session.getAttribute("a") != null) {
      a_tmp = session.getAttribute("a").toString();
    } else {
      a_tmp = request.getParameter("a");
    }
    if (request.getParameter("b") == null && session.getAttribute("b") != null) {
      b_tmp = session.getAttribute("b").toString();
    } else {
      b_tmp = request.getParameter("b");
    }
    if (request.getParameter("c") == null && session.getAttribute("c") != null) {
      c_tmp = session.getAttribute("c").toString();
    } else {
      c_tmp = request.getParameter("c");
    }
    if (request.getParameter("d") == null && session.getAttribute("d") != null) {
      d_tmp = session.getAttribute("d").toString();
    } else {
      d_tmp = request.getParameter("d");
    }
    //
    if (a_tmp != null) {
      if (isNum(a_tmp)) { a = Double.parseDouble(a_tmp);} else {response.sendError(422);}
    } else { a = 1; }
    a_list.add(a);
    if (b_tmp != null) {
      if (isNum(b_tmp)) { b = Double.parseDouble(b_tmp);} else {response.sendError(422);}
    } else { b = 1; }
    b_list.add(b);
    if (c_tmp != null) {
      if (isNum(c_tmp)) { c = Double.parseDouble(c_tmp);} else {response.sendError(422);}
    } else { c = 1; }
    c_list.add(c);
    if (d_tmp != null) {
      if (isNum(d_tmp)) { d = Double.parseDouble(d_tmp);} else {response.sendError(422);}
    } else { d = 1; }
    d_list.add(d);
    result_list.add(getResult(a,b,c,d));
    //
    if(!session.isNew()) {
      session.setAttribute("a", a);
      session.setAttribute("b", b);
      session.setAttribute("c", c);
      session.setAttribute("d", d);
    }
  %>
  <p><img src="pictures/mathform.png" alt="Математическая формула"></p>
  <form action="index.jsp" method="get">
  <input type="text" name="a" value = "<%=a%>">
  <input type="text" name="b" value = "<%=b%>">
  <input type="text" name="c" value = "<%=c%>">
  <input type="text" name="d" value = "<%=d%>">
    <p3><input type="submit"></p3>
  </form>
  <table border="1">
    <tr><td>a</td><td>b</td><td>c</td><td>d</td><td>result</td></tr>
  <%
    for (int i = 0; i < result_list.size(); i++) {
      %>
  <tr>
    <td><%=a_list.get(i)%></td>
    <td><%=b_list.get(i)%></td>
    <td><%=c_list.get(i)%></td>
    <td><%=d_list.get(i)%></td>
    <td><%=result_list.get(i)%></td>
  </tr>
  <%}%>
  </table>
  </body>
</html>
