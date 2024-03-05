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
 
 tr:nth-child(n+2) td:first-child {
 	background:#ffa500;
 }
 
 td:last-child {
 	background:#ffff00;
 }
 
 .data {
 	width:90px;
 }
</style>
</head>
<body>
<table>
		<tr>
			<td colspan="2">Application 영역에 저장된 내용들</td>
		</tr>
		<tr>
			<td class="data">이름</td>
			<td><% String name = (String)application.getAttribute("name"); %>
			<%=name%></td>
		</tr>
		<tr>
			<td class="data">아이디</td>
			<td><% String id = (String)application.getAttribute("id"); %>
			<%=id%></td>
		</tr>
</table>
<br>
<br>
<table>
		<tr>
			<td colspan="2">Session 영역에 저장된 내용들</td>
		</tr>
		<tr>
			<td class="data">address</td>
			<td><% String address = (String)session.getAttribute("address"); %>
			<%=address%></td>
		</tr>
		<tr>
			<td class="data">tel</td>
			<td><% String tel = (String)session.getAttribute("tel"); %>
			<%=tel%></td>
		</tr>
		<tr>
			<td class="data">email</td>
			<td><% String email = (String)session.getAttribute("email"); %>
			<%=email%></td>
		</tr>
</table>
</body>
</html>