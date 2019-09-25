<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS</title>
<style type="text/css">
	table {
		cellpadding: 0;
		cellspacing: 0;
		border: 1;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td><c:out value="${dto.id}"></c:out></td>
				<td><c:out value="${dto.writer}"></c:out></td>
				<td><a href="view?id=${dto.id}"><c:out value="${dto.title}"></c:out></a></td>
				<td><a href="delete?id=${dto.id}">X</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href="writeForm">글작성</a></p>
</body>
</html>