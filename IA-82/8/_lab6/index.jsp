<%@ page import="static java.lang.Math.pow" %>
<%@ page import="static java.lang.Math.sinh" %>
<%@ page import="static java.lang.Math.sqrt" %>
<%@ page import="static java.lang.Math.abs" %>
<%@ page import="static java.lang.Math.asin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Calculator</title>
  </head>
  <body background="hated_math.jpg">

  <img src="formula.jpg" width="450" height="120" alt="formula">

<form method="get" action="calculate.jsp" >
    <label style="background: whitesmoke"> Input  a: from</label>
     <input  type="number" name="aParamFrom" value="<%=request.getAttribute("aParamFrom")%>"   />
    <label style="background: whitesmoke">to</label>
    <input  type="number" name="aParamTo" value="<%=request.getAttribute("aParamTo")%>"   />
    <label style="background: whitesmoke">step</label>
    <input  type="number" name="aParamStep" value="<%=request.getAttribute("aParamStep")%>"   />
    <br/>
    <label style="background: whitesmoke">Input b: from</label>
    <input  type="number" name="bParamFrom" value="<%=request.getAttribute("bParamFrom")%>"  />
    <label style="background: whitesmoke">to</label>
    <input  type="number" name="bParamTo" value="<%=request.getAttribute("bParamTo")%>"   />
    <label style="background: whitesmoke">step</label>
    <input  type="number" name="bParamStep" value="<%=request.getAttribute("bParamStep")%>"   />
    <br/>
    <label style="background: whitesmoke">Input c: from</label>
    <input   type="number" name="cParamFrom"From value="<%=request.getAttribute("cParamFrom")%>" /><label style="background: whitesmoke">to</label>
    <input  type="number" name="cParamTo" value="<%=request.getAttribute("cParamTo")%>"   />
    <label style="background: whitesmoke">step</label>
    <input  type="number" name="cParamStep" value="<%=request.getAttribute("cParamStep")%>"   />
    <br/>
    <label style="background: whitesmoke">Input d: from</label>
    <input  type="number" name="dParamFrom" value="<%=request.getAttribute("dParamFrom")%>"  /><label style="background: whitesmoke">to</label>
    <input  type="number" name="dParamTo" value="<%<%=request.getAttribute("dParamTo")%>%>"   />
    <label style="background: whitesmoke">step</label>
    <input  type="number" name="dParamStep" value="<%=request.getAttribute("dParamStep")%>"   />
    <br/>

    <input type="submit" accesskey="Enter" value="Сalculate"    />

</form>

  </body>
</html>
