<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%--
empty 연산자
형식) empty 값
 1.값이 비어있거나 null인지를 조사할 때 사용하는 연산자.
 2.값이 null이면 true를 반환한다.
 3.문자열과 배열의 크기가 0인 경우에도 true를 반환한다.
 --%>
 <%
 pageContext.setAttribute("food","과자");
 %>
 
 <%-- \로 시작하면 그대로 출력된다. 즉 , EL 문법이 아닌 일반 텍스트로 취급된다 --%>
 <h3>\${pageScope.food}=${pageScopre.food}</h3>
 <h3>\${food}=${food}</h3>
 
 <h3>\${empty food}=${empty food}</h3>
 <h3>\${empty foo2}=${empty food2}</h3>
 
 <h3>\${null==food}=${null==food}</h3>
 <h3>\${null==food2}=${null==food2}</h3>
 
 <%--name 파라미터가 존재하지 않을 경우 아무 것도 출력되지 않는다 --%>
 <h3>\${param.name}=${param.name}</h3>
</body>
</html>