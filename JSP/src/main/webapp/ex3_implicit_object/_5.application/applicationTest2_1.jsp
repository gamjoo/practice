<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>

<html>
<head>
	<title>Application Test - 초기화 파라미터 읽어오기</title>
</head>
<%--
초기화 파라미터는 web.xml에 작성한다.
1.getInitParameterNames() : 웹 애플리케이션 초기화 파라미터의 이름 목록을 리턴
2.getInitParameter(Name) : 이름이 Name인 웹 애플리케이션 초기화 파라미터의 값을 읽어온다.
						   존재하지 않을 경우 null 리턴
 --%>
<body>
	<h2>초기화 파라미터 목록</h2>
	<ul>
	  <%
Enumeration<String> initParamEnum = application.getInitParameterNames();
while (initParamEnum.hasMoreElements()){
	String initParamName =  initParamEnum.nextElement();
	  %>
		<li>
		<%=initParamName %> =
		<%=application.getInitParameter(initParamName) %>
		</li>
	  <%
		}
	  %>
	</ul>
</body>
</html>
