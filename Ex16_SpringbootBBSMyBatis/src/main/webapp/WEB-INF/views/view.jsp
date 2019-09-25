<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS View</title>
</head>
<body>
	<h1>내용 보기</h1>
	<hr/>
	<p>작성자 : <c:out value="${dto.writer}"></c:out></p>
	<p>제목 : <c:out value="${dto.title}"></c:out></p>
	<p>내용 : <c:out value="${dto.content}"></c:out></p>
	<br/>
	<p><a href="list">돌아가기</a></p>
</body>
</html>