<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글쓰기</h3>
	<hr>
	<form action="board_insert" method="post">
		작성자: <input type="text" name="writer"><br> 제목: <input
			type="text" name="title"><br> 내용:<br>
		<textarea rows="6" cols="70" name="contents"></textarea>
		<br> <input type="submit" value="등록">
	</form>
</body>
</html>