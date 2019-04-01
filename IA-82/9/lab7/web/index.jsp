<%--
  Created by IntelliJ IDEA.
  User: Alex Rogov
  Date: 30.03.2019
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>View</title>
  </head>
  <body>
  <form method="GET" action="servletcontroller">

    <select name="institute">
      <c:forEach items="${institutes}" var="institute">
        <option value="${institute.key}">${institute.key}</option>
      </c:forEach>
    </select>
    <br>
    <input type="submit" name="type" value="getAll"/>
    <br>
    <input type="submit" name="type" value="getLargetFaculty"/>
    <br>
    <input type="submit" name="type" value="getBestStudents"/>
  </form>
  <br>
  <c:if test="${allStudents != null}">
    Кол-во студентов в институте: ${allStudents}
  </c:if>
  <c:if test="${largestFacultyName != null}">
    Самый большой факультет: ${largestFacultyName}
  </c:if>
  <c:if test="${bestStudents != null}">
    Список лучших студентов:
    <br>
    <c:forEach items="${bestStudents}" var="student">
      <br>
      Имя: ${student.sdName}, Фамилия: ${student.sdSurname}, Средний балл: ${student.sdAvgGrade}
      <br>
    </c:forEach>
  </c:if>
  </body>
</html>
