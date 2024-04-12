<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>회원 리스트-list.jsp</title>
<link href="${pageContext.request.contextPath}/css/login.css" type="text/css" rel="stylesheet">
<body>
  <form action="joinPro.net" method="post">
    <h1>회원가입</h1>
    <hr>
    <b>아이디</b>
    <input type="text" name="id" maxLength="10" placeholder="Enter id" required>
    <b>Password</b>
    <input type="password" name="password" maxLength="10" placeholder="Enter password" required>
    <div class="clearfix">
      <button type="submit" class="submitbtn">회원가입</button>
      <button type="reset" class="cancelbtn">취소</button>
    </div>
  </form>
</body>
</html>