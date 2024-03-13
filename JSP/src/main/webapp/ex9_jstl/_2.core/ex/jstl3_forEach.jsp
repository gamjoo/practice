<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>JSTL core 라이브러리 사용 예제2</title>
</head>
<body>
<%--
자바의 for문과 유사하다.
 items 속성에 컬렉션이나 배열 형태의 객체를 지정하여 객체의 인덱스만큼 반복할 수 있다.
 begin : 시작 인덱스
 end : 끝 인덱스
 step : 증감식
 var : 반복 중일 경우 현재 반복하고 있는 값을 기억하는 변수
 --%>
 
 <c:forEach var="test" begin="1" end="10" step="2">
  <b>${test}</b>&nbsp;
 </c:forEach>
 <hr>
 
<%
 pageContext.setAttribute("nameList",
		 new String[] {"홍길동", "임꺽정", "일지매", "신사임당"});
%>
<%--
배열의 모든 내용을 출력한다.
items에는 ${pageScope.nameList} 또는 ${nameList} 사용 가능
 --%>
 <ol>
  <c:forEach var="name" items="${pageScope.nameList}">
   <li>${name }</li>
  </c:forEach>
 </ol>
 <hr>
 
 <%--배열의 인덱스 2부터 3까지 내용을 출력한다.
     참조할 변수의 개수를 제한한다. --%>
 <ul>
  <c:forEach var="name" items="${nameList}" begin="2" end="3">
   <li>${name }</li>
  </c:forEach>
 </ul>
<hr>

<%--
varStatus 속성은 반복 정보를 담고 있는 객체(LoopTagStatus)를 저장할 변수명을 값으로 갖는다.
 varStatus="status"인 경우
 status.index : 반복 실행에서 현재의 인덱스값을 의미한다.
 status.count : 반복 실행 횟수를 의미한다.
--%>
<ul>
 <c:forEach var="name" items="${nameList }" begin="2" end="3"
 		    varStatus="status">
  <li>반복 ${status.count}번째 => index[${status.index }]:${name}</li>
 </c:forEach>
</ul>
<hr>
</body>
</html>