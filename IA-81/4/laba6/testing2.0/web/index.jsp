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
<%!double aStart, aStop, aStep;
   double bStart, bStop, bStep ;
   double cStart, cStop, cStep;
   double dStart, dStop, dStep;
%>
<%
  String aStarting = request.getParameter("aStart");
  String aStoping = request.getParameter("aStop");
  String aSteping = request.getParameter("aStep");
  String bStarting = request.getParameter("bStart");
  String bStoping = request.getParameter("bStop");
  String bSteping = request.getParameter("bStep");
  String cStarting = request.getParameter("cStart");
  String cStoping = request.getParameter("cStop");
  String cSteping = request.getParameter("cStep");
  String dStarting = request.getParameter("dStart");
  String dStoping = request.getParameter("dStop");
  String dSteping = request.getParameter("dStep");
  if(aStarting == null){aStart = 1;}else aStart = Double.parseDouble(aStarting);
  if(aStoping == null){aStop = 3;}else aStop = Double.parseDouble(aStoping);
  if(aSteping == null){aStep = 1;}else aStep = Double.parseDouble(aSteping);
  if(bStarting == null){bStart = 1;}else bStart = Double.parseDouble(bStarting);
  if(bStoping == null){bStop = 3;}else bStop = Double.parseDouble(bStoping);
  if(bSteping == null){bStep = 1;}else bStep = Double.parseDouble(bSteping);
  if(cStarting == null){cStart = 1;}else cStart = Double.parseDouble(cStarting);
  if(cStoping == null){cStop = 3;}else cStop = Double.parseDouble(cStoping);
  if(cSteping == null){cStep= 1;}else cStep = Double.parseDouble(cSteping);
  if(dStarting == null){dStart= 1;}else dStart = Double.parseDouble(dStarting);
  if(dStoping == null){dStop = 3;}else dStop = Double.parseDouble(dStoping);
  if(dSteping == null){dStep = 1;}else dStep = Double.parseDouble(dSteping);
  if(cStart == 0){
    response.sendError(422, "c != 0 exception" );
  }
  else if (bStart==0){
    response.sendError(422,"b != 0 exception");
  }
  else if (dStart == 0){
    response.sendError(422, "d != 0 exception");
  }
  else if (aStart == 0){
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
    Choose aStart  <input type="Number" name ="aStart" required value=<%=aStart%> ><br/><br/>
    Choose aStop  <input type="Number" name ="aStop" required value=<%=aStop%> ><br/><br/>
    Choose aStep  <input type="Number" name ="aStep" required value=<%=aStart%> ><br/><br/>
    Choose bStart  <input type="Number" name ="bStart" required value=<%=bStart%>><br/><br/>
    Choose bStop  <input type="Number" name ="bStop" required value=<%=bStop%>><br/><br/>
    Choose bStep  <input type="Number" name ="bStep" required value=<%=bStep%>><br/><br/>
    Choose cStart  <input type="Number" name ="cStart" required value=<%=cStart%>><br/><br/>
    Choose cStop  <input type="Number" name ="cStop" required value=<%=cStop%>><br/><br/>
    Choose cStep  <input type="Number" name ="cStep" required value=<%=cStep%>><br/><br/>
    Choose dStart  <input type="Number" name ="dStart" required value=<%=dStart%>><br/><br/>
    Choose dStop  <input type="Number" name ="dStop" required value=<%=dStop%>><br/><br/>
    Choose dStep  <input type="Number" name ="dStep" required value=<%=dStep%>><br/><br/>
    <input type ="submit" value="calculating">
  </form>
  <hr>
  <form>
    <table border="3" width="15%" cellpadding="5">
      <%for (double i = aStart; i <= aStop; i += aStep){
        for (double j = bStart; j <= bStop; j += bStep){
          for(double m = cStart; m <= cStop; m += cStep){
            for(double n = dStart; n <= dStop; n += dStep){
      %>
      <tr>
        <th>a</th>
        <th>b</th>
        <th>c</th>
        <th>d</th>
        <th>result</th>
      </tr>
      <tr>
        <td> <%=i%></td>
        <td> <%=j%></td>
        <td> <%=m%></td>
        <td> <%=n%></td>
        <td> <%out.print((pow(i,j)/sinh(Math.abs(j))) + 4 * (log10(m)/ pow(n,(1.0/4))));%></td>
        <%
                        }
                   }
              }
         }
        %>
      </tr>
    </table>
  </form>
  </body>
</html>
