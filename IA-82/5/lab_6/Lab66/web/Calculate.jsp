<%-- 
    Document   : Calculate
    Created on : 7 квіт. 2019, 21:57:01
    Author     : User
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
        <style>  
            .th{
              
               background: greenyellow;
               font-size: 22px;
               font-style: bold;
               
            }
            table{
               
              
                border: 1px;
            }
             th{
               
               background: pink;
               font-size: 22px;
              }
            td{
                
                width: 100px;
                text-align: center;
              }
              input{
                  text-align: center;
              }
           
       </style>
      </head>
    <body background="C:\Users\User\Desktop\50-Beautiful-and-Minimalist-Presentation-Backgrounds-05.jpg">
        <form action = "Calculate.jsp" method = "GET" >
        <%! 
         int a1 = 1, a2 = 2, a3 = 1;
         int b1 = 1, b2 = 2, b3 = 1;
         int c1 = 1, c2 = 2, c3 = 1;
         int d1 = 1, d2 = 2, d3 = 1;
         double y(int a,int b,int c, int d){
           return 2*Math.cbrt((Math.sin(a)/Math.tan(Math.abs(b-a)))+Math.log(c)/d);
         }
        %>
        <% 
           String _a1 = request.getParameter("a1");
           String _a2 = request.getParameter("a2");
           String _a3 = request.getParameter("a3");
           if (_a1!=null && _a2!=null && _a3!=null){
               a1=Integer.parseInt(_a1);
               a2=Integer.parseInt(_a2);
               a3=Integer.parseInt(_a3);
                       
           }
           
           String _b1 = request.getParameter("b1");
           String _b2 = request.getParameter("b2");
           String _b3 = request.getParameter("b3");
           if (_b1!=null && _b2!=null && _b3!=null){
               b1=Integer.parseInt(_b1);
               b2=Integer.parseInt(_b2);
               b3=Integer.parseInt(_b3);
                       
           }
           
           String _c1 = request.getParameter("c1");
           String _c2 = request.getParameter("c2");
           String _c3 = request.getParameter("c3");
           if (_c1!=null && _c2!=null && _c3!=null){
               c1=Integer.parseInt(_c1);
               c2=Integer.parseInt(_c2);
               c3=Integer.parseInt(_c3);
                       
           }
           
           String _d1 = request.getParameter("d1");
           String _d2 = request.getParameter("d2");
           String _d3 = request.getParameter("d3");
           if (_b1!=null && _b2!=null && _b3!=null){
               d1=Integer.parseInt(_d1);
               d2=Integer.parseInt(_d2);
               d3=Integer.parseInt(_d3);
                       
           }%>
        <p> 
           
      <center>
      
        <table >
           <tr>
            <th>Parametr </th> 
            <th>From </th> 
            <th>To</th> 
            <th>Step</th> 
            </tr> 
            <tr>
                <td class="th">a</td> 
            <td><input type="text" name="a1" value="<%= a1 %>"</td> 
            <td><input type="text" name="a2" value="<%= a2 %>"</td> 
            <td><input type="text" name="a3" value="<%= a3 %>"</td> 
            </tr>
            <tr>
            <td class="th">b</td> 
            <td><input type="text" name="b1" value="<%= b1 %>"</td> 
            <td><input type="text" name="b2" value="<%= b2 %>"</td> 
            <td><input type="text" name="b3" value="<%= b3 %>"</td> 
            </tr>
            <tr>
            <td class="th">c</td> 
            <td><input type="text" name="c1" value="<%= c1 %>"</td> 
            <td><input type="text" name="c2" value="<%= c2 %>"</td> 
            <td><input type="text" name="c3" value="<%= c3 %>"</td> 
            </tr>
            <td class="th">d</td> 
            <td><input type="text" name="d1" value="<%= d1 %>"</td> 
            <td><input type="text" name="d2" value="<%= d2 %>"</td> 
            <td><input type="text" name="d3" value="<%= d3 %>"</td> 
            </tr>
            <tr>
        </table>
        </p>
        <p>
            <input type="submit" value="Calculate"/>
        </p>
        <p>
        <table>
            <tr>
            <th>a</th> 
            <th>b</th> 
            <th>c</th> 
            <th>d</th> 
            <th>y</th> 
            </tr>
            <% 
             for (int a=a1;a<=a2;a+=a3){
                 for (int b=b1;b<=b2;b+=b3){
                     for (int c=c1;c<=c2;c+=c3){
                     for (int d=d1;d<=d2;d+=d3){ %>
                     <tr>
                         <td><%= a %></td> 
                         <td><%= b %></td> 
                         <td><%= c %></td> 
                         <td><%= d %></td> 
                         <td><%= y(a,b,c,d) %></td> 
                         
                     </tr>
               <%                         
                 } // d
           } // c
                 } //b
             } //a
            %>
        </table></center>
        </p>
        </form>
    </body>
</html>
