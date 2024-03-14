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
		//서버로 보낼 데이터를 폼에서 얻어온다.
		//입력 양식에 적힌 값을 쿼리스트링으로 바꾼다.
		const data=$("form").serialize();
		console.log(data);
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