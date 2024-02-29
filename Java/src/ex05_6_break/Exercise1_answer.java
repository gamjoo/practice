package ex05_6_break;

import java.util.Scanner;

public class Exercise1_answer {
	public static void main(String args[]) {
		System.out.println("두 수와 연산자(+, -, *, /, % )를 입력하세요~");
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("수1>");
			int su1 = sc.nextInt();
			
			System.out.print("수2>");
			int su2 = sc.nextInt();
			
			System.out.print("연산자>");
			String op = sc.next();
			int result=0;
			
			switch (op) {
			case "+" :
				result = su1 + su2;
				break;
			case "-" :
				result = su1 - su2;
				break;
			case "*" :
				result = su1 * su2;
				break;
			case "/" :
				result = su1 / su2;
				break;
			case "%" :
				result = su1 % su2;
				break;
			}
			
			
			System.out.println(su1 + op + su2 + "=" +result);
			
			System.out.println("계속 입력하시겠습니까?(N(n)이면 종료)");
			System.out.print("계속입력>");
			String yesno = sc.next();
			if (yesno.equals("N") || yesno.equals("n"));
				break; //Q : 여기 break는 왜 필요한 걸까..??
					   //A : 야 break가 걸려 있어야 반복문 블럭에서 탈출할 거 아녀
			
		} while (true);
		
		sc.close();

	}
}
