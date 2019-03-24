<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <%  Cookie[] cs1 = request.getCookies();
      String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;
      if (cs1.length > 1) {
          s1 = cs1[1].getValue();
          s2 = cs1[2].getValue();
          s3 = cs1[3].getValue();
          s4 = cs1[4].getValue();
          s5 = cs1[5].getValue();
          s6 = cs1[6].getValue();
          s7 = cs1[7].getValue();
          s8 = cs1[8].getValue();
          s9 = cs1[9].getValue();
          s10 = cs1[10].getValue();
          s11 = cs1[11].getValue();
          s12 = cs1[12].getValue();
      } else {
          s1 = "0";
          s2 = "0";
          s3 = "0";
          s4 = "0";
          s5 = "0";
          s6 = "0";
          s7 = "0";
          s8 = "0";
          s9 = "0";
          s10 = "0";
          s11 = "0";
          s12 = "0";
      }%>
    <form action="Calc.jsp" name="Parameters">
      <p>Parameter a:</p>
      <p>from:<input type="text" name="aFrom" value="<%=s1%>" required>
         to:<input type="text" name="aTo" value="<%=s2%>" required>
         step:<input type="text" name="aStep" value="<%=s3%>" required></p>
      <p>Parameter b:</p>
      <p>from:<input type="text" name="bFrom" value="<%=s4%>" required>
         to:<input type="text" name="bTo" value="<%=s5%>" required>
         step:<input type="text" name="bStep" value="<%=s6%>" required></p>
      <p>Parameter c:</p>
      <p>from:<input type="text" name="cFrom" value="<%=s7%>" required>
         to:<input type="text" name="cTo" value="<%=s8%>" required>
         step:<input type="text" name="cStep" value="<%=s9%>" required></p>
      <p>Parameter d:</p>
      <p>from:<input type="text" name="dFrom" value="<%=s10%>" required>
         to:<input type="text" name="dTo" value="<%=s11%>" required>
         step:<input type="text" name="dStep" value="<%=s12%>" required></p>
        <center><p><input type="submit" value="Calculate"></p></center>
    </form>
  </body>
</html>
