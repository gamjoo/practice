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
	<span>500 error</span><br>
	<strong>요청한 페이지는 존재하지 않습니다:</strong>
	<br>
	<br>
	소스 코드의 오타를 확인해주세요.
</body>
</html>