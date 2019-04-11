<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: vicwa
  Date: 07.04.2019
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<hr>
<strong>Общее число студентов на факультетах :</strong>

 <c:out value="${Task1}"/>
<br>
<strong>Факультет, на котором учится наибольшее количество студентов:</strong>
        <c:out value="${Task2}"/>
<br>
<strong>Список людей, котрые имею балы от 95 до 100 :</strong>
<c:forEach var="i" items="${Task3}">
    ${i.getName()}
</c:forEach>
<hr>
</body>
</html>
