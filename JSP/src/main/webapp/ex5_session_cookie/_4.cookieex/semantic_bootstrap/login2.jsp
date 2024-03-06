<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Cookie cookie = new Cookie("langauge1", request.getParameter("id"));

cookie.setMaxAge(60*60*24);
response.addCookie(cookie);
%>
<script>
	location.href=""
</script>