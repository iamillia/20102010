
<%--
  Created by IntelliJ IDEA.
  User: sobaka
  Date: 2019-04-06
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Films&Actors</title>
  </head>
  <body>
  Choose the option you would like to check:
  <form action="controlling" method="GET">
  <br><input type="radio" name="radioValue" value="allActors" checked>See all actors
      <br><input type="radio" name="radioValue" value="allFilms">See all Films
      <br><input type="radio" name = "radioValue" value = "coActors">Actors who played with<input type="text" name="actor">
  <br><input type="radio" name="radioValue" value="maxActor">Film with the most amount of actors
  <br><input type="radio" name = "radioValue" value = "minFilmsActor">Actors with the smallest amount of films
  <br><button type="submit" name="submit">Sumbmit</button>
  </form>
  </body>
</html>
