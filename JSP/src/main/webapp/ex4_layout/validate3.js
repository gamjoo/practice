$(document).ready(function() {
	$("#myform").submit(function() {
		
		//$.trim(문자열)은 문자열의 앞, 뒤 공백을 제거한다.
		const id = $("#id");
		if ($.trim(id.val()) == "") {
			alert("ID를 입력하세요");
			id.focus();
			return false;
		}
		
		const pass = $("#pass");
		if ($.trim(pass.val()) == "") {
			alert("비밀번호를 입력하세요");
			pass.focus();
			return false;
		}
		
		$("#jumin1").keyup(function () {
			const jumin1Value = $(this).val();
			if ($.trim(jumin1Value).length == 6) {
				const pattern = /^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/
				if (pattern.test(jumin1Value)) {
					$("#jumin2").focus();//주민번호 뒷자리로 포커스 이동
				} else {
					alert("숫자 또는 형식에 맞게 입력하세요[yymmdd]");
					$(this).val("").focus();
				}
			}
		})//$("#jumin1").keyup()
		
		$("#jumin2").keyup(function() {
			const jumin2Value = $(this).val();
			if ($.trim(jumin2Value).length == 7) {
				const pattern = /^[1234][0-9]{6}$/;
				if (pattern.test(jumin2Value)) {
					const c = Number(jumin2Value.substring(0,1));
					const index = (c-1)%2;
					$("input[type=radio]").eq(index).prop("checked", "true");
				} else {
					alert("숫자 또는 형식에 맞게 입력하세요[1234][0-9]{6}");
					$(this).val("").focus();
				}
			}
		}) //$("#jumin2").keyup()

/*		
		const jumin1 = $("#jumin1");
		const jumin2 = $("#jumin2");
		if ($.trim(jumin1.val()) == "") {
			alert("주민번호 앞자리를 입력하세요");
			jumin1.focus();
			return false;
		}	
		if ($.trim(jumin1.val()).length != 6) {
			alert("주민번호 앞자리는 6자리입니다.")
			jumin1.val("");
			jumin1.focus();
			return false;
		} else {
			const pat1 = /^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/
			if (pat1.test(jumin1.val())) {
				jumin2.focus();
				if ($.trim(jumin2.val()) == "") {
					alert("주민번호 뒷자리를 입력하세요");
					jumin2.focus();
					return false;
				} else if ($.trim(jumin2.val()).length == 7) {
					const pat2 = /^[1234][0-9]{6}$/;
					if (pat2.test(jumin2.val())) {
						let first = Number(jumin2.val().substring(0,1));
						console.log(first);
						let index = (first - 1) % 2 + 1;
						$("#gender"+index+"").prop("checked", "true");
					} else {
						alert("형식에 맞게 입력하세요[1234][0-9]{6}");
						jumin2.val("");
						jumin2.focus();
						return false;
					}
				}
			} else {
				alert("숫자 또는 형식에 맞게 입력하세요[yymmdd]");
				jumin1.val("");	
				jumin1.focus();
				return false;
			}
		}
		if ($.trim(jumin2.val()) == "") {
			alert("주민번호 뒷자리를 입력하세요");
			jumin2.focus();
			return false;
		}
		if (jumin2.val().length != 7) {
			alert("주민번호 뒷자리 7자리를 입력하세요")
			jumin2.val("");
			jumin2.focus();
			return false;
		}
*/		
		const email = $("#email");
		if ($.trim(email.val()) == "") {
			alert("이메일을 입력하세요");
			email.focus();
			return false;
		}
		
		const domain = $("#domain")
		if ($.trim(domain.val()) == "") {
			alert("도메인을 입력하세요");
			domain.focus();
			return false;
		}
		
		
		let cnt = $("input:radio:checked").length;
		if (cnt==0) {
			alert("성별을 선택하세요");
			return false;
		}
		
		cnt = $("input:checkbox:checked").length;
		if (cnt < 2) {
			alert("취미는 2개 이상 선택하세요");
			return false;
		}
		
		const post1 = $("#post1");
		if ($.trim(post1.val()) == "") {
			alert("우편번호를 입력하세요")
			post1.focus()
			return false;
		}
		
		if (!$.isNumeric(post1.val())) {
			alert("우편번호는 숫자만 입력 가능합니다.")
			post1.val("").focus()
			return false;
		}
		
		const address = $("#address")
		if ($.trim(address.val())=="") {
			alert("주소를 입력하세요");
			address.focus()
			return false;
		}
		
		const intro = $("#intro")
		if ($.trim(intro.val())=="") {
			alert("자기소개를 입력하세요");
			intro.focus()
			return false;
		}
	}) //submit() end
	
	$("#myform > fieldset > div:nth-child(3) > input[type=button]:nth-child(2)")
	.click(function () {
		
		const id = $("#id");
		const id_value = $.trim(id.val());
		if (id_value == "") {
			alert("ID를 입력 하세요");
			id.focus();
			return false;
		} else {
			// 첫글자는 대문자 두번째부터는 대소문자, 숫자, _로 총 4개 이상
			const pattern = /^[A-Z][a-zA-Z0-9_]{3,}$/;
			if (pattern.test(id_value)) {
				const ref = `idcheck.html?id=${id_value}`;
				window.open(ref, "idcheck", "width=350,height=200");
			} else {
				alert("첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개 이상이어야 합니다")
				id.val("").focus();
			}
		}
	}) //id중복검사 click 이벤트
	
	
	$("#postcode").click(function () {
		Postcode();
	}); //우편번호 검색 click 이벤트
	
	
	$("#sel").change(function() {
		const domain = $("#domain");
		if ($(this).val() == "") {
			domain.val("").focus(); //"직접입력" 선택한 경우
			domain.prop("readOnly", false);
		} else {	//도메인을 선택한 경우
			domain.val($(this).val());
			domain.prop("reanOnly", true);
		}
	})
	
	
	 function Postcode() {
        new daum.Postcode({
            oncomplete: function(data) {
            	console.log(data.zonecode)
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
 
                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수
 
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }
 
                
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                $("#post1").val(data.zonecode);
                $("#address").val(fullRoadAddr);
            }
        }).open();
    }//function Postcode()
	
}); //readey() end