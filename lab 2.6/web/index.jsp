<%@ page import="java.lang.Math.*" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static java.lang.Math.*" %>


<html>
<head>
    <title>Calculate</title>
</head>
<body>
<hr>
<img src="formula.jpg" height="120" width="196">
<hr>
<%!
    String fromA;
    String fromB;
    String fromC;
    String fromD;
    String toA;
    String toB;
    String toC;
    String toD;
    String stepA;
    String stepB;
    String stepC;
    String stepD;

%>

<%
    fromA = request.getParameter("fromA");
    fromB = request.getParameter("fromB");
    fromC = request.getParameter("fromC");
    fromD = request.getParameter("fromD");
    toA = request.getParameter("toA");
    toB = request.getParameter("toB");
    toC = request.getParameter("toC");
    toD = request.getParameter("toD");
    stepA = request.getParameter("stepA");
    stepB = request.getParameter("stepB");
    stepC = request.getParameter("stepC");
    stepD = request.getParameter("stepD");



%>

<%
    if(fromA==null){
        fromA="3";
    };
    if(fromB==null){
        fromB="3";
    };
    if(fromC==null){
        fromC="3";
    };
    if(fromD==null){
        fromD="3";
    };
    if(toA==null){
        toA="6";
    };
    if(toB==null){
        toB="6";
    };
    if(toC==null){
        toC="6";
    };
    if(toD==null){
        toD="6";
    };
    if(stepA==null){
        stepA="1";
    };
    if(stepB==null){
        stepB="1";
    };
    if(stepC==null){
        stepC="1";
    };
    if(stepD==null){
        stepD="1";
    };
    if(Integer.parseInt(fromA) <=0){
        response.sendError(422, "a< 0 exception" );
    }
    else if (Integer.parseInt(fromC)<=0){
        response.sendError(422,"с < 0 exception");
    }
%>
<form method="get" action="index.jsp">
    Enter a : <input type="text" name="fromA" value=<%=fromA%>> <input type="text" name="toA" value=<%=toA%>> <input
        type="text" name="stepA" value=<%=stepA%>> <br/><br/>
    Enter b : <input type="text" name="fromB" value=<%=fromB%>> <input type="text" name="toB" value=<%=toB%>> <input
        type="text" name="stepB" value=<%=stepB%>><br/><br/>
    Enter c : <input type="text" name="fromC" value=<%=fromC%>> <input type="text" name="toC" value=<%=toC%>> <input
        type="text" name="stepC" value=<%=stepC%>><br/><br/>
    Enter d : <input type="text" name="fromD" value=<%=fromD%>> <input type="text" name="toD" value=<%=toD%>> <input
        type="text" name="stepD" value=<%=stepD%>><br/><br/>


    <input type="submit" value="calculate">

</form>
<hr>
<form>
    <table border="1" width="10%" cellpadding="5">
        <tr>
            <th>a</th>
            <th>b</th>
            <th>c</th>
            <th>d</th>
            <th>rezult</th>
        </tr>
        <tr>
            <%  for (int a = Integer.parseInt(fromA); a <= Integer.parseInt(toA); a = a + Integer.parseInt(stepA)) {
                 for (int b = Integer.parseInt(fromB); b <= Integer.parseInt(toB); b = b + Integer.parseInt(stepB)) {
                    for (int c = Integer.parseInt(fromC); c <= Integer.parseInt(toC); c = c + Integer.parseInt(stepC)) {
                         for (int d = Integer.parseInt(fromD); d <= Integer.parseInt(toD); d = d + Integer.parseInt(stepD)) { %>
            <td><% out.print(a); %></td>
            <td><% out.print(b); %></td>
            <td><% out.print(c); %></td>
            <td><% out.print(d); %></td>
            <td><%
                double e = 2.71828182846;
                try {
                    out.print(cos(b) + sin(sqrt(a)) / (2 * log10(c + pow(e, d))));
                } catch (Exception f) {
                    out.println("write another number");
                }
            %></td>

        </tr>
        <% }
        }
        }
        } %>

    </table>


</form>


</body>
</html>
