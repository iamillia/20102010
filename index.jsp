<%--
  Created by IntelliJ IDEA.
  User: sobaka
  Date: 2019-03-23
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="static java.lang.Math.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!     double aStart, aFinish ,aStep;
        double bStart, bFinish ,bStep;
        double cStart, cFinish ,cStep;
        double dStart, dFinish ,dStep;
    double result;
    double defaultStep=1, defaultStart =1, defaultFinish = 3;
%>
<%
    String aStarter = request.getParameter("aStart");
    String aFinisher = request.getParameter("aFinish");
    String aSteper = request.getParameter("aStep");

    String bStarter = request.getParameter("bStart");
    String bFinisher = request.getParameter("bFinish");
    String bSteper = request.getParameter("bStep");

    String cStarter = request.getParameter("cStart");
    String cFinisher = request.getParameter("cFinish");
    String cSteper = request.getParameter("cStep");

    String dStarter = request.getParameter("dStart");
    String dFinisher = request.getParameter("dFinish");
    String dSteper = request.getParameter("dStep");


    if(aStarter != null){
        aStart = Double.parseDouble(aStarter);
    }
    else aStart = defaultStart;
    if(aFinisher != null){
        aFinish = Double.parseDouble(aFinisher);
    }
    else aFinish = defaultFinish;
    if(aSteper != null){
        aStep = Double.parseDouble(aSteper);
    }
    else aStep = defaultStep;
    if(bStarter != null){
        bStart = Double.parseDouble(bStarter);
    }
    else bStart = defaultStart;
    if(bFinisher != null){
        bFinish = Double.parseDouble(bFinisher);
    }
    else bFinish = defaultFinish;
    if(bSteper != null){
        bStep = Double.parseDouble(bSteper);

    }
    else bStep = defaultStep;
    if(cStarter != null){
        cStart = Double.parseDouble(cStarter);
    }
    else cStart = defaultStart;
    if(cFinisher != null){
        cFinish = Double.parseDouble(cFinisher);
    }
    else cFinish = defaultFinish;
    if(cSteper != null){
        cStep = Double.parseDouble(cSteper);

    }
    else cStep = defaultStep;
    if(dStarter != null) {
        dStart = Double.parseDouble(dStarter);
    }
    else dStart = defaultStart;
    if(dFinisher != null){
        dFinish = Double.parseDouble(dFinisher);
    }
    else dFinish = defaultFinish;
    if(dSteper != null){
        dStep = Double.parseDouble(dSteper);
    }
    else dStep = defaultStep;
    if(aStep<0||bStep<0||cStep<0||dStep<0){
    response.sendError(406,"Step cannot be less then 0");
    }


    Cookie[] cookies;
    cookies = request.getCookies();

    Cookie aStartCookie = new Cookie("aStarter",aStarter);
    aStartCookie.setMaxAge(60*60*24*2);
    Cookie aEndCookie = new Cookie("aFinisher",aFinisher);
    aEndCookie.setMaxAge(60*60*24*2);
    Cookie aStepCookie = new Cookie("aSteper",aSteper);
    aStepCookie.setMaxAge(60*60*24*2);

    Cookie bStartCookie = new Cookie("bStarter",bStarter);
    bStartCookie.setMaxAge(60*60*24*2);
    Cookie bEndCookie = new Cookie("bFinisher",bFinisher);
    bEndCookie.setMaxAge(60*60*24*2);
    Cookie bStepCookie = new Cookie("bSteper",bSteper);
    bStepCookie.setMaxAge(60*60*24*2);

    Cookie cStartCookie = new Cookie("cStarter",cStarter);
    cStartCookie.setMaxAge(60*60*24*2);
    Cookie cEndCookie = new Cookie("cFinisher",cFinisher);
    cEndCookie.setMaxAge(60*60*24*2);
    Cookie cStepCookie = new Cookie("cSteper",cSteper);
    cStepCookie.setMaxAge(60*60*24*2);

    Cookie dStartCookie = new Cookie("dStarter",dStarter);
    dStartCookie.setMaxAge(60*60*24*2);
    Cookie dEndCookie = new Cookie("dFinisher",dFinisher);
    dEndCookie.setMaxAge(60*60*24*2);
    Cookie dStepCookie = new Cookie("dSteper",dSteper);
    dStepCookie.setMaxAge(60*60*24*2);

    response.addCookie(aStartCookie);
    response.addCookie(aEndCookie);
    response.addCookie(aStepCookie);

    response.addCookie(bStartCookie);
    response.addCookie(bEndCookie);
    response.addCookie(bStepCookie);

    response.addCookie(cStartCookie);
    response.addCookie(cEndCookie);
    response.addCookie(cStepCookie);

    response.addCookie(dStartCookie);
    response.addCookie(dEndCookie);
    response.addCookie(dStepCookie);
%>

<html>
<head>
    <title>Calculating</title>
</head>
<body>
<br><img src="math.jpg">
<form action="index.jsp" method="get">
    a start:
    <input type="number" name="aStart" value="<%=aStart%>" required/>
    end:
    <input type="number" name="aFinish" value="<%=aFinish%>" required/>
    step:
    <input type="number" name="aStep" value="<%=aStep%>" required/>
    <br>b start:
    <input type="number" name="bStart" value="<%=bStart%>" required/>
    end:
    <input type="number" name="bFinish" value="<%=bFinish%>" required/>
    step:
    <input type="number" name="bStep" value="<%=bStep%>" required/>
    <br>c start:
    <input type="number" name="cStart" value="<%=cStart%>" required/>
    end:
    <input type="number" name="cFinish" value="<%=cFinish%>" required/>
    <%if(cStart<0||cFinish<0){
        response.sendError(422,"C parametrs can not be less then 0");
    } %>
    step:
    <input type="number" name="cStep" value="<%=cStep%>" required/>

    <br>d start:
    <input type="number" name="dStart" value="<%=dStart%>" required/>
    end:
    <input type="number" name="dFinish" value="<%=dFinish%>" required/>
    step:
    <input type="number" name="dStep" value="<%=dStep%>" required/>
    <%if(aStep==0||bStep==0||cStep==0||dStep==0){
        response.sendError(406,"Step cannot be 0");
    } %>
    <input type="submit" value="Calculate" />
</form>

<style>table td{
    width: 100px;
    text-align: center;
}</style>

<table border="2">
    <tr>
        <th>a</th>
        <th>b</th>
        <th>c</th>
        <th>d</th>
        <th>result</th>
    </tr>
    <% for(double i = aStart; i <= aFinish; i += abs(aStep)){
        for (double j = bStart; j <= bFinish; j += abs(bStep)){
            for (double m = cStart; m <= cFinish; m += abs(cStep)){
                for (double n = dStart; n <= dFinish; n += abs(dStep)){
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
        return pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);
    }
%>