<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
 body {
 	text-align:center;
 }

</style>
</head>
<body>
<%
	String email = request.getParameter("email");
	session.setAttribute("email", email);
	
	String address = request.getParameter("address");
	session.setAttribute("address", address);
	
	String tel = request.getParameter("tel");
	session.setAttribute("tel", tel);
%>
<h1>영역과 속성 테스트</h1>
<% String name = (String)application.getAttribute("name"); %>
<h2><%=name%>님의 정보가 모두 저장되었습니다.</h2>
<a href="attributeTest3.jsp">확인하러 가기</a>
</body>
</html>