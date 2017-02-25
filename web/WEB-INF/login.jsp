<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.02.2017
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--<span>${message}</span>--%>

<table>
<c:forEach items="${currentGames}" var="currentGame">
<tr>
<td>${currentGame.name}</td>
<td>${currentGame.number}</td>
<td>${currentGame.status}</td>
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
