<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
	body {
		background:#f1d39b; text-align:center;
	}
	
	@keyframes colorChange {
		15% {color : red;}
		30% {color : orange;}
		45% {color : yellow;}
		60% {color : green;}
		75% {color : blue;}
		100% {color : purple;}
	}
	
	span {
		font-weight : bold;
		font-size : 40px;
		animation-name : colorChange;
		animation-duration : 5s;
		animation-iteration-count : infinite;
	}
</style>
</head>
<body>
	<span>404 error</span><br>
	<strong>요청한 페이지는 존재하지 않습니다:</strong>
	<br>
	<br>
	주소를 올바르게 입력했는지 확인해보시기 바랍니다.
</body>
</html>