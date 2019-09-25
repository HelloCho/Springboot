<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ValidateDone</title>
</head>
<body>
	<h1>CreatedonPage.jsp</h1>
	<p>이름 : <c:out value="${dto.writer}" /></p>
	<p>내용 : <c:out value="${dto.content}" /></p>
</body>
</html>