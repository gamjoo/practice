<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.js"></script>
<body>
  <script>
  var answer = prompt("책 제목을 입력하세요");
		
		console.log(answer);
		var url = "http://www.aladin.co.kr/ttb/api/ItemSearch.aspx?ttbkey=ttbyyy24941308001"
				+ "&Query="+ answer + "&QueryType=Title&MaxResults=10&Cover=Big&start=1&SearchTarget=Book&output=JS&Version=20131101";
		console.log(url);
		
		$.ajax({
			url : "http://www.aladin.co.kr/ttb/api/ItemSearch.aspx",
			data : {"ttbkey" : "ttbyyy24941308001",
				    "Query" : answer,
				    "QueryType" : "Title",
				    "SearchTarget" : "Book",
				    "start" : "1",
				    "MaxResults" : "20",
				    "Sort" : "Title",
				    "Cover" : "Big",
				    "output" : "JS",
				    "Version" : "20131101"},
			dataType : "json",
			success : function(rdata) {
			let i = 0;
			$(rdata.item).each(function() {
			let subject = rdata.item.at(i)
		
			$("div").append("<h1>책 제목은 '"+subject.title+"' 입니다.<h1>")
			$("div").append("<img src='"+subject.cover+"'>")
			$("div").append("<h3>지은이는 '"+subject.author+"' 입니다.</h3>")
			$("div").append("<h3>카테고리분류는 '"+subject.categoryName+"' 입니다.</h3>")
			$("div").append("<h3>개요는 '"+subject.description+"' 입니다.</h3>")
			$("div").append("<h3>출간일은 '"+subject.pubDate+"' 입니다.</h3>")
					
			i++;
			})//each end
			
			} //success end
		})//ajax end
		

	</script>
	<div></div>
</body>
</html>


