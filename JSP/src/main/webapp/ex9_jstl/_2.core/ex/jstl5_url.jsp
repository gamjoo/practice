<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
url을 생성하는 기능을 한다.
이 태그를 사용하면 쉽게 매개변수를 포함한 URL을 손쉽게 만들 수 있다.
 --%>
<%--
url 태그를 생성하는 기능을 한다.
이 태그를 사용하면 쉽게 매개변수를 표함한 url을 손쉽게 만들 수 있다
 --%>
<c:url var="ex" value="jstl1_base.jsp" />
 <a href="${ex}">처음 예제로 이동</a>
 <%-- <a href="jstl1_base.jsp">처음 예제로 이동</a> --%>
<br>
<br>

<%--
<c:param>태그에 파라미터를 전달하기 위한 태그.
name 속성에 파라미터 이름을 입력하고 value에 값을 입력하여 전달한다.
--%>

<c:url var="ex" value="jstl6_param.jsp">
 <c:param name="id" value="start"/>
 <c:param name="name" value="홍길동"/>
</c:url>
<a href="${ex}">매개변수 전달 예제로 이동</a>