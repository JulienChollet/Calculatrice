<%@ page import="com.octp.bean.Operation" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 23/06/2018
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculatrice</title>
</head>
<body>
<div>

<form method="post" action="/calculette">
    <input type="number" name="firstNumber" id="firstNumber" >

    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">x</option>
        <option value="/">/</option>
    </select>
    <input type="number" name="secondNumber" id="secondNumber">
    <input type="submit" value="resultat" >
</form>
</div>
<p>
    <c:choose>
        <c:when test="${operation.secondNumber == 0 && operation.operator =='/'}">Division par zéro impossible!</c:when>
        <c:otherwise>Le résultat est: ${operation.result}</c:otherwise>
    </c:choose>
</p>
</body>
</html>
