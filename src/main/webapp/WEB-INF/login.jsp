<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.02.2017
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>7 Wonders</title>
</head>
<body>

<table border=1 cellpadding=5>
  <tr>
    <th>Name</th>
    <th>Number of players</th>
    <th>Status</th>
  </tr>
  <c:forEach items="${allGames}" var="game">
    <tr>
      <td>${game.name}</td>
      <td>${game.number}</td>
      <td>${game.status}</td>
    </tr>
  </c:forEach>
</table>
<form:form method="post" action="newgame">
  Название игры: <input type="text" name="game_name">
  <br/>
  Имя игрока: <input type="text" name="player_name">
  <br/>
  <input type="submit" value="Создать игру" />
  <input type="submit" value="Войти в игру" />
  <input type="submit" value="Выход" />
</form:form>

</body>
</html>
