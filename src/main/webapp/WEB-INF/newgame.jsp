<%--
  Created by IntelliJ IDEA.
  User: Pavel Ruban
  Date: 15.03.2017
  Time: 20:19
  New Game Form
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>7 Wonders</title>
</head>
<body>
<table border=1 cellpadding=5>
  <tr>
    <th>Имя игрока</th>
    <th>Создатель</th>
  </tr>
  <c:forEach items="${players}" var="player">
    <tr>
      <td>${player.name}</td>
      <td>${player.isAdmin}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
