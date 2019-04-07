<%--
  Created by IntelliJ IDEA.
  User: Egor
  Date: 31.03.2019
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>KPI</title>
  </head>
  <body>
    <h1>Welcome to the KPI!</h1>
    <h2>Choose the option:</h2>
    <p>1. Show KPI</p>
    <p>2. Show number of students</p>
    <p>3. Show biggest faculty</p>
    <p>4. Show best students</p>
    <p>(input number)</p>
    <form action="/bs">
      <p><input type="number" name="option" required></p>
      <p><input type="submit" name="Submit"></p>
    </form>
    <c:set var="chosenone" scope="request" value="${option}"/>
    <c:choose>
      <c:when test="${chosenone == 1}">
        <c:out value="${KPI.name}:"/>
        <c:forEach var="fac" items="${KPI.allFaculty}">
          <p><c:out value="${fac.name}:"/></p>
          <c:forEach var="stud" items="${fac.allStudent}">
            <p><c:out value="${stud.name} "/>
              <c:out value="${stud.surname},"/>
              <c:out value="${stud.id}, "/>
              <c:out value="${stud.averageMark}"/></p>
          </c:forEach>
        </c:forEach>
      </c:when>
      <c:when test="${chosenone == 2}">
        <c:out value="Number of students: ${count}"/>
      </c:when>
      <c:when test="${chosenone == 3}">
          <p><c:out value="${BigFac.name}:"/></p>
          <c:forEach var="stud" items="${BigFac.allStudent}">
            <p><c:out value="${stud.name} "/>
              <c:out value="${stud.surname},"/>
              <c:out value="${stud.id}, "/>
              <c:out value="${stud.averageMark}"/></p>
          </c:forEach>
      </c:when>
      <c:when test="${chosenone == 4}">
        <c:forEach var="stud" items="${BestStudents}">
          <p><c:out value="${stud.name} "/>
            <c:out value="${stud.surname},"/>
            <c:out value="${stud.id}, "/>
            <c:out value="${stud.averageMark}"/></p>
        </c:forEach>
      </c:when>
    </c:choose>
  </body>
</html>
