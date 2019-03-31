<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ann
  Date: 31.03.2019
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Список акторів:
<c:forEach var="i" items="${b.getActors()}">
    <c:out value="${i}"/>
</c:forEach>
<br>
Завдання 1
<br>
${task1}
<br>
Завдання 2
<br>
<c:if test="${!empty task2}">
 ${task2}
</c:if>
<c:if test="${empty task2}">
    <c:out value="Такого актора немає."/>
</c:if>
<br>
Завдання 3
<br>
${task3}
</body>
</html>
