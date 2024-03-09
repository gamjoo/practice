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
 
 td:nth-child(2n) {
 	background:yellow;
 }
 
 tr:first-child td {
 	background:#a9f1a9;
 }
 
 .data {
 	width:90px;
 	background:#ffa500;
 }
 
 tr:last-child td {
 	background:green;
 }
</style>
</head>
<body>
<%
   String name = request.getParameter("name");
   application.setAttribute("name", name);
   
   String id = request.getParameter("id");
   application.setAttribute("id", id);
%>
<h1>영역과 속성 테스트</h1>
<%
	name = (String)application.getAttribute("name");
	id = (String)application.getAttribute("id");
%>
<h2><%=name%>님 반갑습니다.</h2>
<h2><%=name%>님의 아이디는 <%=id%>입니다.</h2>
<form action="attributeTest2.jsp" method="post">
<table>
		<tr>
			<td colspan="2">Session 영역에 저장할 내용들</td>
		</tr>
		<tr>
			<td class="data">e-mail 주소</td>
			<td><input type="text" name="email" id="email"></td>
		</tr>
		<tr>
			<td class="data">집 주소</td>
			<td><input type="text" name="address" id="address"></td>
		</tr>
		<tr>
			<td class="data">전화번호</td>
			<td><input type="text" name="tel" id="tel"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="전송" id="submitbtn"></td>
		</tr>
</table>
</form>
</body>
</html>