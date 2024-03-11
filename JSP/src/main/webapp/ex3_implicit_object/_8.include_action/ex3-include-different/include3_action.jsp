<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Include Directive Test</title>
</head>
<body>
  <h2>인클루드 액션 테스트 시작</h2>
  <jsp:include page="include1.jsp"/>
  <%-- <%=alias --%> <%--에러 발생 --%>
  <h2>인클루드 액션 테스트 끝</h2>
</body>
</html>