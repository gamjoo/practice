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
	<span>서비스 처리 과정에서 널(NULL) 에러가 발생했습니다.</span>
</body>
</html>