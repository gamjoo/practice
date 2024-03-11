package ex05_1_if;

public class IFExample3_1 {
	public static void main(String args[]) {
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
		
		if (num1 > num2) {  //if문 안에 if문 가능
			if (num1 > num3)
				System.out.println("num1이 제일 큽니다.");
			
		if (num1 > num2 && num1 >num3) {  //두 조건을 모두 만족
			System.out.println("num1이 제일 큽니다.");
		}
		}
	}

}
