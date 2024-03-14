<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<html>
<head>
<title>CSV(Comma Separated Values) 예제</title>
</head>
<body>
<script>
	let input = '홍 길동, 서울시, 25세\n';
	input    += '신사임당, 울산시, 45세';
	
	//한 줄씩 자른다.
	const inputs = input.split('\n');
	
	for (let i=0; i<inputs.length; i++) {
		//쉼표를 기준으로 자른다.
		const result = inputs[i].split(',');
		for (let j=0; j<result.length; j++) {
			document.body.innerHTML += result[j].trim()+"<br>";
		}
	}
</script>

</body>
</html>