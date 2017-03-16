<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 15.03.2017
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>7 Wonders</title>
</head>
<body>
<table border=1 cellpadding=5>
  <tr>
    <th>Name</th>
    <th>Is admin</th>
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
