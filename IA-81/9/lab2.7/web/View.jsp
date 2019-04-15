<%--
  Created by IntelliJ IDEA.
  User: sobaka
  Date: 2019-04-13
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answers</title>
</head>
<body>
<c:if test="${option == 1}">
    List of Actors:
    <c:forEach var="i" items="${base.getActors()}">
        <p><c:out value="${i}"/></p>
    </c:forEach>
</c:if>
<c:if test="${option == 2}">
    List of films
    <c:forEach var="i" items="${base.getFilms()}">
    <p><c:out value="${i}"/></p>
    </c:forEach>
</c:if>
<c:if test="${option ==3}">
    ${minFilms}
</c:if>
<c:if test="${option==4}">
    <c:if test="${WrongActor!=null}">
    <c:if test="${!ListOfActors.contains(WrongActor)}">
        Sorry, we didnt hear about ${WrongActor}
    </c:if>
    </c:if>
    ${coActors}
</c:if>
<c:if test="${option ==5}">
    ${maxActor}
</c:if>
<br><a href="index.jsp">Go back</a>
</body>
</html>
