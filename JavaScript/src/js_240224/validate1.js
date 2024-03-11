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
		gender1.focus();
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
		hobbys[0].focus();
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
	}

function idcheck() {
	var id = document.getElementById("id");
	if(id.value.trim() == ""){
		var answer = prompt("아이디를 입력하세요");
		id.value = answer;
		window.open("idcheck.html?id="+answer, "_blank", "width=300, height=250, location=yes");
	} else {
		var data = id.value;
		window.open("idcheck.html?id="+data, "_blank", "width=300, height=250, location=yes");
	}
}

function move() {
	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");
	if (isNaN(jumin1.value)) {
		alert("숫자를 입력하세요");
		jumin1.value="";
		jumin1.focus();
	}
	if (isNaN(jumin2.value)) {
		alert("숫자를 입력하세요");
		jumin2.value="";
		jumin2.focus();
	}
}

function domain1() {
	var sel = document.getElementById("sel");
	var domain = document.getElementById("domain");
	
	sel.addEventListener("change", show);
	
	function show() {
		domain.value = this.value;
	}
}

function post() {
	window.open("post.html", "_blank", "width=400, height=500, location=yes");
}