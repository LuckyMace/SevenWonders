<%--
  Created by IntelliJ IDEA.
  User: Pavel Ruban
  Date: 04.02.2017
  Time: 20:45
  Login Form
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>7 Wonders</title>
</head>
<body>

<table border=1 cellpadding=5>
  <tr>
    <th>Название</th>
    <th>Создатель</th>
    <th>Количество игроков</th>
    <th>Статус</th>
  </tr>
  <c:forEach items="${allGames}" var="game">
    <tr>
      <td>${game.name}</td>
      <td>${game.players.get(0).name}</td>
      <td>${game.number}</td>
      <td>${game.status.name}</td>
    </tr>
  </c:forEach>
</table>
<br/>
<form:form method="post" action="newgame/create">
  Название игры: <input type="text" name="game_name">
  <br/>
  <br/>
  Имя игрока: <input type="text" name="player_name">
  <br/>
  <br/>
  <input type="submit" name="create" value="Создать игру" />
  <input type="submit" name="enter" value="Войти в игру" />
</form:form>

</body>
</html>
