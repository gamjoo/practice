package Homework_package;

public class Homework_240124_3 {
	public static void main(String[] args) {
		
		String jumin = "123456-4123456";
	
		for (int i=0; i<jumin.length(); i++) {
			char ch = jumin.charAt(i);
			System.out.println("index"+i+" 문자 = "+ch);
		}
		
		if (jumin.charAt(7)==('1'))
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 남자입니다.");
		else if (jumin.charAt(7)==('3'))
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 남자입니다.");
		else if (jumin.charAt(7)==('2'))
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 여자입니다.");
		else if (jumin.charAt(7)==('4'))
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 여자입니다.");
		else
			System.out.println("추출한 숫자는 "+jumin.charAt(7)+"이고 외국인입니다.");
	}
}