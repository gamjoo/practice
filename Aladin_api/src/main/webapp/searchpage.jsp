<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	

/*
https:\/\/image.aladin.co.kr\/product\/33627\/6\/cover\/k272939215_1.jpg
*/

/*
$(function() {
	$('button').onclick(function() {
		var doc = document.getElementsByName("query")[0];
		console.log(doc);
		
		
		$.ajax({
			url = "http://www.aladin.co.kr/ttb/api/ItemSearch.aspx",
			type = "post",
			data = 
			dataType = "json",
			cache = false,
			success
			
		})
		
	})
	
})
function search() {
	var doc = document.getElementsByName("query")[0];
	var url1 = "http://www.aladin.co.kr/ttb/api/ItemSearch.aspx"
	
	var data = "ttbkey=ttbyyy24941308001&Query=" + doc + "&QueryType=Title&MaxResults=10&start=1&SearchTarget=Book&output=JS&CallBack=bookSearch&Version=20131101"

	$("div").load(url1, data)
}
*/
</script>
<body>
  <script>
  var answer = prompt("책 제목을 입력하세요");
		
		/*
		$.getJSON("http://www.aladin.co.kr/ttb/api/ItemSearch.aspx?ttbkey=ttbyyy24941308001&Query=행복&QueryType=Title&MaxResults=10&start=1&SearchTarget=Book&output=xml&Version=20131101",
				function(data, textStatus){
			console.log("data="+data)
			console.log("textStatus="+textStatus);
			console.log("JSON.stringify(data)="+JSON.stringify(data))
			
		})
		*/
		console.log(answer);
		var url = "http://www.aladin.co.kr/ttb/api/ItemSearch.aspx?ttbkey=ttbyyy24941308001"
				+ "&Query="+ answer + "&QueryType=Title&MaxResults=10&Cover=Big&start=1&SearchTarget=Book&output=JS&Version=20131101";
		console.log(url);
		
		$.ajax({
			url : "http://www.aladin.co.kr/ttb/api/ItemSearch.aspx",
			data : {"ttbkey" : "ttbyyy24941308001", "Query" : answer, "QueryType" : "Title",
				    "MaxResults" : "10", "Cover" : "Big", "start" : "1", "SearchTarget" : "Book", "output" : "JS", "Version" : "20131101"},
			dataType : "json",
			success : function(rdata) {
					console.log(rdata)
					console.log(rdata.item)
					const data = JSON.stringify(rdata.item);
					console.log(data);
					console.log(data[0].title);
				}
			})
		
		$("div").html("<img src='https:\/\/image.aladin.co.kr\/product\/33627\/6\/cover\/k272939215_1.jpg'>")
		$("div").append("<img src='https:\/\/image.aladin.co.kr\/product\/33511\/35\/cover\/k352938559_1.jpg'>")

	</script>
	<div></div>
</body>
</html>


