<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dispatcher.jsp</title>
<style>
 body {background:pink;}
 div {color:red;}
 p {color:green;}
</style>
</head>
<body>
<!-- request객체의 getParameter()메소드를 이용해서 파라미터 "food"의 값을 가져온다. -->
<%-- jsp에서 <%=값 또는 수식 또는 변수 %>는 '값 또는 수식 또는 변수'를 출력하라는 의미. --%>
  <div>
    request 파리미터 값 : <%=request.getParameter("food") %>
  </div>
  <p>
    보여주는 페이지 주소입니다. : <%=request.getRequestURL() %>
  </p>
</body>
</html>