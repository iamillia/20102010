<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table</title>
</head>
<body>
<table border="1">
    <caption>Results</caption>
    <tr>
        <th>Par a</th>
        <th>Par b</th>
        <th>Par c</th>
        <th>Par d</th>
        <th>Result</th>
    </tr>
    <%
        String a1 = request.getParameter("aFrom");
        String a2 = request.getParameter("aTo");
        String a3 = request.getParameter("aStep");

        String b1 = request.getParameter("bFrom");
        String b2 = request.getParameter("bTo");
        String b3 = request.getParameter("bStep");

        String c1 = request.getParameter("cFrom");
        String c2 = request.getParameter("cTo");
        String c3 = request.getParameter("cStep");

        String d1 = request.getParameter("dFrom");
        String d2 = request.getParameter("dTo");
        String d3 = request.getParameter("dStep");


        double aT = Double.parseDouble(a2);
        double aS = Double.parseDouble(a3);


        double bT = Double.parseDouble(b2);
        double bS = Double.parseDouble(b3);


        double cT = Double.parseDouble(c2);
        double cS = Double.parseDouble(c3);


        double dT = Double.parseDouble(d2);
        double dS = Double.parseDouble(d3);

        for (double aF = Double.parseDouble(a1); aF <= aT; aF += aS) {
            for (double bF = Double.parseDouble(b1); bF <= bT; bF += bS) {
                for (double cF = Double.parseDouble(c1); cF <= cT; cF += cS) {
                    for (double dF = Double.parseDouble(d1); dF <= dT; dF += dS) {

                        double y = 3 * (Math.log(Math.abs(aF / bF)) + Math.sqrt(Math.sin(cF) + Math.pow(Math.E, dF)));

    %>

    <tr>
        <td><%=aF%></td>
        <td><%=bF%></td>
        <td><%=cF%></td>
        <td><%=dF%></td>
        <td><%=y%></td>
    </tr>

    <%

                    }
                }
            }
        }
    %>
</table>
<%
    Cookie cAFrom = new Cookie("AFrom", "0");
    Cookie cATo = new Cookie("ATo", "0");
    Cookie cAStep = new Cookie("AStep", "0");
    Cookie cBFrom = new Cookie("BFrom", "0");
    Cookie cBTo = new Cookie("BTo", "0");
    Cookie cBStep = new Cookie("BStep", "0");
    Cookie cCFrom = new Cookie("CFrom", "0");
    Cookie cCTo = new Cookie("CTo", "0");
    Cookie cCStep = new Cookie("CStep", "0");
    Cookie cDFrom = new Cookie("DFrom", "0");
    Cookie cDTo = new Cookie("DTo", "0");
    Cookie cDStep = new Cookie("DStep", "0");

    cAFrom.setValue(request.getParameter("aFrom"));
    cATo.setValue(request.getParameter("aTo"));
    cAStep.setValue(request.getParameter("aStep"));
    cBFrom.setValue(request.getParameter("bFrom"));
    cBTo.setValue(request.getParameter("bTo"));
    cBStep.setValue(request.getParameter("bStep"));
    cCFrom.setValue(request.getParameter("cFrom"));
    cCTo.setValue(request.getParameter("cTo"));
    cCStep.setValue(request.getParameter("cStep"));
    cDFrom.setValue(request.getParameter("dFrom"));
    cDTo.setValue(request.getParameter("dTo"));
    cDStep.setValue(request.getParameter("dStep"));

    cAFrom.setMaxAge(300);
    cATo.setMaxAge(300);
    cAStep.setMaxAge(300);
    cBFrom.setMaxAge(300);
    cBTo.setMaxAge(300);
    cBStep.setMaxAge(300);
    cCFrom.setMaxAge(300);
    cCTo.setMaxAge(300);
    cCStep.setMaxAge(300);
    cDFrom.setMaxAge(300);
    cDTo.setMaxAge(300);
    cDStep.setMaxAge(300);


    response.addCookie(cAFrom);
    response.addCookie(cATo);
    response.addCookie(cAStep);
    response.addCookie(cBFrom);
    response.addCookie(cBTo);
    response.addCookie(cBStep);
    response.addCookie(cCFrom);
    response.addCookie(cCTo);
    response.addCookie(cCStep);
    response.addCookie(cDFrom);
    response.addCookie(cDTo);
    response.addCookie(cDStep);
%>
</body>
</html>
