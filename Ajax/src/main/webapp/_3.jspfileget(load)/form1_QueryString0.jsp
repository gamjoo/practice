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
		
		//쿼리스트링 형식으로 파라미터의 이름과 값의 형태로 전달한다.
		//$("div").load("process.jsp", "name=love&age=21&address=서울시");
		const name="name=" + $("#name").val(); //쿼리스트링 작성시 매개변수와 "="사이에 공백없이 작성
		const age="age=" + $("#age").val();
		const address="address="+$("#address").val();
		const data=name + "&" + age + "&" + address;
	
//		const data=$("input:eq(0)").prop("name")+"="+$("input:eq(0)").val()+"&"
//		+$("input:eq(1)").prop("name")+"="+$("input:eq(1)").val()+"&"
//		+$("input:eq(2)").prop("name")+"="+$("input:eq(2)").val()
		//"name=love&age=21&address=서울시"
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