<%--
  Created by IntelliJ IDEA.
  User: vicwa
  Date: 23.03.2019
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="static java.lang.Math.*" %>
<%!
    double[] arr = new double[] {1d, 1d, 1d, 1d, 2d, 2d, 2d, 2d, 1d, 1d, 1d, 1d};
    String[] chars = new String[] {"a", "b", "c", "d"};
    String[] func = new String[] {"from", "to", "period"};
    int differ;
%>
<%
    for(Cookie i : request.getCookies()){
        for(int k=0; k < chars.length; k++)
            if(chars[k] == i.getName())
                differ = k;
        for(int k=0; k < i.getValue().split(";").length; k++)
            try{ arr[ 4 * k + differ] = Double.parseDouble(i.getValue().split(";")[k]);} catch (Exception error){}
    }
    for(int ch=0; ch < chars.length; ch++)
        for(int f=0; f < func.length; f++)
            try{ arr[ 4 * f + ch] = Double.parseDouble(request.getParameter(chars[ch] + "_" + func[f]));} catch (Exception error){}
    for(int ch=0; ch < chars.length; ch++)
        response.addCookie(new Cookie(chars[ch], ";".join(Double.toString(arr[ch]), Double.toString(arr[4 + ch]), Double.toString(arr[8 + ch]))));
%>
<html>
<head>
  <title>Calculator.com</title>
</head>
<body>
<h1>Calculator</h1>
<form method="get" action=''>
  <div align="center" class="text">
      Параметр а from: <input name="a_from", value="<%=arr[0]%>", size="10">
      Параметр а to: <input name="a_to", value="<%=arr[4]%>", size="10">
      Параметр a step: <input name="a_period", value="<%=arr[8]%>", size="10">
  </div>
  <div align="center" class="text">
      Параметр b from: <input name="b_from", value="<%=arr[1]%>", size="10">
      Параметр b to: <input name="b_to", value="<%=arr[5]%>", size="10">
      Параметр b step: <input name="b_period", value="<%=arr[9]%>", size="10">
  </div>
  <div align="center" class="text">
      Параметр c from: <input name="c_from", value="<%=arr[2]%>", size="10">
      Параметр c to: <input name="c_to", value="<%=arr[6]%>", size="10">
      Параметр c step: <input name="c_period", value="<%=arr[10]%>", size="10">
  </div>
  <div align="center" class="text">
      Параметр d from: <input name="d_from", value="<%=arr[3]%>", size="10">
      Параметр d to: <input name="d_to", value="<%=arr[6]%>", size="10">
      Параметр d step: <input name="d_period", value="<%=arr[11]%>", size="10">
  </div>
  <p align="center"><input value="Посчитать" type="submit"></p>
</form>
<table border="1", width="60%", align="center">
   <tr><th>a</th><th>b</th><th>c</th><th>d</th><th>y</th></tr>
<%  for(double a = arr[0]; a <= arr[4]; a += arr[8]){
      for(double b = arr[1]; b <= arr[5]; b += arr[9]){
        for(double c = arr[2]; c <= arr[6]; c += arr[10]){
          for(double d = arr[3]; d <= arr[7]; d += arr[11]){%>
            <tr><th><%=a%></th><th><%=b%></th><th><%=c%></th><th><%=c%></th>
            <th><%=sqrt(abs((sin(a) - 4 * Math.log(b)/ pow(c, d))))%></th></tr>
<% }}}} %>
</table>

</body>
</html>
