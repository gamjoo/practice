<%--sample1.txt를 파일 -> properties -> utf-8로 작성한다. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>sample</title>
<link rel="icon" href="${pageContext.request.contextPath}/image/home.ico">
<link href="${pageContext.request.contextPath}/css/ex1.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
</head>
<body>
<script>
$(function () {
 $("button").click(function() {
	 $("button").text("로딩완료").css("color","red");

/*
load() 메소드를 이용한 ajax 처리
 (1)서버에서 데이터를 가져오는 가장 간단한 형태의 메소드
 (2)서버로부터 데이터를 받아서 일치하는 요소 안에 HTML을 추가한다.
    만약 선택자와 일치하는 요소가 존재하지 않으면 ajax 요청이 전송되지 않는다.
    eg) $("p").load()인 경우 p태그가 존재하지 않으면 ajax 요청이 전송되지 않는다.
 (3)형식)
    load(url [, data] [, complete] )
    ①url : 정보를 요청할 URL
    ②data : 서버를 보낼 데이터
    ③complete : 요청이 완료되면 실행될 콜백 함수
 (4)콜백함수
    function(responseTxt, sataus, xhr)
    ①responseTxt : 서버로부터 리턴된 텍스트 데이터를 가져온다
    ②status : 서버로부터의 리턴된 상태를 가져온다. (성공인 경우 "success", 실패한 경우 "error")
    ③xhr : XMLHttpRequest 객체
     -xhr.statusText : 상태 설명 문자열을 가져 온다.(주로 오류 내용을 가져오기 위해 사용한다.)
     -xhr.status : 상태 코드를 가져온다.
      eg) 200 : 서버가 응답을 완료했으며 아무런 문제가 없는 경우
          404 : 파일을 찾지 못한 경우
          500 : 서버에서 클라이언트 요청을 처리 중 에러가 발생한 경우
 */
 //<p> 태그 영역에 "sample1.txt"의 내용을 불러온다.
 $("p").load("sample1.txt");
 $("pre").load("sample1.txt");
 })
})
</script>
 <button>변경</button>
 <p>변경전 : 줄이 안바뀌어요</p>
 <br>
 <pre>변경전 : 줄이 바뀝니다.(입력한 대로 출력됩니다.)</pre>
</body>
</html>