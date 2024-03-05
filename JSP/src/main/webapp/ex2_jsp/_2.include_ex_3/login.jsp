<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="./../css/ch03-1.css" type="text/css" rel="stylesheet">
</head>
<body>
<form action="loginProcess" method="post">
	<h1>로그인</h1>
	 <hr>
	  <b>아이디</b>
	  <input type="text" name="id" placeholder="Enter id" required>
	  <b>Password</b>
	  <input type="text" name="passwd" placeholder="Enter passwrod" required>
	  <div class="clearfix">
	    <button type="submit" class="submitbtn">Submit</button>
	    <button type="reset" class="cancelbtn">cancel</button>
	  </div>
</form>
</body>
</html>