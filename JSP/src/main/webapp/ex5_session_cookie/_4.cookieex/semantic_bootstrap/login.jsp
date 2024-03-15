<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="<%=request.getContextPath()%>/js/jquery-3.7.1.js"></script>
  <style>
    .container{margin:3em auto; border:1px solid lightgray;width:500px}
  </style>
</head>

<% 
	String idvalue = "";
	String cookie = request.getHeader("Cookie");
	
	if(cookie != null) {
		Cookie cookies[] = request.getCookies();
		for (int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals("idpass")) {
				idvalue = cookies[i].getValue();
			}
		}
	}
%>


<script>
$(document).ready(function () {
	if ("<%=idvalue%>" != "") {
		$("#remember").prop("checked", true)
		$("#id").val("<%=idvalue%>"); 
	}
})
</script>

<body>
<form name="loginform" action="LoginProcess.net" method="post">
  <h1>로그인</h1>
  <hr>
  <b>아이디</b>
  <input type="text" name="id" placeholder="Enter id" required>
  
  <b>Password</b>
  <input type="password" name="pass" placeholder="Enter passwrod" required>
  <input type="checkbox" id="remember" name="remember" value="store">
  <span>remember</span>
  
  <div class="clearfix">
    <button type="submit" class="submitbtn">로그인</button>
    <button type="button" class="join">회원가입</button>
  </div>
</form>
</body>
</html>