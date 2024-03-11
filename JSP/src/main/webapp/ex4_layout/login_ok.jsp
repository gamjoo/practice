<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 확인 화면</title>
</head>
<body>
<%
	String id = application.getInitParameter("id");
	String password = application.getInitParameter("password");
	
	String inputid = request.getParameter("id");
	String inputpassword = request.getParameter("passwd");
	
	//web.xml에서 가져온 값과 입력한 값을 비교한다.
	if (id.equals(inputid) && password.equals(inputpassword)) {
		session.setAttribute("id", id);
%>
<script>
	alert("<%=id%>님 환영합니다.");
	location.href = "templatetest.jsp";
</script>
<%
	} else if (id.equals(inputid)) {
%>
<script>
	alert("비밀번호를 확인하세요.");
	history.back();
</script>
<%
	} else {
%>
<script>
	alert("아이디를 확인하세요.");
	history.back();
</script>
<%
	}
%>
</body>
</html>