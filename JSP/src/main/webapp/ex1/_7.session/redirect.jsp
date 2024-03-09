<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect.jsp</title>
</head>
<body>
    request 속성 food의 값 : <%=request.getAttribute("food") %><br>
    session 속성 food의 값 : <%=session.getAttribute("food") %>
</body>
</html>