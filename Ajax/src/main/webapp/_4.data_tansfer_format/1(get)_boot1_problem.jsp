<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>XML 파일을 GET방식으로 로드하기</title>
<style>
td:nth-child(3n) {text-align:right}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script>
/*
- $.get() 메소드를 이용해서 item.xml 파일을 불러온다.
- $.get() 메소드의 첫번째 매개변수에는 서버의 URL 주소를 지정한다.
- $.get() 메소드의 두번째 매개변수인 콜백함수를 이용해서 서버에서 보내온
  XML 형식의 데이터를 변수 data로 받는다.
 */
$(function() {
	$("button").click(function() {
		$.get("item.xml", function(data) {
			$("table").remove();
			
			let output = "<table class='table'><thead>"
					   + "<tr><th>id</th><th>name</th><th>price</th>"
					   + "<th>description</th></tr></thead><tbody>"
			//서버에서 얻어온 데이터에서 셀렉터로 item 태그를 찾는다.
			$(data).find("item").each(function() {
			//each() : 반복하는 메소드로 item을 찾을 때마다 반복해서 아래 문장을 수행
			//6개의 item태그 중 현재 처리중인 item 태그를 this로 접근한다
			//$(this)를 사용하여 jQuery 객체를 생성한다.
				output += "<tr><td>"+$(this).prop("id")+"</td>"
				output += "<td>"+$(this).attr("name")+"</td>"
				output += "<td>"+$(this).find("price").text()+"</td>"
				output += "<td>"+$(this).find("description").text()+"</td></tr>"
			}); //each end
			/*
			$this.attr("id") : 속성 id의 값을 구해온다.
			$this.find("price") : price 태그를 찾는다.
			$this.find("price").text() : price 태그 사이의 값을 구해온다.
			$this.find("description") : description 태그를 찾는다.
			$this.find("description").text() : description 태그 사이 값을 구해온다.
			*/
			output += "</tbody></table>"
			$(".container").append(output);
		})
	})
})
</script>
</head>
<body>
  <div class="container">
    <button class="btn btn-info">XML형식으로 데이터 가져온다.</button>
  </div>
</body>
</html>