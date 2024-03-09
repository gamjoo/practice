package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Operate06 {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner   sc =    new    Scanner(is);
		
		System.out.print("정수1를 입력 하세요>");
		int a = sc.nextInt();
		
		System.out.print("정수2를 입력 하세요>");
		int b = sc.nextInt();
		
		System.out.print("연산자(+)를 입력하세요>");
		String c = sc.next(); //next() : 키보드로부터 문자열의 값을 입력 받는 메서드
		
		if (c.equals("+")) { //String 비교는 ==아니라 .equals()
			System.out.println(a+"+"+b+"="+(a+b)); //우선순위
		} else {
			System.out.println("+를 입력하세요");
		}
		


		sc.close();


	}

}
