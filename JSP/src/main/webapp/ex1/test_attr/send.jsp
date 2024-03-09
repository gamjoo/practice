<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
 td:first-child {font-weight:bold;}
</style>
</head>
<body>
	<table class="table">
		<tbody>
			<tr>
				<td>아이디</td>
				<td><%=request.getAttribute("id") %>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%=request.getAttribute("pass") %>
			</tr>
			<tr>
				<td>주민번호</td>
				<td><%=request.getAttribute("jumin1") %>-<%=request.getAttribute("jumin2") %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=request.getAttribute("email") %>@<%=request.getAttribute("domain") %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=request.getAttribute("gender") %></td>
			</tr>
			<tr>
				<td>취미</td>
				<td><% String[] values = request.getParameterValues("hobby"); 
				for (String val : values) {
					out.print(val+" ");
				}
				%>
				</td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><%=request.getAttribute("post1") %></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><%=request.getAttribute("address") %></td>
			</tr>
			<tr>
				<td>자기소개</td>
				<td><%=request.getAttribute("intro") %></td>
			</tr>
			
		</tbody>
	</table>
</body>
</html>