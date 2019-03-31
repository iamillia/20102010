<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 31.03.2019
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Результат</title>
</head>
<body>
<h3>Результат:</h3>
<c:if test="${choise == 1}">
    <h5>Количество студентов, учащихся в институте: ${count}<h5>
</c:if>
<c:if test="${choise == 2}">
    <h5>Факультет, на котором учится наибольшее количество студентов:
            <c:out value="${faculty}"/>
        <h5>
</c:if>
<c:if test="${choise == 3}">
    <h5>Список студентов, у которых средний балл в диапазоне 95-100:<br>
        <c:forEach var="i" items="${list}">
            ${i}<br>
        </c:forEach><h5>
</c:if>
</body>
</html>
