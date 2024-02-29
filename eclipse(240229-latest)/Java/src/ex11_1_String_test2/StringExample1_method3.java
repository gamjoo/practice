package ex11_1_String_test2;

public class StringExample1_method3 {

	static boolean check_length(String jumin) {
		return jumin.length() == 14;
	}

	static String pandan_gender(String jumin) {
		String value = switch (jumin.substring(7, 8)) {
		case "1", "3" -> "남자";
		case "2", "4" -> "여자";
		default -> "외국인";
		};

		return value;
	}

	private static boolean check_hyphen(String jumin) {
		return jumin.substring(6, 7).equals("-");
	}

	private static int isNumber(String jumin) {
		int index = -1;

		for (int i = 0; i < jumin.length(); i++) {
			if (i == 6)
				continue;
			char ch = jumin.charAt(i);
			if (ch < '0' || ch > '9') {
				index = i;
				break;
			}
		}
		return index;

	}

	private static String isNumber_Message(String jumin) {
		int index = isNumber(jumin);
		String message = "";
		if (index >= 0 && index <= 5) {
			message = "주민번호 앞자리를 숫자로 입력하세요";
		} else if (index >= 7 && index <= 13) {
			message = "주민번호 뒷자리를 숫자로 입력하세요";
		} else if (index == -1) {
			message = pandan_gender(jumin) + "입니다.";
		}

		return message;
	}

//객체 생성 없이 사용하려면 static 붙여야 한다.
	private static void print(String jumin) {
		String message = "주민등록번호는 14자리 입니다.";
		if (check_length(jumin)) {
			if (check_hyphen(jumin)) {
				message = isNumber_Message(jumin);
			} else {
				message = "-을 넣어주세요";
			}
		}

		System.out.println(message);
	}

	public static void main(String[] args) {
		String jumin = "1234a6-1466311";
		print(jumin);
	}

}