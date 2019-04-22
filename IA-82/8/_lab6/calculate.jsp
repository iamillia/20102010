<%@ page import="static java.lang.Math.pow" %>
<%@ page import="static java.lang.Math.sinh" %>
<%@ page import="static java.lang.Math.*" %>
<%@ page import="static java.lang.Math.abs" %>
<%@ page import="static java.lang.Math.asin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
    <style>.rightpic {
        float: right;
    }</style>
</head>

<body>


<img src="formula.jpg" width="450" height="120" alt="formula">
<form action="index.jsp" method="post">
    <img src="happy-quote.png" class="rightpic" alt="formula">


    <%


String aParamFrom;
    session.setAttribute( aParamFrom = request.getParameter("aParamFrom"), aParamFrom);

    String bParamFrom = request.getParameter("bParamFrom");
    String cParamFrom = request.getParameter("cParamFrom");
    String dParamFrom = request.getParameter("dParamFrom");
    String aParamTo = request.getParameter("aParamTo");
    String bParamTo = request.getParameter("bParamTo");
    String cParamTo = request.getParameter("cParamTo");
    String dParamTo = request.getParameter("dParamTo");
    String aParamStep = request.getParameter("aParamStep");
    String bParamStep = request.getParameter("bParamStep");
    String cParamStep = request.getParameter("cParamStep");
    String dParamStep = request.getParameter("dParamStep");
        double aFrom, bFrom,cFrom, dFrom, aTo, bTo, cTo, dTo, aStep, bStep, cStep, dStep ;
        double res ;
%>
</form>
<table>
    <tr>
        <th>a: from <%= aParamFrom%></th> <th>a: to <%= aParamTo%></th> <th> Step <%= aParamStep%></th>
    </tr>  <tr>
        <th>b: from <%=bParamFrom%></th><th>b: to <%= bParamTo%></th><th> Step <%= bParamStep%></th>
    </tr>  <tr>
        <th>c: from <%=cParamFrom%></th><th>c: to <%= cParamTo%></th><th> Step <%= cParamStep%></th>
    </tr>  <tr>
        <th>d:from <%=dParamFrom%></th><th>d: to <%= dParamTo%></th><th> Step <%= dParamStep%></th>
    </tr>
</table>
<%!
    double formula(double a, double b, double c, double d){
        return pow((4 * sinh(sqrt(abs((int) (a / b)))) + 3 * asin(c)), d);
    }
%>

<%

    if (aParamFrom.isEmpty() || bParamFrom.isEmpty()||cParamFrom.isEmpty()|| dParamFrom.isEmpty()) {
%>
         <jsp:forward page="error.jsp" />
<%
}else {

        aFrom = Double.parseDouble(aParamFrom);
        bFrom = Double.parseDouble(bParamFrom);
        cFrom = Double.parseDouble(cParamFrom);
        dFrom = Double.parseDouble(dParamFrom);
        aTo= Double.parseDouble(aParamTo);
        bTo= Double.parseDouble(bParamTo);
        cTo= Double.parseDouble(cParamTo);
        dTo= Double.parseDouble(dParamTo);
        aStep= Double.parseDouble(aParamStep);
        bStep= Double.parseDouble(bParamStep);
        cStep= Double.parseDouble(cParamStep);
        dStep= Double.parseDouble(dParamStep);


        if (bFrom == 0 && bTo==0) {
            response.sendError(422, "\n" +
                    "we can not divide by zero");
        }
        if ((cFrom   > 1) || (cFrom < -1) ||(cTo   > 1) || (cTo < -1)) {
            response.sendError(422, "wrong argument");
        }
    else {
            for(double a = aFrom; a <= aTo; a += aStep){
                for (double b = bFrom; b <= bTo; b += bStep){
                    for (double  c= cFrom; c <= cTo; c += cStep){
                        for (double d = dFrom; d <= dTo; d += dStep){
             res = formula(a,b,c,d);

                        %>
<style>table td{
    width: 100px;
    text-align: left;
}</style>

<table border="1">
<tr>
    <td>a: <%=a%></td>
    <td>b: <%=b%></td>
    <td>c: <%=c%></td>
    <td>d: <%=d%></td>
    <td>result: <%=res%></td>


</tr>
    </table>
<%}}}}}
    request.setAttribute("aParamFrom",aFrom );
    request.setAttribute("aParamTo",aTo );
    request.setAttribute("aParamStep",aStep );
    request.setAttribute("bParamFrom",bFrom );
    request.setAttribute("bParamTo",bTo );
    request.setAttribute("bParamStep",bStep );
    request.setAttribute("cParamFrom",cFrom );
    request.setAttribute("cParamTo",cTo );
    request.setAttribute("cParamStep",cStep );
    request.setAttribute("dParamFrom",dFrom );
    request.setAttribute("dParamTo",dTo );
    request.setAttribute("dParamStep",dStep );
    }

  request.getRequestDispatcher("index.jsp").forward(request, response)
    ;%>



</body>
</html>
