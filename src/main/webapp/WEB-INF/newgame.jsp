<%--
  Created by IntelliJ IDEA.
  User: Pavel Ruban
  Date: 15.03.2017
  Time: 20:19
  New Game Form
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>7 Wonders</title>
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/main.css" rel="stylesheet">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/sockjs-client/sockjs.min.js"></script>
    <script src="/webjars/stomp-websocket/stomp.min.js"></script>
    <script src="static/js/gameCreate.js"></script>
</head>
<body>
<table border=1 cellpadding=5 id="playerTable">
    <tr>
        <th>Имя игрока</th>
        <th>Роль</th>
        <th>Город</th>
    </tr>
    <c:forEach items="${players}" var="player">
        <tr >
            <td>${player.name}</td>
            <td>${player.role.name}</td>
            <td>
                <c:choose>
                    <c:when test="${player.name==session.currentPlayer.name}">
                        <form:form method="post" action="newgame/save-selected-wonder">
                            <select name="selected_wonder" onchange='this.form.submit()'>
                                <c:forEach var="wonder" items="${wonders}">
                                    <c:if test="${player.selectedWonder.id==wonder.id}">
                                        <option value="${wonder}" selected>${wonder.name}</option>
                                    </c:if>
                                    <c:if test="${player.selectedWonder.id!=wonder.id}">
                                        <option value="${wonder}">${wonder.name}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </form:form>
                    </c:when>
                    <c:otherwise>
                        ${player.selectedWonder.name}
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
</table>

<br>
<select disabled name="selected_game_type">
    <c:forEach var="gameType" items="${gameTypes}">
        <c:choose>
            <c:when test="${currentGame.gameType.id == gameType.id}">
                <option selected value="${gameType}">${gameType.name}</option>
            </c:when>
            <c:otherwise>
                <option value="${gameType}">${gameType.name}</option>
            </c:otherwise>
        </c:choose>
    </c:forEach>
</select>

<br><br>
<c:forEach var="gameSide" items="${gameSides}">
    <c:choose>
        <c:when test="${currentGame.gameSide.id == gameSide.id}">
            <input name="gameSide" type="radio" checked disabled value="${gameSide.code}"/>${gameSide.name}
        </c:when>
        <c:otherwise>
            <input name="gameSide" type="radio" disabled value="${gameSide.code}"/>${gameSide.name}
        </c:otherwise>
    </c:choose>
</c:forEach>

<br><br>
<table border=0>
    <tr>
        <c:if test="${session.currentPlayer.role.code==\"admin\"}">
            <td>
                <form:form method="post" action="newgame/start">
                    <input type="submit" value="Начать"/>
                </form:form>
            </td>
        </c:if>
        <td>
            <form:form method="post" action="newgame/leave">
                <input type="submit" value="Выход"/>
            </form:form>
        </td>
    </tr>
</table>

<script>
    $( document ).ready(function() {
        connect();
    });
</script>

</body>
</html>
