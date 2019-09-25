<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS - Write</title>
<style type="text/css">
	table{
		cellpadding: 0;
		cellspacing: 0;
		border: 1;
	}
</style>
</head>
<body>
	<form action="write" method="post">
		<table>
			<tbody>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer" /></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><input type="text" name="content" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="입력" /></td>
					<td><a href="list">돌아가기</a></td>
				</tr>
			</tbody>	
		</table>	
	</form>
</body>
</html>