<%@ page import="java.lang.Math.*" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static java.lang.Math.*" %>


<html>
<head>
  <title>$Title$</title>
</head>
<body>
<hr>
<img src="formula.jpg" height="100" width="170">
<hr>
<%!
  String a = "0";
  String b = "0";
  String c = "0";
  String d = "0";

%>
<form method ="post" action="index.jsp">
  Enter a : <input type="text" name="a" value=<%=a%>><br/><br/>
  Enter b : <input type="text" name ="b"  value=<%=b%>><br/><br/>
  Enter c : <input type="text" name ="c" value=<%=c%>><br/><br/>
  Enter d : <input type="text" name ="d" value=<%=d%>><br/><br/>
  <%
    a = request.getParameter("a");
    b = request.getParameter("b");
    c = request.getParameter("c");
    d = request.getParameter("d");
  %>
  <input type ="submit" value="calculate">

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
      <td> <% out.print(a); %></td>
      <td> <% out.print(b); %></td>
      <td> <% out.print(c); %></td>
      <td> <% out.print(d); %></td>
      <td> <%
        double e = 2.71828182846;
        try {
          out.print(cos(Integer.parseInt(b)) + sin(sqrt(Integer.parseInt(a))) / (2 * log10(Integer.parseInt(c) + pow(e, Integer.parseInt(d)))));
        }catch (Exception f){
          out.println("write another number");
        }

      %></td>

    </tr>

  </table>


</form>





</body>
</html>