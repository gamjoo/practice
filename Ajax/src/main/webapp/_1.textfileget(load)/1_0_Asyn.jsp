<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>비동기 예제</title>
<link rel="icon" href="${pageContext.request.contextPath}/image/home.png">
</head>
<body>
 <script>
  console.log("1");
  
  //비동기 처리 : 아래의 코드가 실행 중이지만 다음 명령의 코드가 실행
  setTimeout(function() {
	  console.log("2");
  }, 3000);
  
  console.log("3");
  
 </script>
</body>
</html>