<%--
  Created by IntelliJ IDEA.
  User: Pavel Ruban
  Date: 04.02.2017
  Time: 20:45
  Login Form
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
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
        <th>Выбрать</th>
    </tr>
    <form:form name="saveSelectedGame" method="post" action="/login/save-selected-game">
        <c:forEach items="${allGames}" var="game">
            <tr>
                <td>${game.name}</td>
                <td>${game.players.get(0).name}</td>
                <td>${game.number}</td>
                <td>${game.status.name}</td>
                <td>
                    <c:if test="${game.id==session.selectedGameId}">
                        <input name="selectedGame" type="radio" value="${game.id}" onclick="this.form.submit()" required
                               checked/>
                    </c:if>
                    <c:if test="${game.id!=session.selectedGameId}">
                        <input name="selectedGame" type="radio" value="${game.id}" onclick="this.form.submit()"
                               required/>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </form:form>
</table>


<br/>
<form:form method="post" action="newgame/create">
    Название игры: <input type="text" name="game_name">
    <br/>
    <br/>
    Имя игрока: <input type="text" name="player_name" required>
    <br/>
    <br/>
    <input type="submit" name="create" value="Создать игру"/>
    <input type="submit" name="enter" value="Войти в игру"/>
    <br/>

    <c:if test="${valSelectedGame == true}">
        <p style="color: red">Game is not selected. Please, select the game! </p>
    </c:if>

    <c:if test="${valEmptyGameName == true}">
        <p style="color: red">Game name is empty. Please, write the game name! </p>
    </c:if>

    <c:if test="${valPlayerName == true}">
        <p style="color: red">Player with this name already exists in game </p>
    </c:if>

    <c:if test="${valMaxPlayers == true}">
        <p style="color: red">The maximum number of players for game is 7 </p>
    </c:if>
</form:form>

</body>
</html>
