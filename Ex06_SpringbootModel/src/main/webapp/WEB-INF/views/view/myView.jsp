<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP-Model</title>
</head>
<body>
	<h1><% out.println("Model - Sub"); %></h1>
	<br/>
	<p>${OjbectTest}</p>
	<br/>
	<p>${list}</p>
	<br/>
	<ol>
		<c:forEach var="list" items="${list}">
			<li>${list}</li>
		</c:forEach>
	</ol>
	<br/>
	<p>당신의 이름은 <c:out value="${name}" /></p>
</body>
</html>