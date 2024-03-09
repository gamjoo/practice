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
<!-- request객체의 getAttribute()메소드를 이용해서 속성 "food"의 값을 가져온다. -->
<%-- jsp에서 <%=값 또는 수식 또는 변수 %>는 '값 또는 수식 또는 변수'를 출력하라는 의미. --%>
  <div>
    request 속성 food의 값 : <%=request.getAttribute("food") %> <br>
    request 속성 name의 값 : <%=request.getAttribute("name") %>
  </div>
  <p>
     요청주소입니다. : <%=request.getRequestURL() %>
  </p>
</body>
</html>