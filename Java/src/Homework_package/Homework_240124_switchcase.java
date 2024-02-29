package Homework_package;

public class Homework_240124_switchcase {
	public static void main(String[] args) {

		String jumin = "123456-4123456";

		for (int i = 0; i < jumin.length(); i++) {
			char ch = jumin.charAt(i);
			System.out.println("index" + i + " 문자 = " + ch);
		}

		String result = switch (jumin.substring(7, 8)) {
		case "1", "3" -> "남자";

		case "2", "4" -> "여자";

		default -> "외국인";
		}; // 반드시 세미콜론 작성해야 한다.

		System.out.print(result);
	}
}