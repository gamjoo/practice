<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>회원 리스트-list.jsp</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
</head>
<body>
<div class="container">
<fieldset>
 <legend style="text-align:center;color:#17a2b8;">회원 리스트</legend>
<!-- <h2 style="text-align:center;color:#17a2b8;">회원 리스트</h2>  -->
  <table class="table">
    <tr>
      <th>아이디</th>
      <th>비밀번호</th>
      <th>수정</th>
      <th>삭제</th>
    </tr>
    <c:forEach var="a" items="${list}">
      <tr>
        <td>${a.id}</td>
        <td>${a.password}</td>
        <td><button type="button" class="btn btn-info btn-sm" data-id="${a.id}">수정</button></td>
        <c:if test="${a.id != 'admin'}">
          <td><button type="button" class="btn btn-danger btn-sm" data-id="${a.id}">삭제</button></td>
        </c:if>
        <c:if test="${a.id == 'admin'}">
          <td></td>
        </c:if>
      </tr>
    </c:forEach>
  </table>
  <div><a href="main.net">메인으로</a></div>
</fieldset>
</div>
<script>
$(".btn-info").click(function() {
	const id=$(this).attr("data-id")
	location.href = "updateForm.net?id=" + id
})

$(".btn-danger").click(function() {
	const id=$(this).attr("data-id")
	location.href = "delete.net?id=" + id
})
</script>
</body>
</html>