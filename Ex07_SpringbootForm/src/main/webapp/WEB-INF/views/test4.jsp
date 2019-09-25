<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP-1</title>
</head>
<body>
	<h3><% out.println("#04 : Hello World"); %></h3>
	<br/>
	<p>당신의 아이디는 <c:out value='${studentId}' /></p>
	<p>당신의 이름은 <c:out value='${name}' /></p>
</body>
</html>