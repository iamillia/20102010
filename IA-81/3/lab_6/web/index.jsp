<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.03.2019
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="static java.lang.Math.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!     double aStart, aEnd ,aStep;
        double bStart, bEnd ,bStep;
        double cStart, cEnd ,cStep;
        double dStart, dEnd ,dStep;
        double result;
%>
<%
    String aStarter = request.getParameter("aStart");
    String aEnder = request.getParameter("aEnd");
    String aSteper = request.getParameter("aStep");

    String bStarter = request.getParameter("bStart");
    String bEnder = request.getParameter("bEnd");
    String bSteper = request.getParameter("bStep");

    String cStarter = request.getParameter("cStart");
    String cEnder = request.getParameter("cEnd");
    String cSteper = request.getParameter("cStep");

    String dStarter = request.getParameter("dStart");
    String dEnder = request.getParameter("dEnd");
    String dSteper = request.getParameter("dStep");


    if(aStarter != null){aStart = Double.parseDouble(aStarter);}else aStart = -4;
    if(aEnder != null){aEnd = Double.parseDouble(aEnder);}else aEnd = -3;
    if(aSteper != null){aStep = Double.parseDouble(aSteper);}else aStep = 0.5;

    if(bStarter != null){bStart = Double.parseDouble(bStarter);}else bStart = 2;
    if(bEnder != null){bEnd = Double.parseDouble(bEnder);}else bEnd = 3;
    if(bSteper != null){bStep = Double.parseDouble(bSteper);}else bStep = 0.5;

    if(cStarter != null){cStart = Double.parseDouble(cStarter);}else cStart = 1;
    if(cEnder != null){cEnd = Double.parseDouble(cEnder);}else cEnd = 2;
    if(cSteper != null){cStep = Double.parseDouble(cSteper);}else cStep = 0.5;

    if(dStarter != null){dStart = Double.parseDouble(dStarter);}else dStart = 0;
    if(dEnder != null){dEnd = Double.parseDouble(dEnder);}else dEnd = 1;
    if(dSteper != null){dStep = Double.parseDouble(dSteper);}else dStep = 0.5;


    Cookie[] cookies;
    cookies = request.getCookies();

    Cookie a1 = new Cookie("aStarter",aStarter);    a1.setMaxAge(60*60*24*2);
    Cookie a2 = new Cookie("aEnder",aEnder);        a2.setMaxAge(60*60*24*2);
    Cookie a3 = new Cookie("aSteper",aSteper);      a3.setMaxAge(60*60*24*2);

    Cookie b1 = new Cookie("bStarter",bStarter);    b1.setMaxAge(60*60*24*2);
    Cookie b2 = new Cookie("bEnder",bEnder);        b2.setMaxAge(60*60*24*2);
    Cookie b3 = new Cookie("bSteper",bSteper);      b3.setMaxAge(60*60*24*2);

    Cookie c1 = new Cookie("cStarter",cStarter);    c1.setMaxAge(60*60*24*2);
    Cookie c2 = new Cookie("cEnder",cEnder);        c2.setMaxAge(60*60*24*2);
    Cookie c3 = new Cookie("cSteper",cSteper);      c3.setMaxAge(60*60*24*2);

    Cookie d1 = new Cookie("dStarter",dStarter);    d1.setMaxAge(60*60*24*2);
    Cookie d2 = new Cookie("dEnder",dEnder);        d2.setMaxAge(60*60*24*2);
    Cookie d3 = new Cookie("dSteper",dSteper);      d3.setMaxAge(60*60*24*2);

    response.addCookie(a1);
    response.addCookie(a2);
    response.addCookie(a3);

    response.addCookie(b1);
    response.addCookie(b2);
    response.addCookie(b3);

    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);

    response.addCookie(d1);
    response.addCookie(d2);
    response.addCookie(d3);
%>

<html>
<head>
  <title>LabaNaLyam3</title>
  <style>
    body{
      background: blue;
      color: yellow;
    }
  </style>
</head>
<body>
<h2>y = pow((4*ch(sqrt(abs(a/b))+3*acos(d), c) </h2>
<form action="index.jsp" method="get">
    <div>
        a start:
        <input type="number" name="aStart" value="<%=aStart%>"/>
        end:
        <input type="number" name="aEnd" value="<%=aEnd%>"/>
        step:
        <input type="number" name="aStep" value="<%=aStep%>"/>
    </div>
    <br>
    <div>
        b start:
        <input type="number" name="bStart" value="<%=bStart%>"/>
        end:
        <input type="number" name="bEnd" value="<%=bEnd%>"/>
        step:
        <input type="number" name="bStep" value="<%=bStep%>"/>
    </div>
    <br>
    <div>
        c start:
        <input type="number" name="cStart" value="<%=cStart%>"/>
        end:
        <input type="number" name="cEnd" value="<%=cEnd%>"/>
        step:
        <input type="number" name="cStep" value="<%=cStep%>"/>
    </div>
    <br>
    <div>
    d start:
    <input type="number" name="dStart" value="<%=dStart%>"/>
    end:
    <input type="number" name="dEnd" value="<%=dEnd%>"/>
    step:
    <input type="number" name="dStep" value="<%=dStep%>"/>
</div>
    <br>
  <input type="submit" value="Calculate" />
</form>

<style>table td{
    width: 80px;
    text-align: left;
}</style>

<table border="1">
    <tr>
        <th>a</th>
        <th>b</th>
        <th>c</th>
        <th>d</th>
        <th>result</th>
    </tr>
<% for(double i = aStart; i <= aEnd; i += aStep){
    for (double j = bStart; j <= bEnd; j += bStep){
        for (double m = cStart; m <= cEnd; m += cStep){
            for (double n = dStart; n <= dEnd; n += dStep){
                %>
    <tr>
        <td><%=i%></td>
        <td><%=j%></td>
        <td><%=m%></td>
        <td><%=n%></td>
        <%result = Calculate(i, j, m, n);%>
        <td><%=result%></td>
    <%}%>
    </tr>
    <%
        }
    }
}
%>
</table>
</body>
</html>

<%!
    double Calculate(double a, double b, double c, double d){
        return pow((4*cosh(sqrt(abs(a/b)))+3*acos(d)), c);
    }
%>
