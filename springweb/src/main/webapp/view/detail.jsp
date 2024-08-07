<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<h1>게시글 내용</h1>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>${board.getSeq()}</th>
		</tr>
		<tr>
			<th>제목</th>
			<th>${board.getTitle()}</th>
		</tr>
		<tr>
			<th>작성자</th>
			<th>${board.getWriter() }</th>
		</tr>
		<tr>
			<th>내용</th>
			<th>${board.getContents()}</th>
		</tr>

	</table>
	<a href="updateForm.jsp?seq=${board.getSeq()}">글수정</a>
	<a href="list.jsp">글 리스트로 가기</a>

	<br>
	<br>

	<form action="addPost.jsp" method="POST">
		<input type="hidden" name="seq" value="${ board.getSeq()}" />
		<button type="submit">즐겨찾기</button>
	</form>
</html>
