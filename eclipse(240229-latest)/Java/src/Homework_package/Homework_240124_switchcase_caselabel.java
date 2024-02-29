package Homework_package;

public class Homework_240124_switchcase_caselabel {
	public static void main(String[] args) {
		
		String jumin = "123456-4123456";
		
		for (int i=0; i<jumin.length(); i++) {
			char ch = jumin.charAt(i);
			System.out.println("index"+i+" 문자 = "+ch);
		}
		
		switch (jumin.substring(7,8)) {
		case "1", "3" :
			System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 남자입니다.");
			break;
		case "2", "4" :
			System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 여자입니다.");
			break;
		default :
			System.out.println("추출한 숫자는 "+jumin.substring(7,8)+"이고 외국인입니다.");
		}
	}
}