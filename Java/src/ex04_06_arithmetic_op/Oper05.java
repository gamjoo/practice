package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper05 {
	
	public static void main(String[] args) {

		InputStream is = System.in;
		Scanner   sc =    new    Scanner(is);
		
		System.out.print("정수를 입력 하세요>");
		int n = sc.nextInt();
		
		int data = n;
		int pandan = n % 3;
		
		if (pandan == 0) {
			System.out.println(data + "(은)는 3의 배수입니다.");
		} else {
			System.out.println(data + "(은)는 3의 배수가 아닙니다");
		}

		sc.close();
		
//	강사님 답안
//		if(n % 3 == 0) {
//		System.out.println(n+"은(는) 3의 배수입니다.");
//	} else {
//		System.out.println(n+"은(는) 3의 배수가 아닙니다.");
//		}
}
	}