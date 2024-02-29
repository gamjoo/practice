package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;
//ctrl + shift + O (import를 쉽게)

public class Oper02_input {
	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을때 사용합니다.
		//InputStream java.lang.System.in
		InputStream is = System.in;
		
		//java.util.Scanner.Scanner(InputStream source)
//		클래스명  참조형변수  연산자    생성자호출
		Scanner   sc =    new    Scanner(is);
		
		//콘솔에서 "정수를 입력 하세요>" 다음에 커서를 위치하고 숫자 입력 후 엔터
		System.out.print("정수를 입력 하세요>");//정수를 읽어 변수 a에 저장
		int a = sc.nextInt();
		
		System.out.println("입력값은 " + a + "입니다.");
		
		System.out.print("정수를 입력 하세요>");
		int b = sc.nextInt();
		System.out.println("입력값은 " + b + "입니다.");
		
		sc.close();
	}

}
