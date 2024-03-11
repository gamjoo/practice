<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>JSTL core 라이브러리 사용 예제 2</title>
</head>
<body>
<%--
*Cross-Site Scripting(XSS)
 악의적으로 사용자가 공격하려는 사이트에 스크립트를 넣는 기법
 공격에 성공하면 사이트에 접속한 사용자는 삽입된 코드를 실행하게 되면서
 의도치 않은 행동을 수행시킨다.
 --%>
 <c:set var="test" value="<script>alert('환영합니다1')</script>" />
 <c:out value="${test }" escapeXml="true" />
 <%--value="${test}" 또는 value="${test}" 작성할 수 있다. --%>
 <%--
 <c:out>의 escapeXml 속성의 기본값은 true이고 html의 특수문자를 해당 코드로 변환한다.
 특수문자 -> 코드
   <      &lt;
   >      &gt;
   '      &#039;
   "      &#034;
   페이지 소스 보기 : &lt;script&gt;alert(&#039;환영합니다.&#039;)&lt/script&gt;
   시행 결과 : <script>alert('환영합니다.')</script>
  --%>
  
  <c:set var="test" value='<script>alert("환영합니다2")</script>' />
  <c:out value="${test }"/>
  <%--  &lt;script&gt;alert(&#034;환영합니다2&#034;)&lt;/script&gt;
   --%>
</body>
</html>