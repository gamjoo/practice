<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>JSON 이용하기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<style>
 #error{color:green}
 #com{color:blue}
</style>
<script>
/*
$.ajax(object)
 ①url : 요청 전송 url,
 ②type : 전송 방식(get(기본) 또는 post),
 ③data : 전송할 자료들,
 ④cache : false를 설정하면 jQuery는 Ajax 요청에 대해 브라우저의 캐시를 사용하지 않도록 한다.
          이렇게 하면 매번 서버로부터 최신 데이터를 가져오며, 캐시된 응답을 사용하지 않는다.
 ⑤dataType : return data의 Type(에이잭스 성공 후 돌려받은 자료의 형 정의-"json","xml","html"),
 ⑥success : HTTP 요청이 성공한 경우 실행할 함수 정의,
 ⑦error : HTTP 요청이 실패한 경우 실행할 함수 정의,
 ⑧complete : 요청의 실패, 성공과 상관 없이 완료 될 경우 실행할 함수 정의
*/

$(function() {
  $("button").click(function () { //버튼을 클릭하면
	  //기존 데이터가 있는 요소를 제거한다.
	  $("table").remove(); //table 요소 제거한다.
	  $(".container div").remove() //div 요소 제거한다.
	  
	  $.ajax({
		  url : "item_error.json", //요청 전송 rul
		 // url : 'item.json', //요청 전송 url
		  dataType : "json", //return data의 Type(에이잭스 성공 후 돌려받은 자료 형 정의)
		  cache : false, //브라우저 캐시 값이 아닌 현재 데이터를 받아오도록 한다.
		  success : function(rdata) { //HTTP 요청이 성공한 경우 실행할 함수 정의(이벤트 핸들러)
									  //rdata는 서버에서 보낸 데이터이다.
		  if (rdata.length>0) { 
      	  let output = "<table class=table><thead><tr><th>id</th>"
      	  			 + "<th>name</th><th>price</th>"
      	  			 + "<th>description</th></tr></thead><tbody>";
      	  $(rdata).each(function(index,item) {
      	    output += "<tr><td>" + this.id + "</td>"
      	           + "<td>" + this.name + "</td>"
      	           + "<td>" + this.price + "</td>"
      	           + "<td>" + this.description + "</td></tr>"
      	  }) //each end
      	  	output += "</tbody></table>";
      	  	$("button").after(output); //button의 다음 형제요소로 output이 생성된다.
        	} else {
      	  	$("button").after("<div>요청한 데이터가 없습니다.</div>")
        	}
	 	},//success end
		  error : function(request, status, error){
			  $(".container").append("<div id='error'>code :"
					  + request.status + "<br>"
					  + "받은 데이터 :" + request.responseText + "<br>"
					  + "error status : " + status + "<br>"
					  + "error 메시지 : " + error + "</div>");
		  },
		  complete : function(){ //요청의 실패, 성공과 상관 없이 완료될 경우 호출
			  $(".container").append("<div id='com'>Ajax가 완료되었습니다.</div>");
		  	  console.log('ajax() - complete')
		  }
	  });//ajax end
	  
	  console.log('ajax() 뒤')
  });//click end
});//$(function() {}) end

</script>
</head>
<body>
  <div class="container">
    <button class="btn btn-info">JSON 데이터를 불러온다.</button>
  </div>
</body>
</html>