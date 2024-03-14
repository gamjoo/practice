<%--sample1.txt를 파일 -> properties -> utf-8로 작성한다. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>sample</title>
<link rel="icon" href="${pageContext.request.contextPath}/image/home.ico">
<link href="../css/ex1.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-3.7.1.js"></script>
</head>
<body>
 <button>변경</button>
 <p>변경전 : 줄이 안바뀌어요</p>
 <br>
 <pre>변경전 : 줄이 바뀝니다.(입력한 대로 출력됩니다.)</pre>
</body>
</html>