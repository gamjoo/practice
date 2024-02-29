package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;
//ctrl + shift + O (import를 쉽게)

public class Oper02_input2 {
	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을때 사용합니다.
		//InputStream java.lang.System.in
		InputStream is = System.in;
		
		//java.util.Scanner.Scanner(InputStream source)
//		클래스명  참조형변수  연산자    생성자호출
		Scanner   sc =    new    Scanner(is);
		
//		내가 작성한 답안	
		System.out.print("두 정수를 입력 하세요>");//숫자 입력 후 공백 숫자 입력 후 엔터
		int a = sc.nextInt();//정수를 읽어 변수 a에 저장한다.
		int b = sc.nextInt();
		
		System.out.printf("%-5d + %5d = %d%n", a, b, a+b);
		System.out.printf("%-5d - %5d = %d%n", a, b, a-b);
		System.out.printf("%-5d * %5d = %d%n", a, b, a*b);
		System.out.printf("%-5d / %5d = %d%n", a, b, a/b);
		System.out.printf("%-5d %% %5d = %d%n", a, b, a%b);

//		System.out.println("입력값은 " + a + "입니다.");
//		System.out.println("입력값은 " + b + "입니다.");
		
//		답안
		int result = a + b;
		System.out.printf("%-5d + %5d = %-5d%n", a, b, result);
		
		result = a - b;
		System.out.printf("%-5d - %5d = %-5d%n", a, b, result);
		
		result = a * b;
		System.out.printf("%-5d * %5d = %-5d%n", a, b, result);
		
		result = a / b;
		System.out.printf("%-5d / %5d = %-5d%n", a, b, result);
		
		result = a % b;
		System.out.printf("%-5d %% %5d = %-5d%n", a, b, result);
		
		sc.close();
	}

}
