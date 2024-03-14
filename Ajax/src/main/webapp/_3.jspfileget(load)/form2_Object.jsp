<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>ajax</title>
<link href="${pageContext.request.contextPath}/css/form.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>

</head>
<script>
$(function () {
	$("form").submit(function(e) { //전송 버튼 클릭시
		e.preventDefault();//기본 이벤트 제거
		
		//객체 형태로 파라미터 이름과 값을 전달한다.
		const data = { "name" : $("#name").val(),
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
 <form>
  <span>이름</span><input type="text" placeholder="이름" id="name" name="name" required><br>
  <span>나이</span><input type="text" placeholder="나이" id="age" name="age" required><br>
  <span>주소</span><input type="text" placeholder="주소" id="address" name="address" required><br>
  <input type="submit" value="전송">
 </form>
 	<div></div>
</body>
</html>