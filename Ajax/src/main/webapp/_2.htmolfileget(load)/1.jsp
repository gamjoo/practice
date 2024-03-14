<%--sample1.txt를 파일 -> properties -> utf-8로 작성한다. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>서버의 데이터를 대상 엘리먼트에 삽입하기</title>
<link rel="icon" href="${pageContext.request.contextPath}/image/home.ico">
<link href="${pageContext.request.contextPath}/css/ex2.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script>
$(function() {
  $("button").click(function() { //변경을 클릭하면
    $("button").text("로딩완료").css("color","red");
    $("#container").load("resource1.html");
  })
})
</script>
</head>
<body>
 <button>서버로부터 데이터 가져오기</button>
 <div id="container">데이터 가져오기 전</div>
</body>
</html>