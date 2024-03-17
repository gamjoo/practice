<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>JSON 이용하기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<style>
 th,td {text-align:center}
</style>
<script>
$(function() {
  $("button").click(function () { //버튼을 클릭하면
	  //기존 데이터가 있는 요소를 제거한다.
	  $("table").remove()
	  $(".container div").remove() //div 요소 제거한다.
	  
	  $.ajax({
		  url : "${pageContext.request.contextPath}/get_dept_lib", //요청 전송 url
		  type : "post",
		  dataType : "json", //return data의 Type(에이잭스 성공 후 돌려받은 자료 형 정의)
		  cache : false, //브라우저 캐시 값이 아닌 현재 데이터를 받아오도록 한다.
		  success : function(rdata) {
			  console.log("성공" + rdata)
		  		$("button+div").remove()
		  		if(rdata.length>0) {
		  			let output = '<div id="result"><table class="table">'
		  			+ '<thead><tr><th>부서번호</th><th>부서명</th><th>지역</th></tr></thead>'
		  			+ '<tbody>';
					/*			  
					let output = "<table class='table'><thead><tr><th>부서번호</th><th>부서명</th><th>지역</th></thead><tbody>"
					  $(rdata).each(function () {
						output += "<tr><td>"+this.deptno+"</td><td>"+this.dname+"</td><td>"+this.loc+"</td></tr>";
					  })//$(rdata).each() end
					 output += "</tbody></table>"
					 output += "<div>과제를 해결했습니다!!</div>"
					 
					 $("body .container").append(output);
					*/
		  			$(rdata).each(function (index, item) {
		  				output += '<tr>'
		  				output += '<td>' + item.deptno + '</td>'
		  				output += '<td>' + item.dname + '</td>'
		  				output += '<td>' + item.loc + '</td>'
		  				output += '</tr>'
		  			}) //each end
		  			output += '</tbody></table></div>'
		  			$('.container').append(output)
		  		} else {
		  			$('.container').append('<div>데이터가 존재하지 않습니다.</div>')
		  		}
	  			},
			 	  },//success end
		  error : function(request, status, error){
			  $("body .container").append("<div id='error'>code :"
					  + request.status + "<br>"
					  + "받은 데이터 :" + request.responseText + "<br>"
					  + "error status : " + status + "<br>"
					  + "error 메시지 : " + error + "</div>");
		  },
		  complete : function(){} //요청의 실패, 성공과 상관 없이 완료될 경우 호출
	  });//ajax end
  });//click end
});//$(function() {}) end

</script>
</head>
<body>
  <div class="container">
    <button class="btn btn-info">라이브러리를 이용한 json 형식으로 dept내용 가져오기</button>
  </div>
</body>
</html>