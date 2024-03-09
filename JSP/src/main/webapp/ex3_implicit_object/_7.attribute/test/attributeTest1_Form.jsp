<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
 body {
 	text-align:center;
 }
 
 table {
 	margin:0 auto;
 }
 
 tr, td {
 	border-collapse:collapse;
 }
 
 td {
 	width:270px;
 	height:40px;
 }
 
 tr:first-child td {
 	background:#a9f1a9;
 }
 
 .data {
 	width:90px;
 	background:#ffa500;
 }
 
 td:nth-child(2n) {
 	background:yellow;
 }
 
 tr:last-child td {
 	background:green;
 }
</style>
</head>
<body>
<h1>영역과 속성 테스트</h1>
<form action="attributeTest1.jsp" method="post">
<table>
		<tr>
			<td colspan="2">Application 영역에 저장할 내용들</td>
		</tr>
		<tr>
			<td class="data">이름</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td class="data">아이디</td>
			<td><input type="text" name="id" id="id"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="전송" id="submitbtn"></td>
		</tr>
</table>
</form>
</body>
</html>