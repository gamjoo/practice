<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
 //쿠키 객체를 생성하고 language1이라는 쿠키 이름에
 //입력받은 language 설정 값을 저장한다.
 Cookie cookie = new Cookie("language1",  request.getParameter("language"));
 
//시간을 설정하지 않으면(setMaxAge()메소드 사용하지 않을 때)
//브라우저 종료시 쿠키도 삭제된다
//또는 메소드를 호출할 때 인자값으로 0을 주면 쿠키는 삭제 된다
 cookie.setMaxAge(60*60*24);//쿠키 유효시간을 24시간으로 설정. (단위는 초)
 response.addCookie(cookie);//클라이언트로 쿠키값을 전송한다
%>
<script>
	location.href="cookieExample.jsp" /*cookieExample.jsp로 돌아간다*/
</script>