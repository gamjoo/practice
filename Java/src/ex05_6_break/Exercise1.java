/*
<문제>
두 수와 사칙연산 연산자를 입력하세요~
수1>100
수2>200
연산자>+
100+200=300
계속 입력하시겠습니까?(N(n)이면 종료. 그외 문자는 계속 입력 가능)
계속입력>y
수1>10
수2>20
연산자>*
10*20=200
계속 입력하시겠습니까?(N(n)이면 종료. 그외 문자는 계속 입력 가능)
계속입력>n
끝.
 */
package ex05_6_break;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수와 연산자(+, -, *, /, % )를 입력하세요~");

		
//		switch (cal) {
//			case "+" : 
//				System.out.println(num1+cal+num2+"="+(num1+num2));
//				break;
//			case "-" :
//				System.out.println(num1+cal+num2+"="+(num1-num2));
//				break;
//			case "*" :
//				System.out.println(num1+cal+num2+"="+(num1*num2));
//				break;
//			case "/" :
//				System.out.println(num1+cal+num2+"="+(num1/num2));
//				break;
//			case "%" :
//				System.out.println(num1+cal+num2+"="+(num1%num2));
//				break;
//
//		}
		
		String answer = "";
		
		do {

			System.out.print("수1>");
			int num1 = sc.nextInt();
			System.out.print("수2>");
			int num2 = sc.nextInt();
			System.out.print("연산자>");
			String cal = sc.next();
			
			switch (cal) {
		case "+" : 
			System.out.println(num1+cal+num2+"="+(num1+num2));
			break;
		case "-" :
			System.out.println(num1+cal+num2+"="+(num1-num2));
			break;
		case "*" :
			System.out.println(num1+cal+num2+"="+(num1*num2));
			break;
		case "/" :
			System.out.println(num1+cal+num2+"="+(num1/num2));
			break;
		case "%" :
			System.out.println(num1+cal+num2+"="+(num1%num2));
			break;

	}
			System.out.println("계속 입력하시겠습니까?(N(n)이면 종료. 그외 문자는 계속 입력 가능)");
			System.out.print("계속입력>");
			answer = sc.next();
					
		} while (!(answer.equals("n") || answer.equals("N")));
		
		System.out.println("끝.");
			
		



		

	}

}
