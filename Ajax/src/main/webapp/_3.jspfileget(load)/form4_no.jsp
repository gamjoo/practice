<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>ajax</title>
<link href="${pageContext.request.contextPath}/css/form.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<style>
body{text-align:center}
</style>
</head>
<script>
$(function () {
	$("button").click(function(e) { //전송 버튼 클릭시
		const data = {"name" : $("#name").val(),
			   		  "age" : $("#age").val(),
			   		  "address" : $("#address").val()
					 };
		$("div").load("process.jsp", data);
	});
});
</script>
<body>
<%--
form태그의 action 속성 없다. 이 상태에서 전송을 클릭하면 현재 URL를 다시 불러온다.
 --%>
  <span>이름</span><input type="text" placeholder="이름" id="name" name="name" required><br>
  <span>나이</span><input type="text" placeholder="나이" id="age" name="age" required><br>
  <span>주소</span><input type="text" placeholder="주소" id="address" name="address" required><br>
  <button type="button">전송</button>
 	<div></div>
</body>
</html>