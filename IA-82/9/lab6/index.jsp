<%--
  Created by IntelliJ IDEA.
  User: Alex Rogov
  Date: 23.03.2019
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
double aFrom,
        aTo,
        aStep,
        bFrom,
        bTo,
        bStep,
        cFrom,
        cTo,
        cStep,
        dFrom,
        dTo,
        dStep,
        result;
double getResult(double a, double b, double c, double d) {
    return Math.sqrt(Math.abs(Math.sin(a)-(4*Math.log(b))/Math.pow(c, d)));
}
%>
<%
  String aF = request.getParameter("aFrom") == null && session.getAttribute("aFrom") != null ?
          session.getAttribute("aFrom").toString() : request.getParameter("aFrom");

  String aT = request.getParameter("aTo") == null && session.getAttribute("aTo") != null ?
          session.getAttribute("aTo").toString() : request.getParameter("aTo");

  String aS = request.getParameter("aStep") == null && session.getAttribute("aStep") != null ?
          session.getAttribute("aStep").toString() : request.getParameter("aStep");

  String bF = request.getParameter("bFrom") == null && session.getAttribute("bFrom") != null ?
          session.getAttribute("bFrom").toString() : request.getParameter("bFrom");

  String bT = request.getParameter("bTo") == null && session.getAttribute("bTo") != null ?
          session.getAttribute("bTo").toString() : request.getParameter("bTo");

  String bS = request.getParameter("bStep") == null && session.getAttribute("bStep") != null ?
          session.getAttribute("bStep").toString() : request.getParameter("bStep");

  String cF = request.getParameter("cFrom") == null && session.getAttribute("cFrom") != null ?
          session.getAttribute("cFrom").toString() : request.getParameter("cFrom");

  String cT = request.getParameter("cTo") == null && session.getAttribute("cTo") != null ?
          session.getAttribute("cTo").toString() : request.getParameter("cTo");

  String cS = request.getParameter("cStep") == null && session.getAttribute("cStep") != null ?
          session.getAttribute("cStep").toString() : request.getParameter("cStep");

  String dF = request.getParameter("dFrom") == null && session.getAttribute("dFrom") != null ?
          session.getAttribute("dFrom").toString() : request.getParameter("dFrom");

  String dT = request.getParameter("dTo") == null && session.getAttribute("dTo") != null ?
          session.getAttribute("dTo").toString() : request.getParameter("dTo");

  String dS = request.getParameter("dStep") == null && session.getAttribute("dStep") != null ?
          session.getAttribute("dStep").toString() : request.getParameter("dStep");

  aFrom = aF != null ? Double.parseDouble(aF) : -1.49;
  aTo = aT != null ? Double.parseDouble(aT) : -1.29;
  aStep = aS != null ? Double.parseDouble(aS) : 0.1;
  bFrom = bF != null ? Double.parseDouble(bF) : 23.4;
  bTo = bT != null ? Double.parseDouble(bT) : 23.7;
  bStep = bS != null ? Double.parseDouble(bS) : 0.1;
  cFrom = cF != null ? Double.parseDouble(cF) : 1.23;
  cTo = cT != null ? Double.parseDouble(cT) : 1.43;
  cStep = cS != null ? Double.parseDouble(cS) : 0.1;
  dFrom = dF != null ? Double.parseDouble(dF) : 2.542;
  dTo = dT != null ? Double.parseDouble(dT) : 2.942;
  dStep = dS != null ? Double.parseDouble(dS) : 0.1;

  if(!session.isNew()) {
    session.setAttribute("aFrom", aFrom);
    session.setAttribute("aTo", aTo);
    session.setAttribute("aStep", aStep);
    session.setAttribute("bFrom", bFrom);
    session.setAttribute("bTo", bTo);
    session.setAttribute("bStep", bStep);
    session.setAttribute("cFrom", cFrom);
    session.setAttribute("cTo", cTo);
    session.setAttribute("cStep", cStep);
    session.setAttribute("dFrom", dFrom);
    session.setAttribute("dTo", dTo);
    session.setAttribute("dStep", dStep);
  }
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method = "GET" action = "/index.jsp">
    <div>
      a from:
      <input type = "text" name = "aFrom" value = "<%=aFrom%>"/>
      to:
      <input type = "text" name = "aTo" value = "<%=aTo%>"/>
      step:
      <input type = "text" name = "aStep" value = "<%=aStep%>"/>
    </div>
    <br>
    <div>
      b from:
      <input type = "text" name = "bFrom" value = "<%=bFrom%>"/>
      to:
      <input type = "text" name = "bTo" value = "<%=bTo%>"/>
      step:
      <input type = "text" name = "bStep" value = "<%=bStep%>">
    </div>
    <br>
    <div>
      c from:
      <input type = "text" name = "cFrom" value = "<%=cFrom%>"/>
      to:
      <input type = "text" name = "cTo" value = "<%=cTo%>"/>
      step:
      <input type = "text" name = "cStep" value = "<%=cStep%>"/>
    </div>
    <br>
    <div>
      d from:
      <input type = "text" name = "dFrom" value = "<%=dFrom%>"/>
      to:
      <input type = "text" name = "dTo" value = "<%=dTo%>"/>
      step:
      <input type = "text" name = "dStep" value = "<%=dStep%>">
    </div>
    <br>
    <input type = "submit" value = "Calculate"/>
  </form>

  <style>
    table td {
      width: 100px;
      text-align: center;
    }
  </style>
  <table border="1">
    <tr>
      <th>a</th>
      <th>b</th>
      <th>c</th>
      <th>d</th>
      <th>y</th>
    </tr>
    <%
      for (double i = aFrom; i <= aTo; i += aStep) {
        for (double j = bFrom; j <= bTo; j += bStep) {
          for (double k = cFrom; k <= cTo; k += cStep) {
            for (double m = dFrom; m <= dTo; m += dStep) {
    %>
    <tr>
      <td><%=i%></td>
      <td><%=j%></td>
      <td><%=k%></td>
      <td><%=m%></td>
    <%
          result = getResult(i, j, k, m);
    %>
      <td><%= result %></td>
    <%
            }
        %>
    </tr>
    <%
          }
        }
      }
    %>
  </table>
  </body>
</html>
