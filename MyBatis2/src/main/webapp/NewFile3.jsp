<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>조회기간</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script>
$(function () {
	$('form').submit(function() {
		start = $('input[name=startday]').val();
		if(start == '' && end != '') {
			alert("start 날짜를 선택하세요")
			return false;
		} else if (start != '' && end == '') {
			alert("end 날짜를 선택하세요")
			return false;
		} else if (start > end) {
			alert("시작날짜와 끝날짜를 확인해주세요")
			return false;
		}
	})
})
</script>
</head>
<body>
<%--

조회 조건 : 맵에 저장시 <String, String> 형으로 사용한다.
1. 입력 없는 상태에서 검색을 클릭한 경우.
  select * from emp
  
2. 조회 기간만 입력한 경우
  select * from emp where hiredate between ? and ?
  
3. 부서번호만 입력한 경우
  select * from emp where deptno=?
  
4. 조회 기간과 부서번호를 입력한 경우
  select * from emp
  where hiredate between ? and ?
  and deptno = ?
 --%>
<form action="${pageContext.request.contextPath}/term3.emp" method="post">
  <label>조회기간</label><br>
  <input type="date" name="startday" min="1980-01-01" max="1987-12-31">
  ~<input type="date" name="endday" min="1980-01-01" max="1987-12-31">
  <br>
  
  <label>부서번호</label><br>
  <select name="deptno">
    <option value="">부서번호를 선택하세요</option>
    <option value="10">10</option>
    <option value="20">20</option>
    <option value="30">30</option>
    <option value="40">40</option>
  </select>
  <input type="submit" value="검색">
</form>
</body>
</html>