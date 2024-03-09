package ex11_1_String_test2;

public class StringExample1_method_2 {

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

	public static void main(String[] args) {
		String jumin = "123456-1912322";
		print(jumin);
	}

//객체 생성 없이 사용하려면 static 붙여야 한다.
	private static void print(String jumin) {
		String message = "주민등록번호는 14자리 입니다.";
		if (check_length(jumin)) {
			if (check_hyphen(jumin)) {
				message = pandan_gender(jumin) + " 입니다.";
			} else {
				message = "-을 넣어주세요";
			}
		}

		System.out.println(message);
	}

	private static boolean check_hyphen(String jumin) {
		return jumin.substring(6, 7).equals("-");
	}

}