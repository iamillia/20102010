<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>Университет</title>
  </head>
  <body>
  <h5>Отобразить список:</h5>
  <form action="/controller">
    <p><select name="choise">
      <option value="1">Знайти загальну кількість студентів, що навчається в інституті</option>
      <option value="2">Знайти факультет, на якому навчається найбільша кількість студентів</option>
      <option value="3">Скласти список студентів, у яких середній бал в діапазоні 95-100</option>
    </select></p>
    <p><input type="submit" value="Отправить"></p>
  </form>


  </body>
</html>
