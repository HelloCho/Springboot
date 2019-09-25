<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC Template</title>
</head>
<body>
	<h1><%out.println("Jdbc Template : Hello World"); %></h1>
	<hr/>
	<ol>
	<c:forEach var="dto" items="${users}">
		<li><c:out value="${dto.id}" /> - <c:out value="${dto.name}" /></li>
	</c:forEach>
	</ol>
</body>
</html>