package Homework_package;

public class Homework_240124_4 {
	public static void main(String[] args) {
		
		String jumin = "123456-4123456";
		
		for (int i=0; i<jumin.length(); i++) {
			char ch = jumin.charAt(i);
			System.out.println("index"+i+" 문자 = "+ch);
		}
		
		switch (jumin.charAt(7)) {
		case '1' :
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 남자입니다.");
			break;
		case '2' :
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 여자입니다.");
			break;
		case '3' :
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 남자입니다.");
			break;
		case '4' :
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 여자입니다.");
			break;
		default :
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 외국인입니다.");
		}
	}
}