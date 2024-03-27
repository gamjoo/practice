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
			cache : false,
			success : function(rdata) {
			let i = 0;
			$(rdata.item).each(function() {
			let subject = rdata.item.at(i)
		
			$("div").append("<h1>책 제목 : '"+subject.title+"'</h1>")
			$("div").append("<img src='"+subject.cover+"'>")
			$("div").append("<h4>지은이 : '"+subject.author+"'</h3>")
			$("div").append("<h4>카테고리분류 : '"+subject.categoryName+"'</h3>")
			$("div").append("<h4>개요 : '"+subject.description+"'</h3>")
			$("div").append("<h4>출간일 : '"+subject.pubDate+"'</h4><br><br>")
			i++;
			})//each end
			
			} //success end
		})//ajax end
		

	</script>
	<div></div>
</body>
</html>


