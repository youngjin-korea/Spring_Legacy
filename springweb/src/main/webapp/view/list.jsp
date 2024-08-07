<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 목록</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f8f9fa;
	margin: 0;
	padding: 20px;
}

a {
	display: inline-block;
	margin-bottom: 10px;
	padding: 10px 15px;
	background-color: #007bff;
	color: white;
	text-decoration: none;
	border-radius: 5px;
}

a:hover {
	background-color: #0056b3;
}

table {
	width: 100%;
	border-collapse: collapse;
	background-color: white;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
	padding: 12px;
	text-align: left;
	border-bottom: 1px solid #dee2e6;
}

th {
	background-color: #343a40;
	color: white;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

#first {
	display: flex;
	justify-content: space-between;
	margin-bottom: 20px;
}

#frist #title {
	font-size: 2rem;
	font-weight: bold;
}
</style>
</head>
<body>
	<div id="first">
		<div id="title">글목록</div>

		<div id="buttons">
			<button id="logout" onclick="location.href='logout.jsp'">로그아웃
			</button>
			<button id="logout" onclick="location.href='bookmark.jsp'">즐겨찾기
			</button>
		</div>
	</div>


	<a href="/board_insert"> 글쓰기 </a>
	<table>
		<tr>
			<th>글 번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>

		<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.seq}</td>
				<td><a href="board_detail${board.seq}">${board.title}</td>
				<td>${board.writer }</td>
				<td><fmt:parseDate var="dt" value="${board.regdate }"
						pattern="yyyy-MM-dd" /> <fmt:formatDate value="${dt }"
						pattern="yyyy/MM/dd" /></td>
				<td>${board.hitcounts }</td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<br>

</body>
</html>
