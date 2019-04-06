<%-- 
    Document   : index
    Created on : 01.04.2019, 8:56:11
    Author     : Polina
--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                double y=Math.pow((4*Math.cosh(Math.sqrt(Math.abs(a/b)))+3*Math.acos(d)),c);
      return y;
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

      a_tmp = request.getParameter("a");
      b_tmp = request.getParameter("b");
      c_tmp = request.getParameter("c");
      d_tmp = request.getParameter("d");
    //
    if (a_tmp != null) {
      if (isNum(a_tmp)) { a = Double.parseDouble(a_tmp);} else {response.sendError(422);}
    } else { a = 0; }
    a_list.add(a);
    if (b_tmp != null) {
      if (isNum(b_tmp)) { b = Double.parseDouble(b_tmp);} else {response.sendError(422);}
    } else { b = 0; }
    b_list.add(b);
    if (c_tmp != null) {
      if (isNum(c_tmp)) { c = Double.parseDouble(c_tmp);} else {response.sendError(422);}
    } else { c = 0; }
    c_list.add(c);
    if (d_tmp != null) {
      if (isNum(d_tmp)) { d = Double.parseDouble(d_tmp);} else {response.sendError(422);}
    } else { d = 0; }
    d_list.add(d);
    result_list.add(getResult(a,b,c,d));
  %>
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
