function check() {
	var id = document.getElementById("id");
	if (id.value.trim() == "") {
		alert("ID를 입력하세요");
		id.focus();
		return false;
	}
	
	var pass = document.getElementById("pass");
	if (pass.value.trim() == "") {
		alert("비밀번호를 입력하세요");
		pass.focus();
		return false;
	}
	
	var jumin1 = document.getElementById("jumin1")
	if (jumin1.value.trim() == "") {
		alert("주민번호 앞자리를 입력하세요");
		jumin1.focus();
		return false;
	}
	
	//주민번호 앞자리 6자리 유효성 검사 - 일부분만 입력한 경우가 있어 체크한다.
	if (jumin1.value.length != 6) {
		alert("주민번호 앞자리 6자리를 입력하세요");
		jumin1.value = "";
		jumin1.focus();
		return false;
	}
	
	var jumin2 = document.getElementById("jumin2")
	if (jumin2.value.trim() == "") {
		alert("주민번호 뒷자리를 입력하세요");
		jumin2.focus();
		return false;
	}
	
	var email = document.getElementById("email")
	if (email.value.trim() == "") {
		alert("이메일을 입력하세요");
		email.focus();
		return false;
	}
	
	var domain = document.getElementById("domain")
	if (domain.value.trim() == "") {
		alert("도메인을 입력하세요");
		domain.focus();
		return false;
	}
	
	//라디오 버튼 선택 유효성 검사
	var gender1 = document.getElementById("gender1");
	var gender2 = document.getElementById("gender2");
	if (gender1.checked == false && gender2.checked==false) {
		alert("남, 여 중에서 1개를 선택하세요");
		return false;
	}
	
	//취미를 2개 이상 체크하도록 하는 유효성 검사
	var cnt = 0;
	var hobbys = document.getElementsByName("hobby");
	for (var i=0; i<hobbys.length; i++) {
		if(hobbys[i].checked)
			cnt++;
	}
	if(cnt<2) {
		alert("2개 이상 취미를 선택하세요")
		return false;
	}
	
	//우편번호 공백 유효성 검사
	var post1 = document.getElementById("post1");
	if (post1.value.trim() == "") {
		alert("우편번호를 입력하세요");
		post1.focus();
		return false;
	}
	
	var address = document.getElementById("address");
	if (address.value.trim() == "") {
		alert("주소를 입력하세요");
		address.focus();
		return false;
	}
	
	var intro = document.getElementById("intro");
	if (intro.value.trim() == "") {
		alert("자기소개를 입력하세요");
		intro.focus();
		return false;
	}
	
/*	var gender = document.querySelectorAll("input[name=gender]");
	if (gender[0].checked == false && gender[1].checked == false) {
		alert("성별을 선택하세요");
		return false;
	}
	
	var hobby = document.querySelectorAll("input[name=hobby]");
	var count = 0;
	
	for (i=0; i<hobby.length; i++) {
		if(hobby[i].checked == false) {
			count++;
	}
	
	if (count >=4) {
		alert("취미를 2개 이상 입력하세요");
		return false;
	} 
*/	
		
	}
	


function idcheck() {
	var id = document.getElementById("id");
	if (id.value.trim() == "") {
		alert("ID를 입력하세요");
		id.focus();
	} else {
		
		var pattern = /^[A-Z][a-zA-Z_0-9]{3,}$/;
		
		if (pattern.test(id.value)) {
		//	var ref = "idcheck.html?id=" + id.value;
			var ref = `idcheck.html?id=${id.value}`;
			window.open(ref, "", "width=300, height=250")
		} else {
			alert("첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개 이상이어야 합니다")
			id.value = "";
			id.focus();
		}
	}
}
	
/*	var id = document.getElementById("id");
	if(id.value.trim() == ""){
		alert("ID를 입력하세요");
		id.focus();
	} else {
		var reg = /^[A-Z]([A-Z|a-z|0-9|_-]){3}$/;
		var pandan = reg.test(id.value);
		if (!pandan) {
			alert("첫글자는 대문자이고 두번째부터는 대소문자,숫자,_로 총 4개 이상이어야 합니다")
			id.focus();
		} else {
		var ref = "idcheck.html?id=" + id.value;
		window.open(ref, "", "width=300, height=250");
		}
	} */


function move() {
	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");
	
	if(jumin1.value.trim().length==6) {
		var pattern = /^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/
		if (pattern.test(jumin1.value)) {
			jumin2.focus();
		} else {
			alert("숫자 또는 형식에 맞게 입력하세요");
			jumin1.value = "";
			jumin1.focus();
		}
	}
	
	if (jumin2.value.trim().length==7) {
		pattern = /^[1234][0-9]{6}$/;
		if (pattern.test(jumin2.value)) {
			var c = Number(jumin2.value.substring(0,1));
			var index = (c - 1) % 2 //c=1 || c=3 => index=0 => 1 => "gender1"
									//c=2 || c=4 => index=1 => 2 => "gender2"
			var gender = document.getElementById("gender"+(index+1));
			
			gender.checked = true;
		} else {
			alert("주민번호 뒷자리 형식에 맞지 않습니다");
			jumin2.value = "";
			jumin2.focus();
		}
	}
}	
/*	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");
	var gender1 = document.getElementById("gender1");
	var gender2 = document.getElementById("gender2");
	
	var reg1 = /^[0-9]{2}(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])$/;
	var reg2 = /^[1234][0-9]{6}$/;
	
	if(jumin1.value.length == 6) {
		if(!reg1.test(jumin1.value)) {
			alert("주민번호 앞자리 형식에 맞지 않습니다");
			jumin1.value = "";
			jumin1.foucus();
		}
	}
	
	if(jumin2.value.length == 7) {
		if(!reg2.test(jumin2.value)) {
			alert("주민번호 앞자리 형식에 맞지 않습니다");
			jumin2.value = "";
			jumin2.focus();
		}
	}
}
	if (!reg2.test(jumin2.value)) {
			alert("주민번호 뒷자리 형식에 맞지 않습니다");
			jumin2.value = "";
			jumin2.focus();
	} else {
		var test = jumin2.substr(1,1);
		if (test == "1" || test == "3"); {
			gender1.checked() = true;
		} if (test == "2" || test == "4") {
			gender2.checked() = true;
		}
	}
		}
		
*/
	


function domain1() {
	var sel = document.getElementById("sel");
	var domain = document.getElementById("domain");
	if (sel.value == "") {
		domain.readOnly = false;
		domain.value = "";
		domain.focus();
	} else {
		domain.readOnly = true;
		domain.value = sel.value;
	}
}

function post() {
	window.open("post.html", "post", "width=400, height=500");
}