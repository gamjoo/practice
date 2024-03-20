$(document).ready(function() {
	let count=0;
	
	//submit 버튼 클릭할 때 이벤트 부분
	$("form[name=updateform]").submit(function() {

		//파일첨부를 변경하지 않으면 $('#filevalue').text()의 파일명을
		//파라미터 'check'라는 이름으로 form에 추가하여 전송한다.
		if (count==0) {
			const value = $('#filename').text();
			const html = "<input type='hidden' value='" + value + "' name='count'>";
			console.log(html);
			$(this).append(html);
		}
	});//submit end
	
	
	$("#upfile").change(function() {
		count++;
		console.log($(this).val()) //c:\fakepath\upload.png
		const inputfile = $(this).val().split('\\');
		$('#filename').text(inputfile[inputfile.length - 1]);
		console.log(count);
	});
	
})